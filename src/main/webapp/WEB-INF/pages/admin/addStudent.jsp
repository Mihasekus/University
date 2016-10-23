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
            <td width="25%">
                <%@ include file="./menuAdmin.jsp" %>
            </td>
                <td>
            <table>
            <tr>
                <td class="StudentName">Student Name:</td>
                <td><input type="text" name="studentName" value=""/></td>
            </tr>
            <tr>
                <td class="StudentSurname">Student Surname:</td>
                <td><input type="text" name="studentSurname" value=""/></td>
            </tr>
            <tr>
                <td class="StudentName">Student birthdate:</td>
                <td><input  type="datetime" name="studentBirthdate" max="1930-01-01" min="2010-01-01" value=""/>
                </td>
            </tr>
            <tr>

                <td class="UserLogin">Student login :</td>
                <td><input type="text" name="UserLogin" value=""/></td>
            </tr>
            <tr>
                <td class="UserPassword">Student password :</td>
                <td><input type="text" name="UserPassword" value=""/></td>
            </tr>
            <tr>

                <td class="UserRole">Student role :</td>
                <td>
                    <select name="course">
                        <c:forEach items="${roles}" var="role">
                            <option value="${role}">${role} </option>
                        </c:forEach>
                    </select></td>
            </tr>
            <tr>
                <td>
                    <a href="/addStudent.html?id=${Course.id}"><input type="submit" name="AddButton" value="Add"
                                                                      style="font-size:14px ; "/> </a>
                </td>
            </tr>
            </table>
                </td></tr>
        </table>
    </form>
</div>
</body>
<a href="/menuAdmin.html">Назад</a>
</html>
