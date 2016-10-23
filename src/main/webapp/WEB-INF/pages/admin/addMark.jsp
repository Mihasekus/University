<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<div id="addMark_form">
    <form name="f1" method="post" action="/addMark.html" id="f1">
        <table>
            <tr>
            <td width="25%">
                <%@ include file="./menuAdmin.jsp" %>
            </td>
                <td>
            <table>
                <td>
            <tr>
                <td class="LectorId">Lector:</td>
                <td>
                    <select name="lector">
                    <c:forEach items="${lectors}" var="lector">
                        <option value="${lector.id}">${lector.name} </option>
                    </c:forEach>
                </select></td>
                <td class="StudentId">Student:</td>
                <td>  <select name="student">
                    <c:forEach items="${students}" var="student">
                        <option value="${student.id}">${student.name} </option>
                    </c:forEach>
                </select></td>
                <td class="CourseId">Course Id :</td>
                <td>  <select name="Course">
                    <c:forEach items="${courses}" var="course">
                        <option value="${course.id}">${course.name} </option>
                    </c:forEach>
                </select></td>
                <td class="Mark">Mark :</td>
                <td><input type="text" name="mark" value=""/></td>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="/addMark.html?id=${Course.id}"><input type="submit" name="AddButton" value="Add"
                                                                   style="font-size:14px ; "/> </a>
                </td>
            </tr>
            </table>
            </td> </tr>
        </table>
    </form>
</div>
</body>
<a href="/menuAdmin.html">Назад</a>
</html>
