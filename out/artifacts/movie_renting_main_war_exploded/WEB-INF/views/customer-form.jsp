<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: israel
  Date: 20/09/2019
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Form</title>
    <style>
        .error {
            color: #ff0000;
            background-color: #000000;
            font-weight: lighter;
            font-size: 1rem;
        }
    </style>
</head>
<body>

<form:form action="process-customer" modelAttribute="customerModel">
    First Name: <form:input path="firstName" placeholder="first-name" cssClass="error" />
    <br/>
    Last Name: <form:input path="lastName" placeholder="last-name" cssClass="error" />
    <br/>
    How old are you: <form:input path="age" placeholder="Your age?" cssClass="error"/>
    <br/>
    Are you a Customer:
    <form:radiobutton path="owner" value="true" cssClass="error"/> True
    <form:radiobutton path="owner" value="false" cssClass="error"/>False
    <br/>
    <input type="submit" value="Submit Form"/>
</form:form>

</body>
</html>
