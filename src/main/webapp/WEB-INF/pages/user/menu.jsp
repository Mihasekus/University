<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href='<c:url value="/css/bootstrap.min.css" />' type="text/css">
<link rel="stylesheet" href="<c:url value="/css/common.css"/>" type="text/css" media="all">


<ul class="nav nav-pills nav-stacked">
    <li role="presentation" <c:if test="${(menuIndex == 1)}">class="active"</c:if>><a href='<c:url value="/CoursesTable.html"> <c:param name="point" value="1"/> </c:url>'>Просмотр списка курсов</a></li>
    <li role="presentation" <c:if test="${(menuIndex == 2)}">class="active"</c:if>><a href='<c:url value="/StudentTable.html"> <c:param name="point" value="2"/> </c:url>'>Просмотр списка студентов</a></li>
    <li role="presentation" <c:if test="${(menuIndex == 3)}">class="active"</c:if>><a href='<c:url value="/LectorsTable.html"> <c:param name="point" value="3"/> </c:url>'>Просмотр списка преподавателей</a></li>
    <li role="presentation" <c:if test="${(menuIndex == 4)}">class="active"</c:if>><a href='<c:url value="/Archive.html"> <c:param name="point" value="4"/> </c:url>'>Просмотр архива оценок</a></li>

</ul>
<a href="/login.html">Выход</a>
