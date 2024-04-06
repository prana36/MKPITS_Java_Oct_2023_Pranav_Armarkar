<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Example 3</h1>
<h3>Calculate Grade </h3>

	<h2>Grade Calculator</h2>
	<form action="GradeCalculator.jsp" method="post">
		Enter Marks: <input type="text" name="marks"> <br> <br>
		<input type="submit" value="Submit">
	</form>
	<%
		int marks = Integer.parseInt(request.getParameter("marks"));
		char grade;

		switch (marks / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}

		out.println("<br><br>Your Grade is: " + grade);
	%>

</body>
</html>