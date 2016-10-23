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
        <td>
            <%@ include file="./menu.jsp" %>
        </td>
        <p><br>

        <p><br>
        </p>

        <p>Таблица оценок</p>

        <td><form:form action="/archive.html" commandName="Archive">
            <c:if test="${not empty Archive}">
                <table>
                <tr>
                    <td></td>
                    <td></td>
                    <td><div class="dropdown">
                        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                            Dropdown
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                        </ul>
                    </div></td>
                    <td><div class="dropdown">
                        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                            Dropdown
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                        </ul>
                    </div></td>
                </tr>
                <tr>
                    <th>Student</th>
                    <th>Lector</th>
                    <th>Course</th>
                    <th>Mark</th>
                </tr>

                <c:forEach items="${Archive}" var="Archive">
                    <tr>
                        <td><a href="/student.html?id=${Archive.student.id}"> ${Archive.student.name} </a></td>
                        <td><a href="/lector.html?id=${Archive.lector.id}"> ${Archive.lector.name} </a></td>
                        <td><a href="/course.html?id=${Archive.course.id}"> ${Archive.course.name} </a></td>
                        <td><a> ${Archive.mark} </a></td>
                    </tr>

                </c:forEach>
            </c:if>
            </table>
        </form:form></td>
        <td>
            <div id="search_form">
                <form class="form-search" method="post" action='<c:url value="/ArchiveTableSearch.html" />' >
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
