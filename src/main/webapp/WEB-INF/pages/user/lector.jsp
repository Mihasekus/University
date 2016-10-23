<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="<c:url value="/css/common.css"/>" type="text/css" media="all">
<link rel="stylesheet" href="<c:url value="/css/student.css"/>" type="text/css" media="all">

<head>
    <title>Лектор</title>
</head>
<body>
<tbody>
<tr>
    <td width="25%">
        <%@ include file="./menu.jsp" %>
    </td>

    <td width="65%">
        <table>

            <c:forEach items="${Lector}" var="Lector">

            <c:if test="${Lector.id eq id}">
            <tr>
                <td> ${Lector.name}</td>
                <td> ${Lector.surname} </td>

            </tr>
            </c:if>
            </c:forEach>
</tbody>
</tr></td>
<a href="/menu.html">Назад</a>
</body>
</html>
