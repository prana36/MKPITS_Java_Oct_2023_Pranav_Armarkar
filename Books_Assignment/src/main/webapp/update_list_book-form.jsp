<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
			<input type="hidden" name="command" value="UPDATE" /> <input
				type="hidden" name="bookId" value="${THE_BOOKS.id}" />
			<table>
				<tbody>
					<tr>
						<td><label>Title: </label></td>
						<td><input type="text" name="title" value="${THE_BOOKS.title}"/></td>
					</tr>
					<tr>
						<td><label>Author: </label></td>
						<td><input type="text" name="author" value="${THE_BOOKS.author}"/></td>
					</tr>
					<tr>
						<td><label>Date</label></td>
						<td><input type="text" name="date" value="${THE_BOOKS.date}"/></td>
					</tr>
					<tr>
						<td><label>Genres: </label></td>
						<td><input type="text" name="genres" value="${THE_BOOKS.genres}"/></td>
					</tr>
					<tr>
						<td><label>Characters: </label></td>
						<td><input type="text" name="characters" value="${THE_BOOKS.characters}"/></td>
					</tr>
					<tr>
						<td><label>Synopsis: </label></td>
						<td><input type="text"  name="synopsis" value="${THE_BOOKS.synopsis}"/></td>
					</tr>
					<tr>
						<td><input type="submit" value="Save" class="save"></td>
					</tr>
				</tbody>
			</table>
		</form>

		<div style="clear: both;"></div>
		<p>
			<a href="BooksControllerServlet">Back To List</a>
		</p>
	</div>

</body>
</html>