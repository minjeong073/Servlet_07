package com.minjeong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test09")
public class Test09 extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html");
		
		String name = req.getParameter("name");
		String resume = req.getParameter("resume");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html> <head> <title> 입사 지원 </title> </head> <body>");
		out.println("<h2>" + name + "님 지원이 완료되었습니다. </h2> <hr> 지원 내용 <br>");
		out.println(resume);
		
	}
}
