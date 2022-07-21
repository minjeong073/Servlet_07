package com.minjeong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test02 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/plain");
		
		PrintWriter out = resp.getWriter();
		
		Date now = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("HH시 mm분 ss초");
		
		out.println("현재 시간은 " + formatter.format(now) + " 입니다.");
		
	}

	
	
}
