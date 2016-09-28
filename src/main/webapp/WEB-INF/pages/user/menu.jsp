<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href='<c:url value="/css/bootstrap.min.css" />' type="text/css">
<link rel="stylesheet" href="<c:url value="/css/common.css"/>" type="text/css" media="all">


<ul class="nav nav-pills nav-stacked">
    <li role="presentation"><a href="/CoursesTable.html">Просмотр списка курсов</a></li>
    <li role="presentation"><a href="/StudentTable.html">Просмотр списка студентов</a></li>
    <li role="presentation"><a href="/LectorsTable.html">Просмотр списка преподавателей</a></li>
    <li role="presentation"><a href="/Archive.html">Просмотр архива оценок</a></li>

</ul>
<a href="/login.html">Выход</a>
