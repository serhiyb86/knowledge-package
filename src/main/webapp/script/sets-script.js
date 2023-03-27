console.log(dataset);
// Layout initialization
const layout = new dhx.Layout("layout", {
    cols: [
        {
            rows: [
                {
                    id: "toolbar",
                    height: "content"
                },
                {
                    type: "space",
                    rows: [
                        {
                            id: "grid"
                        }
                    ]
                }
            ]
        }
    ]
});

// Toolbar initialization
const toolbar = new dhx.Toolbar(null, {
    css: "toolbar_template_a"
});
// loading structure into Toolbar
toolbar.data.parse(toolbarData);

toolbar.events.on("click", function (id) {
    if (id === "add") {
        const newId = grid.data.add({
            setId: "",
            title: ""
        });
        openEditor(newId);
    }
    if (id === "home") {
        window.location.href = contextPath;
    }
    if (id === "kpacs") {
        window.location.href = contextPath + "/kpacs";
    }
});
//  You can filter grid data by the specified criteria with the help of the filter() method of data collection
const grid = new dhx.Grid("grid", {
    columns: [
        {maxWidth: 150, id: "setId", header: [{text: "Id"}, {content: "inputFilter"}]},
        {id: "title", header: [{text: "Title"}, {content: "inputFilter"}]},
        {
            maxWidth: 150, id: "action", gravity: 1.5, header: [{text: "Actions", align: "center"}],
            htmlEnable: true, align: "center",
            template: function () {
                return "<span class='action-buttons'><a class='remove-button' style='color: brown'>Delete</a></span>"
            }
        }
    ],
    data: dataset,
    resizable: true,
    autoHeight: true,
    selection: "row",
    autoWidth: true,
    eventHandlers: {
        onclick: {
            "remove-button": function (e, data) {
                const id = data.row.setId;
                fetch(contextPath + '/set?setId=' + id, {
                    method: 'DELETE'
                }).then(response=>{
                    if (response.status === 204) {
                        alert("K-Pac set #" + id + " was removed successfully!");
                        grid.data.remove(data.row.id);
                    }
                    else {
                        alert("K-Pac set #" + id + " was not removed successfully!\n" + response);
                    }
                })
            }
        }
    }
});


const editWindow = new dhx.Window({
    width: 800,
    height: 1200,
    modal: true
});


const editForm = new dhx.Form(null, createFormConfig);

editForm.getItem("apply-button").events.on("click", function () {
    const newData = editForm.getValue();
    console.log(newData);

    let xhr = new XMLHttpRequest();
    xhr.open("POST", contextPath+"/set");
    xhr.setRequestHeader("Accept", "application/json");
    xhr.setRequestHeader("Content-Type", "application/json");
    let response;
    xhr.onerror = () => alert(this.responseText);
    xhr.send(JSON.stringify(newData));
    xhr.onload = function () {
        response = JSON.parse(this.responseText);
        console.log(response);
        alert("K-PAC set record #" + response.setId + " was created!");
        newData.setId = response.setId;
        grid.data.update(newData.id, {...newData});
        grid.scrollTo(newData.id, "title");
        closeEditor();
    };
});

function openEditor(id) {
    editWindow.show();
    const item = grid.data.getItem(id);
    if (item) {
        editForm.setValue(item);
    }
}


function closeEditor() {
    editForm.clear();
    editWindow.hide();
}

// attaching widgets to Layout cells
layout.getCell("toolbar").attach(toolbar);
layout.getCell("grid").attach(grid);

// attaching Form to Window
editWindow.attach(editForm);

