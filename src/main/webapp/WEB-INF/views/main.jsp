<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Main</title>
</head>
<body>

<style>
    .error {
        color: red; font-weight: bold;
    }
</style>

<div>
<form:form action="add" commandName="user">
    Login:
    <form:input path="login"/>
    <form:errors path="login" cssClass="error"/>
    <br>
    <br>
    UserName:
    <form:input path="userName"/>
    <form:errors path="userName" cssClass="error"/>
    <br>
    <br>
    Password:
    <form:input path="password"/>
    <form:errors path="password" cssClass="error"/>
    <br>
    <br>
    Phone:
    <form:input path="phone"/>
    <form:errors path="phone" cssClass="error"/>
    <br>
    <br>
    <input type="submit" value="Registrate"/>
</form:form>
</div>
</body>
</html>
