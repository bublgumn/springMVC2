<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="msq" items="${messages}">
    <h1>${msq}</h1>
</c:forEach>
<table>
    <thead>
    <tr>
        <th>age</th>
        <th>model</th>
        <th>series</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="car" items="${cars}">
        <tr>
            <td>${car.age}</td>
            <td>${car.model}</td>
            <td>${car.series}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
