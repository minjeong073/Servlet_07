package com.minjeong.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// response header 조작
		// 어떤 형태의 데이터 인지 알려줌 데이터의 데이터
		response.setCharacterEncoding("utf-8");
		// 데이터 타입
		response.setContentType("text/plain");	// MIME 표준으로 정해짐
		
		// 현재 날짜와 시간 보여주기
		// 2022-07-18 18:19:45
		// Date class 활용
		Date now = new Date();
		
		// response body 에 값을 쓰기 위해 PrintWriter class 활용
		PrintWriter out = response.getWriter();
		out.println(now);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateTimeString = formatter.format(now);
				
		out.println(dateTimeString);
	}
	
}
