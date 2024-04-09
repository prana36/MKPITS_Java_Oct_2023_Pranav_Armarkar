package com.mkpits.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello_Servlet
 */
@WebServlet("/Hello_Servlet")
public class Hello_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// set content type
				response.setContentType("text/html");
				
				//get writer
				PrintWriter out=response.getWriter();
				
				// generate html content
				out.println("<html><body>");
				out.println("<h2>Hello From Pranav To Servlet </h2>");
				out.println("<hr>");
				out.println("The time on Server is :"+new java.util.Date());
				out.println("</body></html>");

	}

}
