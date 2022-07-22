package com.minjeong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test09_1")
public class Test09Controller extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		// 이름과 자기소개 전달받아 출력하기
		
		String name = req.getParameter("name");
		String introduce = req.getParameter("introduce");
		
		out.println("<html> <head> <title> 지원 결과 </title> </head> <body>");
		out.println("<h1>" + name + "님 지원이 완료되었습니다. </h1> <hr>");
		out.println("지원내용 <br>");
		out.println(introduce + "</body> </html>");
		
	}

}
