<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--The following code example demonstrates a Program to Create 
a JSP Method that Accepts a Number and Returns its Double.  -->
	<h2>Double Calculator</h2>
	<form action="double_example1.jsp" method="post">
		Enter a number: <input type="text" name="number"> <br> <br>
		<input type="submit" value="Submit">
	</form>
	<%
		int number = Integer.parseInt(request.getParameter("number"));
		int result = doubleNumber(number);
		out.println("<br><br>The double of the number is: " + result);
	%>

	<%!
		public int doubleNumber(int number) {
			return number * 2;
		}
	%>
</body>
</html>