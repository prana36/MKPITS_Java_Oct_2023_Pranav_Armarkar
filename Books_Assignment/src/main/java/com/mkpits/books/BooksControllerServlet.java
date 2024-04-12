package com.mkpits.books;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.mkpits.books.BooksDbUtil;


/**
 * Servlet implementation class BooksControllerServlet
 */
@WebServlet("/BooksControllerServlet")
public class BooksControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
private BooksDbUtil booksDbUtil;
	
	@Resource(name="jdbc/web_books")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		// create our student db util.. and pass in the conn pool/ dataSource
		try {
			booksDbUtil = new BooksDbUtil(dataSource);
			
		} catch (Exception exc) {
					// TODO: handle exception
			throw new ServletException(exc);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			//read the "command" parameter
			String theCommand = request.getParameter("command");
			
			//if the command is missing, then default to listing student
			
			if(theCommand == null) {
				theCommand = "LIST";
			}
			
			//route to the appropriate method
			switch (theCommand) {
			case "LIST" : 
				listBooks(request,response);
				break;
			case "ADD" :
				addBooks(request,response);
				break;
			default:
				listBooks(request,response);
			}
			listBooks(request , response);
		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException();
		}
		
	}

	private void addBooks(HttpServletRequest request, HttpServletResponse response)throws Exception {
		// TODO Auto-generated method stub
		//read Book data from form
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String date = request.getParameter("date");
		String genres = request.getParameter("genres");
		String characters = request.getParameter("characters");
		String synopsis = request.getParameter("synopsis");
		
		// create new booksModel object
		BooksModel theBooks = new BooksModel(title,author,date,genres,characters,synopsis);
		
		////add student to the database
		booksDbUtil.addBooks(theBooks);
		
		//send back to main page (the Book list)
		listBooks(request, response);
	}

	private void listBooks(HttpServletRequest request, HttpServletResponse response)throws Exception {
		// TODO Auto-generated method stub
		List<BooksModel> books =booksDbUtil.getbooks();
		// add Books to the request
		request.setAttribute("BOOKS_LIST", books);
				
		// send to jsp page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-books-css.jsp");
		dispatcher.forward(request, response);
		
	}

}
