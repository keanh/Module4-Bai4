<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02/05/2020
  Time: 9:08 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<form action="create" method="get">
    <button type="submit">Create</button>
</form>
<form action="info" method="get">
    <input type="text" name="name"/>
    <button type="submit">Search</button>
</form>
<form action="update" method="get">
    <input type="text" name="name"/>
    <button type="submit">Update</button>
</form>
</body>
</html>
