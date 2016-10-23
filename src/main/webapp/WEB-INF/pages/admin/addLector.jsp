<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<div id="addLector_form">
    <form name="f1" method="post" action="/addLector.html" id="f1">
        <table>
            <tr>
            <td width="25%">
                <%@ include file="./menuAdmin.jsp" %>
            </td>
                <td>
            <table>
            <tr>
                <td class="LectorName">Lector Name :</td>
                <td><input type="text" name="lectorName" value=""/></td>
            </tr>
            <tr>
                <td class="LectorSurname">Lector Surname :</td>
                <td><input type="text" name="lectorSurname" value=""/></td>
            </tr>
            <tr>
                <td class="UserLogin">Lector login :</td>
                <td><input type="text" name="UserLogin" value=""/></td>
            </tr>
            <tr>
                <td class="UserPassword">Lector password :</td>
                <td><input type="text" name="UserPassword" value=""/></td>
            </tr>
            <tr>
                <td class="UserRole">Lector role :</td>
                <td>
                    <select name="lector">
                    <c:forEach items="${roles}" var="role">
                        <option value="${role}">${role} </option>
                    </c:forEach>
                </select></td>
            </tr>
            <tr>

            </tr>
            <tr>

            </tr>
            <tr>
                <td>
                    <a href="/addLector.html?id=${Course.id}"><input type="submit" name="AddButton" value="Add"
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
