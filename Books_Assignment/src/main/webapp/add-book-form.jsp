<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD</title>

<link type="text/css" rel="stylesheet" href="css/add-book-style.css"></link>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Books Library</h2>
		</div>
	</div>
<div id="container">

	<h3>Add Books Details</h3>

	<form action="BooksControllerServlet" method="get">
         <input type="hidden" name="command" value="ADD" />
		<table>
			<tbody>
					<tr>
					<td><label>Title: </label></td>
					<td><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td><label>Author: </label></td>
					<td><input type="text" name="author" /></td>
				</tr>
				<tr>
				    <td><label>Date</label></td>
	                <td><input type="text" name="date"/></td>
	            </tr>
	            <tr>
					<td><label>Genres: </label></td>
					<td><input type="text" name="genres" /></td>
				</tr>
				<tr>
					<td><label>Characters: </label></td>
					<td><input type="text" name="characters" /></td>
				</tr>
				<tr>
					<td><label>Synopsis: </label></td>
					<td><input type="text" name="synopsis" /></td>
				</tr>
	            <tr>
	                <td><input type="submit" value="Save" class="save"></td>
	            </tr>
			</tbody>
		</table>
	</form>
	
	<div style="clear:both;"></div>
	   <p><a href="BooksControllerServlet">Back To List</a></p>
</div>

</body>
</html>