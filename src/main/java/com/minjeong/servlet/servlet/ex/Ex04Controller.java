package com.minjeong.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex04")
public class Ex04Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		// 이름과 생년월일 입력 받고 , 이름과 나이 html 로 보여주기
		// form tag 의 input tag 의 name="name", name="birthday" 인 param 가져옴
		String name = req.getParameter("name");
		String birthDay = req.getParameter("birthday");
		
		int year = Integer.parseInt(birthDay.substring(0,4));
		int age = 2022 - year + 1;
		
		out.println("<html> <head> <title> Get Method </title> </head>");
		out.println("<body> <h2> 이름 : " + name + "</h2>");
		out.println("<h3> 나이 : " + age + "</h3> </body> </html>");
		
	}

}
