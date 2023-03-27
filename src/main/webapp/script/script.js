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
let toolbarTitle = function () {
    if (setId.length > 0 && setTitle.length > 0) {
        toolbar.data.add({
            id: "kpacs",
            type: "button",
            circle: true,
            value: "All K-Pacs",
            size: "small",
            icon: "mdi mdi-plus",
            full: true
        });
        return "List K-Pacs for K-Pac set #"+setId+" "+"\"" + setTitle + "\".";
    } else {
        return "List of all K-Pacs!";
    }

};
toolbar.data.add({
    type: "title",
    value: toolbarTitle()
});

// assign the handler to the Click event of the button with the id="add"
// pressing the Add button will add a new item to the grid and open the form for editing this item
toolbar.events.on("click", function (id) {
    if (id === "add") {
        const newId = grid.data.add({
            idKPac: "",
            description: "",
            title: "",
            creationDate: ""
        });
        openEditor(newId);
    }
    if (id === "sets") {
        window.location.href = contextPath + "/sets";
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
        {maxWidth: 150, id: "idKPac", header: [{text: "Id"}, {content: "inputFilter"}]},
        {id: "title", header: [{text: "Title"}, {content: "inputFilter"}]},
        {id: "description", header: [{text: "Description"}, {content: "inputFilter"}]},
        {
            maxWidth: 150,
            id: "creationDate",
            header: [{text: "Date of creation"}, {content: "inputFilter"}],
            type: "date",
            dateFormat: "%d-%m-%Y",
            align: "left"
        },
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
                const id = data.row.idKPac;
                    fetch(contextPath + '/kpac?kpacId=' + id, {
                        method: 'DELETE'
                    }).then(response=>{
                        if (response.status === 204) {
                            alert("K-Pac #" + id + " was removed successfully!");
                            grid.data.remove(data.row.id);
                        }
                        else {
                            alert("K-Pac #" + id + " was not removed successfully!\n" + response);
                        }
                    })
            }
        }
    }
});


const editWindow = new dhx.Window({
    width: 440,
    height: 450,
    modal: true
});


const editForm = new dhx.Form(null, createFormConfig);

editForm.getItem("apply-button").events.on("click", function () {
    const newData = editForm.getValue();
    console.log(newData);

    let xhr = new XMLHttpRequest();
    xhr.open("POST", contextPath+"/kpac");
    xhr.setRequestHeader("Accept", "application/json");
    xhr.setRequestHeader("Content-Type", "application/json");
    let response;
    xhr.onerror = () => alert(this.responseText);
    xhr.send(JSON.stringify(newData));
    xhr.onload = function () {
        response = JSON.parse(this.responseText);
        console.log(response);
        alert("K-PAC record #" + response.idKPac + " was created!");
        newData.idKPac = response.idKPac;
        grid.data.update(newData.id, {...newData});
        grid.scrollTo(newData.id, "title");
        closeEditor();
        //clear new line if needed
        if (setId.length > 0 && setId !== newData.kpacSetId) {
            grid.data.remove(newData.id)
        }
    };
});

function openEditor(id) {
    editWindow.show();
    const item = grid.data.getItem(id);
    if (item) {
        item.kpacSetId = setId;
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

