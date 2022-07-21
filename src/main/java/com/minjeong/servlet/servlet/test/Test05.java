package com.minjeong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test05")
public class Test05 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		int dan = Integer.parseInt(req.getParameter("number"));
		
		out.println("<html> <head> <title> 구구단 </title> </head>");
		out.println("<body> <ul>");
		
		for (int i = 1; i <= 9; i++) {
			out.println("<li> " + dan + " X " + i + " = " + (dan * i) + "</li>");
		}
		out.println("</ul> </body> </html>");
		
	}
}
