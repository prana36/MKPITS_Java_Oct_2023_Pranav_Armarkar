<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<%@page import="com.mkpits.jdbc1.Student_Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Tracker App</title>
<link type= "text/css" rel= "stylesheet" href= "css/add-student-style"></link>
</head>
<%//get the student the RequestDispatcher
List<Student_Model> theStudents =(List<Student_Model>)request.getAttribute("STUDENT_LIST");
%>

<body>
 <div id="wrapper">
   <div id="header">
     <h2>MKPITS University</h2>
   </div>
 </div>
 <div id="container">
  <div id="content">
   <table border="1">
     <tr>
     
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
     </tr>
     
    <%
      for (Student_Model tempStudent : theStudents){
 %>
    <tr>
       <td><%=tempStudent.getId()%></td>
       <td><%=tempStudent.getFirstName()%></td>
       <td><%=tempStudent.getLastName()%></td>
       <td><%=tempStudent.getEmail()%></td>
   </tr>
 <%
 }
 %>
 
   </table>
  </div>
 </div>

</body>
</html>