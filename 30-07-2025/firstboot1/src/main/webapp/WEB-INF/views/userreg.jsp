<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration Form</h2>

    <form:form method="post" action="/user/save" modelAttribute="user">
        <label>Username:</label>
        <form:input path="username"/><br><br>

        <label>Email:</label>
        <form:input path="userEmail"/><br><br>

        <label>Phone:</label>
        <form:input path="userPhone"/><br><br>

        <input type="submit" value="Register"/>
    </form:form>
</body>
</html>
