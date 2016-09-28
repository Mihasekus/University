<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/common.css"/>" media="all">
<link rel="stylesheet" type="text/css" href="<c:url value="/css/login.css"/>" media="all">
<link rel="stylesheet" href='<c:url value="/css/bootstrap.min.css" />' type="text/css">
<head>
    <title>Start</title>
    <meta charset="utf-8">


</head>

<body>

<div id="login_form">
    <form class="form-signin" method="post" action='<c:url value="/login.html" />' >
        <h2 class="form-signin-heading">Вход</h2>
        <input class="form-control" type="text" name="login" placeholder="Логин" required autofocus/>
        <br/>
        <input name="password" class="form-control" type="password" placeholder="Пароль" required/>
        <br/>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
    </form>
</div>
<a href="/menu.html"> Press to see menu </a>


</body>

</html>