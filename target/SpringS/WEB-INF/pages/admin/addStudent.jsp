<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<div id="addLector_form">
    <form name="f1" method="post" action="/addStudent.html" id="f1">
        <table>
            <tr>
                <td class="StudentName">Student Name:</td>
                <td><input type="text" name="studentName" value=""/></td>
                <td class="StudentSurname">Student Surname:</td>
                <td><input type="text" name="studentSurname" value=""/></td>
            </tr>
            <td class="StudentName">Student birthdate:</td>
            <td><input type="text" name="studentBirthdate" value=""/></td>
            <tr>
                <td class="UserLogin">Student login :</td>
                <td><input type="text" name="UserLogin" value=""/></td>
                <td class="UserPassword">Student password :</td>
                <td><input type="text" name="UserPassword" value=""/></td>
                <td class="UserRole">Student role :</td>
                <td><input type="text" name="Role" value=""/></td>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="/addStudent.html?id=${Course.id}"><input type="submit" name="AddButton" value="Add"
                                                                      style="font-size:14px ; "/> </a>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
<a href="/menuAdmin.html">Назад</a>
</html>
