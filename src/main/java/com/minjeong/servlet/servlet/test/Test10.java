package com.minjeong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class Test10 extends HttpServlet{

	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html");
		
		String inputId = req.getParameter("id");
		String inputPassword = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html> <head> <title> 로그인 </title> </head> <body> <h2>");
		
		if (!userMap.get("id").equals(inputId)) {
			out.println("id 가 일치하지 않습니다.");
		} else if (!userMap.get("password").equals(inputPassword)) {
			out.println("password 가 일치하지 않습니다.");
		} else {
			out.println(userMap.get("name") + "님 환영합니다.");
		}
		
		out.println("</h2> </body> </html>");
	}	
}
