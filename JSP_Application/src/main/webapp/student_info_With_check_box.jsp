<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student Form</h2>
The Student is Confirmed : ${param.fname} ${param.lname}
<br><br>
The Country is : ${param.country}
<br><br>
Favourite Language : ${param.favlang}
<br>
Languages Are:
<ul>

<%
String[] lang = request.getParameterValues("lang");
for(String temp : lang){
	out.println("<li>"+temp+"</li>");
}
%>
</ul>

</body>
</html>