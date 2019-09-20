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

<h1>${studentData.firstName}</h1>
<h2>${studentData.lastName}</h2>
<h3>${studentData.password}</h3>
<h4>${studentData.country}</h4>
<%--    <form:form action="form-tags" modelAttribute="student" >--%>
<%--        First Name: <form:input path="firstName" />--%>
<%--        Last Name: <form:input path="lastName" />--%>
<%--        Password: <form:password path="password"/>--%>
<%--    </form:form>--%>

</body>
</html>
