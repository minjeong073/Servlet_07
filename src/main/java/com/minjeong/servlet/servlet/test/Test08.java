package com.minjeong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test08")
public class Test08 extends HttpServlet{
	
	List<String> list = new ArrayList<>(Arrays.asList(
		"강남역 최고 맛집 소개 합니다.", 
        "오늘 기분 좋은 일이 있었네요.", 
        "역시 맛집 데이트가 제일 좋네요.", 
        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
        "자축 저 오늘 생일 이에요."
	));
	
	List<String> newList = new ArrayList<>();
	
	// 맛집 length=2
	// 78 -> 7 + 2 add <b> , 7 add <b>
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String search = req.getParameter("search");
		
		int startIndex = 0;
		int endIndex = 0;
		
		for(String sentence : list) {
			if (sentence.contains(search)) {
				
				startIndex = sentence.indexOf(search);
				endIndex = startIndex + search.length();
				
				String newSentence1 = sentence.substring(0, startIndex);
				String newSentence2 = sentence.substring(endIndex);
				
				newList.add(newSentence1 + "<b>" + search + "</b>" + newSentence2);
			}
		}
		
		out.println("<html> <head> <title> 검색 </title> </head>");
		out.println("<body>");
		
		for(String sentence : newList) {
			out.println(sentence + "<hr>");
		}
		out.println("</body> </html>");
		
		newList.clear();
	}

}
