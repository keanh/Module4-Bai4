<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02/05/2020
  Time: 9:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information</title>
</head>
<body>
<form action="home" method="get">
    <button type="submit">Home</button>
</form>
<h1>Information</h1>
<h3>Name: ${email.name}</h3>
<h3>Language: ${email.language}</h3>
<h3>Page Size: ${email.pageSize}</h3>
<h3>Spam Filter: ${email.spamFilter}</h3>
<h3>Signature: ${email.signature}</h3>
</body>
</html>
