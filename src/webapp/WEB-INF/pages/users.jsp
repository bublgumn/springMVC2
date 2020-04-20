<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1" cellpadding="5">
    <thead>
    <tr>
        <th><p>Id.</p></th>
        <th><p>First name.</p></th>
        <th><p>Last name.</p></th>
        <th><p>Email.</p></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.firstname}</td>
            <td>${user.lastname}</td>
            <td>${user.email}</td>
            <td>
                <form name="delete" action="/deleteUser" method="post">
                    <input title="Id" type="hidden" name="id" value="${user.id}">
                    <input type="submit" title="Submit" value="Delete">
                </form>
            </td>
            <td>
                <form name="update" action="/updateUser" method="get">
                    <input title="Id" type="hidden" name="id" value="${user.id}">
                    <input type="submit" title="Submit" value="Update">
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<br>
<br>

<form name="user" action="/createUser" method="post">
    <p>First name</p>
    <input title="Name" type="text" name="firstname">
    <p>Last name</p>
    <input title="Email" type="text" name="lastname">
    <p>Email</p>
    <input title="Age" type="text" name="email">
    <input type="submit" title="Submit" value="Create">
</form>

</body>

</html>
