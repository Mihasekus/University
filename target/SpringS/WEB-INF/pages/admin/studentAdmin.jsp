<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="<c:url value="/css/common.css"/>" type="text/css" media="all">
<link rel="stylesheet" href="<c:url value="/css/student.css"/>" type="text/css" media="all">

<head>
    <title>Студент</title>
</head>
<body>
<table>
    <tbody>
    <tr>
        <td>
            <%@ include file="./menuAdmin.jsp" %>
        </td>
        <p><br>

        <p><br>
        </p>

        <td>
            <table>

                <c:forEach items="${Student}" var="Student">

                    <c:if test="${Student.id eq id}">
                        <tr>
                            <td> ${Student.name}</td>
                            <td> ${Student.surname} </td>
                            <td> ${Student.id} </td>
                            <td> ${Student.birthdate} </td>
                            <td> ${Student.status} </td>

                        </tr>
                    </c:if>
                </c:forEach>
            </table>
        </td>
    </tr>

    </tbody>
</table>

<a href="/studentTableAdmin.html">Назад</a>
</body>
</html>
