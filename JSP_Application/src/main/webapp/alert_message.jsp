<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- The following examples shows a program to create a JSP page called AlertMessage.JSP 
that displays alert messages if username & password fields are blank and 
displays welcome user otherwise.
 As can be seen in the folowing code, the file AlertMessage.jsp contains an HTML form.
  Also, there is a validate() function in JavaScript. 
  Basically, the validate function() cjecks whether the username or password fields are not blank. 
  In such a case, it displays an alert message. Otherwise, 
  it transfers the control to the Welcome.jsp fil -->

<form name="frm1" method="post" onsubmit="validate()">
	Username <input type="text" name="name" id="name"><br>
	password <input type="password" name="pswd" id="pswd"><br>
	<input type="submit" value="show">
</form>
<script language="Javascript">
	function validate()
	{
	var un = document.getElementById("name").value;
	var pswd = document.getElementById("pswd").value;
	if(!un)
	{
		alert("Username is required");
		return;
	}
	else if(!pswd)
	{
		alert("password is required");
		return;
	}
	else
	{
		document.frm1.setAttribute("action","Welcome.jsp");
	}
}
</script>

</body>
</html>