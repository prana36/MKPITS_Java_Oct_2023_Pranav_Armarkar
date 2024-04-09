package com.mkpits.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MVCDemoServlet
 */
@WebServlet("/MVCDemoServlet")
public class MVCDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MVCDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Add Data
				String[] students = { "Pranav", "Raj", "Vinay" };
				request.setAttribute("student_list", students);

				// get Request Dispatcher
				RequestDispatcher dispatcher = request.getRequestDispatcher("/view_student.jsp");

				// forwarding the request to jsp
				dispatcher.forward(request,response);
	}

}
