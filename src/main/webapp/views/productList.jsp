<!doctype html>
<html lang="en">
<head>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Category list</title>
    <style>
        table,
        th,
        td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <h1>Category list</h1>
    <table>
        <tr>
            <th></th>
            <th>Name</th>
            <th>Description</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="category" items="${categories}">
            <tr>
                <td>${category.getCategoryID()}</td>
                <td>${category.getCategoryName()}</td>
                <td>${category.getDescription()}</td>
                <td><a href="">Show product</a></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>