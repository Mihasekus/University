<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<link rel="stylesheet" href="<c:url value="/css/common.css"/>" type="text/css">
<link rel="stylesheet" href="<c:url value="/css/table.css"/>" type="text/css">

<head>

    <title>Table</title>

</head>

<body>
<table>
    <tbody>
    <tr>
        <td width="25%">
            <%@ include file="./menu.jsp" %>
        </td>

        <td width="65%">
            <form:form action="/student.html" commandName="Student">
            <c:if test="${not empty Student}">
            <table border="2">
                <tr>
                    <th>Name</th>
                    <th>Surname</th>
                </tr>

                <c:forEach items="${Student}" var="Student">
                    <tr>
                        <td>
                            <a href="/student.html?id=${Student.id}"> ${Student.name} </a></td>
                        <td><a href="/student.html?id=${Student.id}"> ${Student.surname} </a></td>
                    </tr>

                </c:forEach>
                </c:if>
            </table>
        </td>
        </form:form>
    <td width="5%">
        <div id="search_form">
            <form class="form-search" method="post" action='<c:url value="/StudentTableSearch.html" />' >
                <input class="form-control" type="text" name="search" placeholder="Поиск" required autofocus/>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Искать</button>
            </form>
        </div>
    </td> </tr>
    </tbody>
</table>
<a href="/menu.html">Назад</a>

</body>
</html>
