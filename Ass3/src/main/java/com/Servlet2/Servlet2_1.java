package com.Servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet02
 */
//@WebServlet(name = "Servlet2_1", urlPatterns = {"/Servlet2_1" })
public class Servlet2_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(false);  
        String n=(String)session.getAttribute("nm");  
		//Cookie[] cks=request.getCookies();
		boolean b=false;
//		String name="";
//		response.setContentType("text/html");
//
		if (n=="") {
			response.setContentType("text/html");
			response.getWriter().println("Wait a minute, I know you are age but....WHO ARE YOU???");
			response.getWriter().println("<br><a href='Session.jsp'>Tell me!!</a>");
			return;
		}
		else {
//			for (Cookie ck:cks) {
//				String cnm=ck.getName();
//				if (cnm.equals("nm")) {
					b=true;
//					name=ck.getValue();
//				}
//			}
		}
		
		if (b==true) {
		System.out.println("And now In Servlet 2_1\n_______________");
		response.setContentType("text/html");
		response.getWriter().println("<H2>"+n+" this is Servlet 2_1</H2>");
		response.getWriter().println("<H3>Session Managed</H3>");
		response.getWriter().println("by storing name given in servlet 2 and using it in servlet2_1");
		}
		else {
			response.getWriter().println("Wait a minute....WHO ARE YOU???");
			response.getWriter().println("<br><a href='Session.jsp'>Tell me!!</a>");
		}

	}

}
