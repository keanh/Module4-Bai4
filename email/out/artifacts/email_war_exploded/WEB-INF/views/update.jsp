<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02/05/2020
  Time: 9:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<form action="home" method="get">
    <button type="submit">Home</button>
</form>
<form action="create" method="post" modelAttribute="email">
    <table>
        <tr>
            <td><label name="name">Name:</label></td>
            <td><input name="name" value="${email.name}"/></td>
        </tr>
        <tr>
            <td><label name="language">Language:</label></td>
            <td><select name="language">
                <option value="English">English</option>
                <option value="Vietnamese">Vietnamese</option>
                <option value="Japanese">Japanese</option>
                <option value="Chinese">Chinese</option>
            </select>
            </td>
        </tr>
        <tr>
            <td><label name="pageSize">Page Size:</label></td>
            <td>
                Show
                <select name="pageSize">
                    <option value="5">5</option>
                    <option value="10">10</option>
                    <option value="15">15</option>
                    <option value="25">25</option>
                    <option value="50">50</option>
                    <option value="100">100</option>
                </select>
                email per page
            </td>
        </tr>
        <tr>
            <td><label name="spamFilter">Spam Filter:</label></td>
            <td><input type="checkbox" name="spamFilter" value="Enable spams filter">Enable spams filter</td>
        </tr>
        <tr>
            <td><label name="signature">Signature:</label></td>
            <td><textarea name="signature" rows="3" cols="10">${email.signature}</textarea></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Create"></td>
        </tr>
    </table>
</form>
</body>
</html>
