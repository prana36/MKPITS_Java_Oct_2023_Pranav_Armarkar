<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.mkpits.books.BooksModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Books</title>
<link type="text/css" rel="stylesheet" href="css/style.css"></link>
</head>

<%
//get the student the RequestDispatcher
List<BooksModel> theStudents = (List<BooksModel>) request.getAttribute("BOOKS_LIST");
%>
<body>


	<div id="wrapper">
		<div id="header">
			<h2>Books Library</h2>
		</div>
	</div>

	<input type="button" value="Add books"
		onclick="window.location.href = 'add-book-form.jsp'; return false;"
		class ="list-books-css">
	<div id="container">
		<div id="content">

			<table border="1">
				<tr>

					<th>ID</th>
					<th>Title</th>
					<th>Author</th>
					<th>Date</th>
					<th>Genres</th>
					<th>Characters</th>
					<th>Synopsis</th>
					<th>Action</th>

				</tr>

				<c:forEach var="tempBook" items="${BOOKS_LIST}">
					<!--set up a link link for each student  -->
					<c:url var="tempLink" value="BooksControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="bookId" value="${tempBook.id}" />
					</c:url>

					<!--set up a link link for each student  -->
					<c:url var="deleteLink" value="BooksControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="bookId" value="${tempBook.id}" />
					</c:url>
					<tr>
						<td>${tempBook.id}</td>
						<td>${tempBook.title}</td>
						<td>${tempBook.author}</td>
						<td>${tempBook.date}</td>
						<td>${tempBook.genres}</td>
						<td>${tempBook.characters}</td>
						<td>${tempBook.synopsis}</td>
						<td>
							<button>
								<a href="${tempLink}">Update</a>
							</button> <br>
							<button>
								<a href="${deleteLink}"
					    		onclick="if(!(confirm('do you want to delete student ?'))) return false">Delete</a>
							</button>
						</td>
					</tr>
				</c:forEach>


			</table>
		</div>
	</div>

</body>
</html>