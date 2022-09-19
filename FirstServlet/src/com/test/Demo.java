package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Demo() {
		System.out.println("in testing constructor");
		}
		@Override
		public void destroy() {
		System.out.println("in destroy method");
		}
		@Override
		public void init() {
		System.out.println("in init method");
		}
		protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		System.out.println("in service method");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>This is the first servlet......</h1>");
}
}