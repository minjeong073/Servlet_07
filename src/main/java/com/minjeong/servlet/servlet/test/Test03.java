package com.minjeong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class Test03 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		
		out.println("<html> <head> <title> 뉴스 기사 </title> </head>");
		out.println("<body> <h2> [단독] 고양이가 야옹해 </h2>");
		out.println("기사 입력시간 : " + formatter.format(now) + " <hr> 끝 </body> </html>");
		
		
	}
}
