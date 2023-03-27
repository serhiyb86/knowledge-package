<html>
<head>
    <title>List K-PACs</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/script/codebase/suite.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/script/codebase/suite.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/css.css">
</head>
<body>
<div id="layout" style="height: 100%;"></div>

<script>
    let dataset = ${kpacs};
    let contextPath = "${pageContext.request.contextPath}";
    let setId = "${setId}";
    let setTitle = "${setTitle}";

    const toolbarData = [
        {
            id: "add",
            type: "button",
            circle: true,
            value: "Add a new row",
            size: "small",
            icon: "mdi mdi-plus",
            full: true
        },
        {
            id: "sets",
            type: "button",
            circle: true,
            value: "K-Pac sets",
            size: "small",
            icon: "mdi mdi-plus",
            full: true
        },
        {
            id: "home",
            type: "button",
            circle: true,
            value: "Home",
            size: "small",
            icon: "mdi mdi-plus",
            full: true
        }
    ];

    const createFormConfig = {
        padding: 0,
        rows: [
            {
                id: "id",
                type: "input",
                name: "id",
                hidden: true
            },
            {
                type: "input",
                name: "kpacSetId",
                label: "Set ID"
            },
            {
                type: "input",
                name: "title",
                label: "Title"
            },
            {
                type: "input",
                name: "description",
                label: "Description"
            },
            {
                type: "datepicker",
                name: "creationDate",
                label: "Publication date",
                dateFormat: "%d-%m-%Y"
            },
            {
                align: "end",
                cols: [
                    {
                        id: "apply-button",
                        type: "button",
                        text: "Apply",
                        icon: "mdi mdi-check",
                        circle: true,
                    }
                ]
            }

        ]
    }
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/script/script.js"></script>

<%--<!-- styles for "Edit" and "Delete" buttons -->--%>
<%--<style>--%>
<%--    body {--%>
<%--        margin: 0;--%>
<%--    }--%>

<%--    .action-buttons {--%>
<%--        display: flex;--%>
<%--        justify-content: space-evenly;--%>
<%--        width: 100%;--%>
<%--    }--%>

<%--    .dhx_demo-grid .edit-button {--%>
<%--        cursor: pointer;--%>
<%--        color: #0288d1;--%>
<%--    }--%>

<%--    .dhx_demo-grid .remove-button {--%>
<%--        cursor: pointer;--%>
<%--        color: red;--%>
<%--    }--%>
<%--</style>--%>

<%--<!-- css template for DHTMLX Toolbar -->--%>
<%--<!-- the latest version is available here: https://snippet.dhtmlx.com/toolbar_template_a -->--%>
<%--<!-- you can find more css templates here: https://dhtmlx.com/docs/products/dhtmlxSuite/styling -->--%>
<%--<style>--%>
<%--    .toolbar_template_a.dhx_toolbar {--%>
<%--        background-color: #000;--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_navbar .dhx_button .dhx_button__icon {--%>
<%--        color: #fff;--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_navbar .dhx_button.dhx_button--color_secondary .dhx_button__icon {--%>
<%--        color: rgba(255, 255, 255, 0.5);--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_button--view_link.dhx_button--color_secondary:focus,--%>
<%--    .toolbar_template_a.dhx_toolbar .dhx_button--view_link.dhx_button--color_secondary:hover {--%>
<%--        background-color: rgba(223, 223, 223, 0.25);--%>
<%--    }--%>


<%--    .toolbar_template_a.dhx_toolbar .dhx_button--view_link.dhx_button--color_secondary:active {--%>
<%--        background-color: rgba(223, 223, 223, 0.15);--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_toolbar-button {--%>
<%--        color: #fff;--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_toolbar-button:hover,--%>
<%--    .toolbar_template_a.dhx_toolbar .dhx_toolbar-button:focus {--%>
<%--        background-color: rgba(223, 223, 223, 0.2);--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_toolbar-button:active {--%>
<%--        background-color: rgba(223, 223, 223, 0.15);--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_toolbar-button .dhx_toolbar-button__icon,--%>
<%--    .toolbar_template_a.dhx_toolbar .dhx_toolbar-button .dhx_toolbar-button__caret {--%>
<%--        color: rgba(255, 255, 255, 0.5);--%>
<%--    }--%>

<%--    .toolbar_template_a .dhx_toolbar-button--active,--%>
<%--    .toolbar_template_a .dhx_toolbar-button:active {--%>
<%--        background-color: rgba(255, 255, 255, 0.2);--%>
<%--    }--%>

<%--    .toolbar_template_a .dhx_toolbar-button--disabled *,--%>
<%--    .toolbar_template_a dhx_toolbar-button:disabled * {--%>
<%--        color: rgb(255, 255, 255, 0.5);--%>
<%--    }--%>

<%--    .toolbar_template_a .dhx_toolbar-button--disabled:hover,--%>
<%--    .toolbar_template_a .dhx_toolbar-button:disabled:hover {--%>
<%--        background-color: transparent;--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_toolbar__item--separator {--%>
<%--        background: rgba(255, 255, 255, 0.3);--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_form-group .dhx_input {--%>
<%--        color: #fff;--%>
<%--        -webkit-box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.4);--%>
<%--        box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.4);--%>
<%--        background-color: transparent;--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_form-group .dhx_input::-webkit-input-placeholder {--%>
<%--        color: rgba(255, 255, 255, 0.7);--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_form-group .dhx_input::-moz-placeholder {--%>
<%--        color: rgba(255, 255, 255, 0.7);--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_form-group .dhx_input:-ms-input-placeholder {--%>
<%--        color: rgba(255, 255, 255, 0.7);--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_form-group .dhx_input::-ms-input-placeholder {--%>
<%--        color: rgba(255, 255, 255, 0.7);--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_form-group .dhx_input::placeholder {--%>
<%--        color: rgba(255, 255, 255, 0.7);--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_form-group .dhx_input:focus {--%>
<%--        -webkit-box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.6);--%>
<%--        box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.6);--%>
<%--    }--%>

<%--    .toolbar_template_a.dhx_toolbar .dhx_toolbar-button-image {--%>
<%--        background-color: #000;--%>
<%--    }--%>

<%--    .toolbar_template_a--context-menu .dhx_menu {--%>
<%--        background-color: #30333d;--%>
<%--    }--%>

<%--    .toolbar_template_a--context-menu .dhx_menu-button {--%>
<%--        color: #fff;--%>
<%--    }--%>

<%--    .toolbar_template_a--context-menu .dhx_menu-button:hover:not(:disabled) {--%>
<%--        background-color: rgba(0, 0, 0, 0.07);--%>
<%--    }--%>

<%--    .toolbar_template_a--context-menu .dhx_menu-button--active:not(:disabled),--%>
<%--    .toolbar_template_a--context-menu .dhx_menu-button:active:not(:disabled),--%>
<%--    .toolbar_template_a--context-menu .dhx_menu-button:focus:not(:disabled) {--%>
<%--        color: #65a6e7;--%>
<%--        background-color: rgba(0, 0, 0, 0.15);--%>
<%--    }--%>

<%--    .toolbar_template_a--context-menu .dhx_menu-button--active:not(:disabled) .dhx_menu-button__icon,--%>
<%--    .toolbar_template_a--context-menu .dhx_menu-button:active:not(:disabled) .dhx_menu-button__icon,--%>
<%--    .toolbar_template_a--context-menu .dhx_menu-button:focus:not(:disabled) .dhx_menu-button__icon {--%>
<%--        color: inherit;--%>
<%--    }--%>

<%--    .toolbar_template_a--context-menu .dhx_menu-button__icon {--%>
<%--        color: rgba(255, 255, 255, 0.7);--%>
<%--    }--%>
<%--</style>--%>

<%--<style>--%>
<%--    #sets {--%>
<%--        background-color: magenta;--%>
<%--    }--%>

<%--    #home {--%>
<%--        background-color: #00ff22;--%>
<%--    }--%>

<%--</style>--%>




</body>
</html>
