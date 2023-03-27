<html>
<head>
    <title>Simple K-Pac App</title>
<%--    <script type="text/javascript" src="${pageContext.request.contextPath}/script/codebase/suite.js"></script>--%>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/script/codebase/suite.css">
</head>
<body>
<h2>Simple K-Pac App. Home Page!</h2>
<%--<div id="layout" style="height: 100%;"></div>--%>
<br>
<a href="kpacs">Navigate to K-Pacs</a>
<br>
<a href="sets">Navigate to K-Pac sets</a>
<%--<style>--%>
<%--.dhx_button--width_full {--%>
<%--width: 90%;--%>
<%--}--%>
<%--</style>--%>
<%--<script>--%>
<%--    const layout = new dhx.Layout("layout", {--%>
<%--        cols: [--%>
<%--            {--%>
<%--                rows: [--%>
<%--                    {--%>
<%--                        id: "toolbar",--%>
<%--                        height: "content"--%>
<%--                    },--%>
<%--                    {--%>
<%--                        type: "space",--%>

<%--                    }--%>
<%--                ]--%>
<%--            }--%>
<%--        ]--%>
<%--    });--%>

<%--    // Toolbar initialization--%>
<%--    const toolbar = new dhx.Toolbar(null, {--%>
<%--        css: "toolbar_template_a"--%>
<%--    });--%>

<%--    const toolbarData = [--%>
<%--        {--%>
<%--            id: "kpacs",--%>
<%--            type: "button",--%>
<%--            circle: true,--%>
<%--            value: "K-Pacs",--%>
<%--            size: "small",--%>
<%--            icon: "mdi mdi-plus",--%>
<%--            full: true--%>
<%--        },--%>
<%--        {--%>
<%--            type: "spacer"--%>
<%--        },--%>
<%--        {--%>
<%--            id: "sets",--%>
<%--            type: "button",--%>
<%--            circle: true,--%>
<%--            value: "K-Pac sets",--%>
<%--            size: "small",--%>
<%--            icon: "mdi mdi-plus",--%>
<%--            full: true--%>
<%--        },--%>
<%--        {--%>
<%--            type: "spacer"--%>
<%--        }--%>
<%--    ];--%>

<%--    toolbar.data.parse(toolbarData);--%>

<%--    toolbar.events.on("click", function (id) {--%>
<%--        if (id === "sets") {--%>
<%--            window.location.href = "sets";--%>
<%--        }--%>
<%--        if (id === "kpacs") {--%>
<%--            window.location.href = "kpacs";--%>
<%--        }--%>
<%--    });--%>

<%--    layout.getCell("toolbar").attach(toolbar);--%>

<%--    const editToolbarData = [--%>
<%--        {--%>
<%--            id: "close",--%>
<%--            icon: "dxi dxi-close",--%>
<%--            circle: true--%>
<%--        }--%>
<%--    ]--%>

</script>
<h4>Type something else</h4>
</body>
</html>
