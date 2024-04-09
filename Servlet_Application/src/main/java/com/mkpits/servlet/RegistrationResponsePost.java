package com.mkpits.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationResponsePost
 */
@WebServlet("/RegistrationResponsePost")
public class RegistrationResponsePost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationResponsePost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
