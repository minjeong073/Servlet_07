package com.minjeong.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03")
public class Ex03Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		// json
		resp.setContentType("application/json");
		
		
		PrintWriter out = resp.getWriter();
		
		// http method 호출 , java method 와는 관련 없음
		
		// 이름과 생년월일을 전달 받고, 이름과 나이를 html 출력
		
		// tomcat 이 파라미터 정보를 req 로 쉽게 전달 받게끔 도와줌
		
		String name = req.getParameter("name");
		String birthDay = req.getParameter("birthday");
		
		// birthDay 20000729
		String yearString = birthDay.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		int age = 2022 - year + 1;
		
//		out.println("<html> <head> <title> Get Method </title> </head>");
//		out.println("<body> <h2> 이름 : " + name + "</h2>");
//		out.println("<h3> 나이 : " + age + "</h3> </body> </html>");

		// json
		// {"name":"김민정", "age":25}
		// ["김민정", "김민지"]
		// [
//			{"name":"김민정", "age":25}
//			{"name":"김민지", "age":25}
//		   ]
		
		out.println("{\"name\":\"김민정\", \"age\":25}");
		
		
	}
}
