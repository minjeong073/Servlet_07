package com.minjeong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class Test07 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String address = req.getParameter("address");
		String cardName = req.getParameter("cardname");
		int price = Integer.parseInt(req.getParameter("price"));
		
		out.println("<html> <head> <title> 주문하기 </title> </head>");

		// 서울시 아닌 경우
		if (!address.contains("서울시")) {
			out.println("<h1> 배달 불가 지역입니다. </h1>");
		}
		// 신한카드 인 경우
		else if (cardName.equals("신한카드")) {
			out.println("<h1> 결제 불가 카드입니다. </h1>");
		} 
		// 정상인 경우
		else {	
			out.println("<body> <h1>" + address + " 배달 준비중 </h1> <hr>");
			out.println("결제금액 : " + price + "원");
		}
	
	}

}
