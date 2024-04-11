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
			listStudents(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException();
		}
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
