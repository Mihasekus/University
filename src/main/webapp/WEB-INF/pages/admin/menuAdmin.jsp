<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href='<c:url value="/css/bootstrap.min.css" />' type="text/css">
<link rel="stylesheet" href="<c:url value="/css/common.css"/>" type="text/css" media="all">
<link rel="stylesheet" href="<c:url value="/css/student.css"/>" type="text/css" media="all">

<ul class="nav nav-pills nav-stacked">
    <li role="presentation"><a href="/coursesTableAdmin.html">Просмотр списка курсов</a></li>
    <li role="presentation"><a href="/studentTableAdmin.html">Просмотр списка студентов</a></li>
    <li role="presentation"><a href="/lectorsTableAdmin.html">Просмотр списка преподавателей</a></li>
    <li role="presentation"><a href="/archiveAdmin.html">Просмотр архива оценок</a></li>
    <li role="presentation"><a href="/showAddCourse.html">Добавить курс</a></li>
    <li role="presentation"><a href="/showAddStudent.html">Добавить студента</a></li>
    <li role="presentation"><a href="/showAddLector.html">Добавить лектора</a></li>
    <li role="presentation"><a href="/showAddMark.html">Добавить оценку</a></li>

</ul>


<a href="/login.html">Выход из аккаунта</a>
