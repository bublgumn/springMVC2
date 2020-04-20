<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Password</th>
        <th>Age</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${user.id}</td>
        <td>${user.firstname}</td>
        <td>${user.lastname}</td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <form name="update" action="/updateUser" method="post">
            <td>
                <input title="Id"  type="hidden" name="id" value="${user.id}">
            </td>
            <td>
                <input title="Name" type="text" name="firstname">
            </td>
            <td>
                <input title="Password" type="text" name="lastname">
            </td>
            <td>
                <input title="Age" type="text" name="email" >
            </td>
            <td>
                <input type="submit" title="Submit" value="Update">
            </td>
        </form>
    </tr>
    </tbody>
</table>

</body>
</html>
