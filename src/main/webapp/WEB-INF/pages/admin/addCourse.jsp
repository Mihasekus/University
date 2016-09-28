<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<div id="addCourse_form">
    <form name="f1" method="post" action="/addCourse.html" id="f1">
        <table>
            <tr>
                <td class="CourseName">Course Name :</td>
                <td><input type="text" name="courseName" value=""/>

                </td>
            <tr>
                <td>
                    <a href="/addCourse.html?id=${Course.id}"><input type="submit" name="AddButton" value="Add"
                                                                     style="font-size:14px ; "/> </a>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
<a href="/menuAdmin.html">Назад</a>
</html>
