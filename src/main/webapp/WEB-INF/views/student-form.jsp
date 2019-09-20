<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: israel
  Date: 20/09/2019
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="process-form" modelAttribute="studentModel" >
    First Name: <form:input path="firstName" />
    <br/>
    Last Name: <form:input path="lastName" />
    <br/>
    Password: <form:password path="password"/>
    <br/>
    <form:select path="country">
        <form:option value="Nigeria" label="Nigeria"/>
        <form:option value="Tunisia" label="Tunisia"/>
        <form:option value="India" label="India"/>
    </form:select>
    <br/>
    <input type="submit" value="Submit Student">
</form:form>

</body>
</html>
