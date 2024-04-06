<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Example1</h1>
<h3>Here is an example code for a JSP program that displays session information.</h3>
<%
   HttpSession s = request.getSession();
   Integer count = (Integer) s.getAttribute("count");
   if (count == null) {
      count = 1;
   } else {
      count++;
   }
   session.setAttribute("count", count);
%>

<h1>Session Information</h1>
<p>Session ID: <%= session.getId() %></p>
<p>Creation Time: <%= new java.util.Date(session.getCreationTime()) %></p>
<p>Last Access Time: <%= new java.util.Date(session.getLastAccessedTime()) %></p>
<p>Visit Count: <%= count %></p>

</body>
</html>