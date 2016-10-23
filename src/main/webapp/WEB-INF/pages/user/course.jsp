<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="<c:url value="/css/common.css"/>" type="text/css" media="all">
<link rel="stylesheet" href="<c:url value="/css/student.css"/>" type="text/css" media="all">

<head>
    <title>Курс</title>
</head>
<body>
<table>
    <tbody>
    <tr>
        <td width="25%">
            <%@ include file="./menu.jsp" %>
        </td>

        <table>
            <td width="65%">
                <c:forEach items="${Course}" var="Course">

                <c:if test="${Course.id eq id}">
                <tr>
                    <td><a> ${Course.name}</a></td>
                    <td><a> ${Course.id}</a></td>
                </tr>
                </c:if>
        </table>
        </c:forEach>
        </td></tr>
</table>
</tbody>
<a href="/menu.html">Назад</a>
</body>
</html>
