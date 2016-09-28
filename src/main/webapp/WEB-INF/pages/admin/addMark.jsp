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
                <td class="LectorId">Lector Id :</td>
                <td><input type="text" name="lectorId" value=""/></td>
                <td class="StudentId">Student Id :</td>
                <td><input type="text" name="studentId" value=""/></td>
                <td class="CourseId">Course Id :</td>
                <td><input type="text" name="courseId" value=""/></td>
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
    </form>
</div>
</body>
<a href="/menuAdmin.html">Назад</a>
</html>
