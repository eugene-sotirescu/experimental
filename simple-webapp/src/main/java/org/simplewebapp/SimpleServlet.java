package org.simplewebapp;

import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		Date now = new Date();
		PrintWriter out = response.getWriter();
		out.println("<pre>");
		out.println("The SimpleServlet was Executed at " + now);
		out.println("output of getContextPath: " + request.getContextPath());
		out.println("output of getRequestURL: " + request.getRequestURL());
		out.println("output of getServletPath: " + request.getServletPath());
		out.println("</pre>");
		out.flush();
		out.close();
	}
}