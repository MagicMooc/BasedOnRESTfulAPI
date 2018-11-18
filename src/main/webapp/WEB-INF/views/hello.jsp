<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/16
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%-- 两种方式都可以获取ModelAndView传过来的值--%>
    <h1>Hello ${requestScope.name}</h1>
    <h1>Hello ${name}</h1>
    ${sessionScope.name}
    <a href="result">result</a>
</body>
</html>
