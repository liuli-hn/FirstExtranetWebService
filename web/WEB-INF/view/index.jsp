<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/4
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="${ctx}/static/public/js/jquery-1.10.2.js" ></script>
<script type="text/javascript" src="${ctx}/static/public/js/connect/websocket.js" ></script>
<body>
    <h1>欢迎访问我的电脑服务！1${ctx}1</h1>
    <input type="hidden" id="url" value="ws://localhost:8080${ctx}/dls/index">
</body>
</html>
