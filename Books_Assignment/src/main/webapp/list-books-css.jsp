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
<link type="text/css" rel="stylesheet" href="css/Style.css"></link>
<link type="text/css" rel="stylesheet" href="css/search.css"></link>

<script> function showMore(id) {
	
	var button = document.querySelector('button[onclick ="showMore(\''+id+'\')"]');
	var element = document.getElementById(id);
	
	
	if(element.style.display === '-webkit-box'){
		element.style.display ='block';
		button.textContent = 'Read Less';
	}else{
		element.style.display ='-webkit-box';
		button.textContent = 'Read More';
	}
	
} </script>
</head>

<%
//get the student the RequestDispatcher
List<BooksModel> theStudents = (List<BooksModel>) request.getAttribute("BOOKS_LIST");
%>
<body>


	<div id="wrapper">
		<div id="header">
			<h2>Books Collection</h2>
		</div>
	</div>
	<form action="">
	<i class="bi bi-search"></i>
	<input id="search1" type="search" placeholder="Search Books Here">
	
	
	</form>
	

	<input type="button" value="Add books"
		onclick="window.location.href = 'add-book-form.jsp'; return false;"
		id="list-books-css">
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
						<td> <p id="genres_${tempBook.id}">${tempBook.genres}</p> <button id="btn1" type="button" onclick="showMore('genres_${tempBook.id}')">Read More</button> </td>
						<td><p id="characters_${tempBook.id}">${tempBook.characters}</p> <button id="btn2" type="button" onclick="showMore('characters_${tempBook.id}')">Read More</button></td>
						<td><p id="synopsis_${tempBook.id}">${tempBook.synopsis}</p> <button id="btn3" type="button" onclick="showMore('synopsis_${tempBook.id}')">Read More</button></td>
						<td>
							<button id="update">
								<a href="${tempLink}">Update</a>
							</button> <br>
							<button id="delete">
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