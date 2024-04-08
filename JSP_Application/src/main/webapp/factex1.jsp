<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Build an application in JSP to calculate factorial of a number using recursion. -->

<form name="f1" method="post" action="factex.jsp">
	Enter a Number: <input type="text" name="n"/>
	<br/>
	<input type ="submit" value="Find Factorial"/>
</form>

<%!
	int find_factorial(int n)
	{
		if(n==0)
			return 1;
		return n*find_factorial(n-1);
	}
%>
<%
	String inp=request.getParameter("n");
	if(inp!=null)
	{
		int px=Integer.parseInt(inp);
		int fact=find_factorial(px);
		out.println("<br/>Factorial = " + fact);
	}
%>

</body>
</html>