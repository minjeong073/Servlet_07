package com.minjeong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class Test06 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json");
		
		PrintWriter out = resp.getWriter();
		
		int number1 = Integer.parseInt(req.getParameter("number1"));
		int number2 = Integer.parseInt(req.getParameter("number2"));
		
		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		double division = number1 / number2;
		
//		{"addition" : addition, "subtraction" : subtraction, "multiplication" : multiplication, "division" :division}
		
		// json parse error 
		// : \r, \n, \t, \f 가 포함될 경우
		// : 여분의 , 가 있을 경우
		// 작은 따옴표로 property 표현할 경우
		
		out.println("{\"addition\":" + addition
				+ ", \"subtraction\":" + subtraction
				+ ", \"multiplication\":" + multiplication
				+ ", \"division\":" + division + "}");
	}
}
