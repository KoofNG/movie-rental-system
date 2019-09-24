<%--
  Created by IntelliJ IDEA.
  User: israel
  Date: 20/09/2019
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Form</title>
    <style>
        .error {
            color: #ff0000
        }
    </style>
</head>
<body>
    <form:form action="process-customer" modelAttribute="customerModel">
        First Name:
        <form:input path="firstName" placeholder="first-name"/>
        <form:errors path="firstName" cssClass="error"/>
        <br/>
        Last Name:
        <form:input path="lastName" placeholder="last-name"/>
        <form:errors path="lastName" cssClass="error"/>
        <br/>
        How old are you:
        <form:input path="age" placeholder="Your age?"/>
        <form:errors path="age" cssClass="error"/>
        <br/>
        Are you a Customer:
        <form:radiobutton path="owner" value="true"/> True
        <form:radiobutton path="owner" value="false"/>False
        <form:errors path="owner" cssClass="error"/>
        <br/>
        Postal Code:
        <form:input path="postalCode" placeholder="first-name"/>
        <form:errors path="postalCode" cssClass="error"/>
        <br/>
        <input type="submit" value="Submit Form"/>
    </form:form>
</body>
</html>
