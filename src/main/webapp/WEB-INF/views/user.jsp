<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
    <ul>
        <li>用户编号${user.id}</li>
        <li>用户名${user.username}</li>
        <li>用户邮箱${user.email}</li>
        <li>用户角色${user.role}</li>
        <li>用户状态${user.status}</li>
        <li>注册时间${user.regTime}</li>
        <li>注册ip${user.regIp}</li>
    </ul>
</body>
</html>
