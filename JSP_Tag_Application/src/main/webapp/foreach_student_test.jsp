<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList, com.mkpits.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
// 
List<Student> data = new ArrayList<Student>();
data.add(new Student("Pranav","Armarkar",false));
data.add(new Student("Kaustubh","Anjankar",false));
data.add(new Student("Samiksha","Patil",false));
data.add(new Student("Harsh","Gupta",true));
pageContext.setAttribute("myStudent",data);
%>
<c:forEach var="tempStudent" items="${myStudent}">
${tempStudent.firstName}
${tempStudent.lastName}
${tempStudent.isGoldCustomer}
<br>
</c:forEach>
</body>
</html>