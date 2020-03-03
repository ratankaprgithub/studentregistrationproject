<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<body>

<f:form method="get" action="getCourseDetails">

Select Course :

<f:select name="cname">
<f:options items="${courses }"/>

</f:select>

<input type="submit" value="Get">

</f:form>
</body>
</html>