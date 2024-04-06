<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Example 2</h1>
<h3>The following example shows a Simple Scriptlet to Display Text in Different Font Sizes.</h3>
<form name="f1" method="post" action="3.jsp">
	Enter Some Text: <input type="text" name="txt"/><br/>
	<br/>
	<input type ="submit" value="Submit"/><br/><br/>
</form>

<%
	String inp1=request.getParameter("txt");
	if(inp1!=null)
	{
		for(int i=1;i<=5;i++)
		{
			out.println("<span style='font-size: "+(i+20)+"px;'>" + inp1+"</span><br/>");
		}
	
	}
%>

</body>
</html>