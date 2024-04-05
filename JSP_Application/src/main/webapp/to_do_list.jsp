<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
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
<form action="to_do_list.jsp" method="post">
Add Items: <input type="text" name="todo" id=" "/> <br>
 <input type="submit" value="submit"/> <br><br>
 Item Entered: <%= request.getParameter("todo") %>
</form>
<% List<String> items=(List<String>)session.getAttribute("myToDoList");
if(items==null)
{
	items=new ArrayList<String>();
	session.setAttribute("myToDoList", items);
}
	
	String theItems=request.getParameter("todo");
	
	if((theItems !=null)&&(!theItems.trim().equals(""))){
		items.add(theItems);
	}

%>
  <hr>
  <strong>To Do List Are : </strong>
  <ol>
  <%
  for(String temp : items)
  {
	  out.print("<li>"+temp+"</li>");
  }
  %>
  </ol>
</body>
</html>