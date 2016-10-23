<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href='<c:url value="/css/bootstrap.min.css" />' type="text/css">
<link rel="stylesheet" href="<c:url value="/css/common.css"/>" type="text/css" media="all">
<link rel="stylesheet" href="<c:url value="/css/student.css"/>" type="text/css" media="all">

<ul class="nav nav-pills nav-stacked">
    <li role="presentation" <c:if test="${(menuIndex == 1)}">class="active"</c:if>><a href='<c:url value="/coursesTableAdmin.html"> <c:param name="point" value="1"/> </c:url>'>Просмотр списка курсов</a></li>
    <li role="presentation" <c:if test="${(menuIndex == 2)}">class="active"</c:if>><a href='<c:url value="/studentTableAdmin.html"> <c:param name="point" value="2"/> </c:url>'>Просмотр списка студентов</a></li>
    <li role="presentation" <c:if test="${(menuIndex == 3)}">class="active"</c:if>><a href='<c:url value="/lectorsTableAdmin.html"> <c:param name="point" value="3"/> </c:url>'>Просмотр списка преподавателей</a></li>
    <li role="presentation" <c:if test="${(menuIndex == 4)}">class="active"</c:if>><a href='<c:url value="/archiveAdmin.html"> <c:param name="point" value="4"/> </c:url>'>Просмотр архива оценок</a></li>
    <li role="presentation" <c:if test="${(menuIndex == 5)}">class="active"</c:if>><a href='<c:url value="/showAddCourse.html"> <c:param name="point" value="5"/> </c:url>'>Добавить курс</a></li>
    <li role="presentation" <c:if test="${(menuIndex == 6)}">class="active"</c:if>><a href='<c:url value="/showAddStudent.html"> <c:param name="point" value="6"/> </c:url>'>Добавить студента</a></li>
    <li role="presentation" <c:if test="${(menuIndex == 7)}">class="active"</c:if>><a href='<c:url value="/showAddLector.html"> <c:param name="point" value="7"/> </c:url>'>Добавить лектора</a></li>
    <li role="presentation" <c:if test="${(menuIndex == 8)}">class="active"</c:if>><a href='<c:url value="/showAddMark.html"> <c:param name="point" value="8"/> </c:url>'>Добавить оценку</a></li>

</ul>


<a href="/login.html">Выход из аккаунта</a>
