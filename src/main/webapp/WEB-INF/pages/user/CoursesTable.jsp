<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Courses</title>
</head>
<body>
<table>
    <tbody>
    <tr>
        <td width="25%">
            <%@ include file="./menu.jsp" %>
        </td>

        <td ><form:form action="/CoursesTable.html" commandName="CoursesTable">
            <c:if test="${not empty CoursesTable}">
                <table border="2">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>

                    </tr>

                    <c:forEach items="${CoursesTable}" var="CoursesTable">
                        <tr>
                            <td><a href="/course.html?id=${CoursesTable.id}"> ${CoursesTable.id} </a></td>
                            <td><a href="/course.html?id=${CoursesTable.id}"> ${CoursesTable.name} </a></td>
                        </tr>

                    </c:forEach>
                </table>
            </c:if>
        </form:form></td>
        <td width="5%">
            <div id="search_form">
                <form class="form-search" method="post" action='<c:url value="/CoursesTableSearch.html" />' >
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
