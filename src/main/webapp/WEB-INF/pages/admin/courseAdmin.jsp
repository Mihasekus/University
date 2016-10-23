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
            <%@ include file="./menuAdmin.jsp" %>
        </td>
        <td width="45%">
            <table>

                <c:forEach items="${Course}" var="Course">

                    <c:if test="${Course.id eq id}">
                        <tr>
                            <td><a> ${Course.name}</a></td>
                            <td><a> ${Course.id}</a></td>
                            <td><a> ${Course.status}</a></td>
                        </tr>
                    </c:if>
                </c:forEach>
            </table>
        </td>
    </tr>
    </tbody>
</table>
<a href="/menuAdmin.html">Назад</a>
</body>
</html>
