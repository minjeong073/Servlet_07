package com.minjeong.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex02")
public class Ex02Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		
		// 1 ~ 10 까지의 합을 html 로 구성
		out.println("<html> <head> <title>합계</title> </head> <body>");
		out.println("합계 : <b> " + sum + " </b> </body> </html>");
		
		
	}

}
