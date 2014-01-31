package org.sonatype.mavenbook.web;

import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Date now = new Date();
		PrintWriter out = response.getWriter();
		out.println("The SimpleServlet was Executed at " + now);
		out.flush();
		out.close();
	}
}