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
            <%@ include file="./menu.jsp" %>
        </td>

        <td width="60%">
            <c:if test="${not empty Archive}">
            <table border="2">
                <tr>
                    <th>Student</th>
                    <th>Lector</th>
                    <th>Course</th>
                    <th>Mark</th>
                </tr>
                <tr>
                    <form class="form-search" method="post" action='<c:url value="/ArchiveTableSearch.html" />'>

                        <td><input class="form-control" type="text" name="searchStud" placeholder="Поиск" required
                                   autofocus/>
                        </td>
                        <td><input class="form-control" type="text" name="searchLector" placeholder="Поиск" required
                                   autofocus/>
                        </td>
                        <td>
                            <select name="course">

                                <c:forEach items="${courses}" var="course">
                                    <option value="${course.id}">${course.name} </option>
                                </c:forEach>

                            </select>
                        </td>
                        <td>
                            <select name="mark">

                                <c:forEach items="${marks}" var="num">
                                    <option value="${num}"> ${num}</option>
                                </c:forEach>

                            </select>
                        </td>
                        <td>
                            <button class="btn btn-lg btn-primary btn-block" type="submit">Искать</button>
                        </td>
                    </form>

                </tr>


                <c:forEach items="${Archive}" var="Marks">
                    <tr>
                        <td><a href="/student.html?id=${Marks.student.id}"> ${Marks.student.name} </a></td>
                        <td><a href="/lector.html?id=${Marks.lector.id}"> ${Marks.lector.name} </a></td>
                        <td><a href="/course.html?id=${Marks.course.id}"> ${Marks.course.name} </a></td>
                        <td><a> ${Marks.mark} </a></td>
                    </tr>

                </c:forEach>
                </c:if>
            </table>
        </td>

    </tr>

    </tbody>
</table>
<a href="/menu.html">Назад</a>
</body>
</html>
