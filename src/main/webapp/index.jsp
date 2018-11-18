<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2018/4/24
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>test</title>
</head>
<script>
    function selectUser() {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                document.getElementById("test").innerHTML = xmlhttp.responseText;
            }
        }
        xmlhttp.open("POST", "user/showUser.do", true);
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.send("id=1");
    }
</script>
<body>
  <p id="test">Hello World!</p>
  <button type="button" onclick="selectUser()">onclick test</button>
  <br>
  <form action="/testModelAttribute">
    id:<input type="text" name="id" value="1"/>
    <br>
    name:<input type="text" name="name" value="tom"/>
    <br>
    <input type="submit" value="submit"/>
  </form>

</body>
</html>