<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Archive</title>
</head>
<body>
<table>
    <tbody>
    <tr>
        <td width="25%">
            <%@ include file="./menuAdmin.jsp" %>
        </td>
        <td width="45%"><form:form action="/archiveAdmin.html" commandName="Archive">
            <c:if test="${not empty Archive}">
                <table border="2">
                <tr>
                    <th>Student ID</th>
                    <th>Lector ID</th>
                    <th>Course ID</th>
                    <th>Mark</th>
                </tr>

                <c:forEach items="${Archive}" var="Archive">
                    <tr>
                        <td><a href="/studentAdmin.html?id=${Archive.student.id}"> ${Archive.student.name} </a></td>
                        <td><a href="/lectorAdmin.html?id=${Archive.lector.id}"> ${Archive.lector.name} </a></td>
                        <td><a href="/courseAdmin.html?id=${Archive.course.id}"> ${Archive.course.name} </a></td>
                        <td><a> ${Archive.mark} </a></td>
                        <td><a href="/delMark.html?id=${Archive.id}">Удалить </a></td>
                    </tr>

                </c:forEach>
            </c:if>
            </table>
        </form:form></td>
        <td >
            <div id="search_form">
                <form class="form-search" method="post" action='<c:url value="/ArchiveAdminTableSearch.html" />' >
                    <input class="form-control" type="text" name="search" placeholder="Поиск" required autofocus/>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Искать</button>
                </form>
            </div>
        </td> </tr>
    </tbody>
</table>

<a href="/menuAdmin.html">Назад</a>
</body>
</html>
