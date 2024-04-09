package com.mkpits.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationResponse
 */
@WebServlet("/RegistrationResponse")
public class RegistrationResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationResponse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		//get writer
		PrintWriter out=response.getWriter();
		
		// generate html content
		out.println("<html><body>");
		out.println("<h2>Welcome !!!!</h2>");
		out.println("<hr>");
		out.println("The Student is confirmed :"+request.getParameter("fname")+" "+request.getParameter("lname"));

	}

}
