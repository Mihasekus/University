<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Lectors</title>
</head>
<body>
<table>
    <tbody>
    <tr>
        <td width="25%">
            <%@ include file="./menu.jsp" %>
        </td>
        <body>
        <td width="65%"><form:form action="/LectorsTable.html" commandName="LectorsTable">
            <c:if test="${not empty LectorsTable}">
                <table border="2">
                <tr>
                    <th>ID</th>
                    <th>Name</th>

                </tr>

                <c:forEach items="${LectorsTable}" var="LectorsTable">
                    <tr>
                        <td><a href="/lector.html?id=${LectorsTable.id}"> ${LectorsTable.id} </a></td>
                        <td><a href="/lector.html?id=${LectorsTable.id}"> ${LectorsTable.name} </a></td>
                        <td><a href="/lector.html?id=${LectorsTable.id}"> ${LectorsTable.surname} </a></td>
                    </tr>

                </c:forEach>
            </c:if>
            </table>
        </form:form></td>
        </body>
        <td width="5%">
            <div id="search_form">
                <form class="form-search" method="post" action='<c:url value="/LectorTableSearch.html" />' >
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
