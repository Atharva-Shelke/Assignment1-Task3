package com.Servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet02
 */
@WebServlet(name = "Servlet2", urlPatterns = {"/Servlet2" })
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Now in Servlet2\n_______________");
		int age=Integer.parseInt(request.getParameter("age"));
		String name=request.getParameter("name");
		response.setContentType("text/html");
		response.getWriter().println("<H2>Welcome "+name+"!!</H2>");
		response.getWriter().println("<br><a href='Servlet2_1'>To Servlet 2_1</a>");
		
		Cookie ck=new Cookie("nm",name);
		response.addCookie(ck);
	}

}
