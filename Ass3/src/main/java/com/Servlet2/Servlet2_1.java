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
@WebServlet(name = "Servlet2_1", urlPatterns = {"/Servlet2_1" })
public class Servlet2_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] cks=request.getCookies();
		boolean b=false;
		String name="";
		response.setContentType("text/html");

		if (cks==null) {
			response.getWriter().println("Wait a minute....WHO ARE YOU???");
			response.getWriter().println("<br><a href='Session.jsp'>Tell me!!</a>");
			return;
		}
		else {
			for (Cookie ck:cks) {
				String cnm=ck.getName();
				if (cnm.equals("nm")) {
					b=true;
					name=ck.getValue();
				}
			}
		}
		
		if (b==true) {
		System.out.println("And now In Servlet 2_1\n_______________");
		response.setContentType("text/html");
		response.getWriter().println("<H2>"+name+" this is Servlet 2_1</H2>");
		response.getWriter().println("<H3>Session Managed</H3>");
		}
		else {
			response.getWriter().println("Wait a minute....WHO ARE YOU???");
			response.getWriter().println("<br><a href='Session.jsp'>Tell me!!</a>");
		}

	}

}
