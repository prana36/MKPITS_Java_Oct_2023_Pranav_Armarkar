package com.mkpits.jdbc1;

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


/**
 * Servlet implementation class StudentControllerServletNew
 */
@WebServlet("/StudentControllerServletNew")
public class StudentControllerServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
private StudentDbUtility studentDbUtility;
	
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();

		// create our student db util.. and pass in the conn pool/ dataSource
		try {
			studentDbUtility = new StudentDbUtility(dataSource);
		} catch (Exception exc) {
			// TODO: handle exception
			throw new ServletException(exc);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
				listStudents(request,response);
				break;
			case "ADD" :
				addStudent(request,response);
				break;
			default:
				listStudents(request,response);
			}
			
			listStudents(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException();
		}
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response)throws Exception {
		//read student data from form
				String firstName = request.getParameter("firstName");
				String lastName = request.getParameter("lastName");
				String email = request.getParameter("email");
				
				// create new Student_Model object
				Student_Model theStudent = new Student_Model(firstName, lastName, email);
				
				////add student to the database
				studentDbUtility.addStudent(theStudent);
				
				//send back to main page (the student list)
				listStudents(request, response);

		
	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// get student from db util
		List<Student_Model> student_Models = studentDbUtility.getStudents();

		// add student to the request
		request.setAttribute("STUDENT_LIST", student_Models);

		// send to jsp page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-student-button.jsp");
		dispatcher.forward(request, response);

	}

}
