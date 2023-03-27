<html>
<head>
    <title>List Setss</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/script/codebase/suite.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/script/codebase/suite.css">
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/css.css">--%>
</head>
<body>
<div id="layout" style="height: 100%;"></div>

<script>
    let dataset = ${sets};
    let contextPath = "${pageContext.request.contextPath}";

    const toolbarData = [
        {
            id: "add",
            type: "button",
            circle: true,
            value: "Add a new set",
            size: "small",
            icon: "mdi mdi-plus",
            full: true
        },
        {
            id: "kpacs",
            type: "button",
            circle: true,
            value: "All K-Pacs",
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
        },
        {
            type: "title",
            value: "All Sets list"
        }
    ];

    const createFormConfig = {
        padding: 0,
        rows: [
            {
                type: "input",
                name: "title",
                label: "Title"
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
<script type="text/javascript" src="${pageContext.request.contextPath}/script/sets-script.js"></script>

</body>
</html>
