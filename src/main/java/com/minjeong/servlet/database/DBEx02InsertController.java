package com.minjeong.servlet.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.minjeong.servlet.common.MysqlService;

@WebServlet("/db/ex02/insert")
public class DBEx02InsertController extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		// 입력 전달받을 값 : 이름, 생년월일, 자기소개, 이메일
		String name = req.getParameter("name");
		String birthDay = req.getParameter("birthday");
		String introduce = req.getParameter("introduce");
		String email = req.getParameter("email");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "INSERT INTO `new_user`\r\n"
			+ "(`name`, `yyyymmdd`, `introduce`, `email`, `createdAt`, `updatedAt`)\r\n"
			+ "VALUES\r\n"
			+ "('" + name + "', '" + birthDay + "', '" 
			+ introduce + "', '" + email + "', now(), now());\r\n";
		
		int count = mysqlService.update(query);

		
		mysqlService.disConnect();
		
		// 위의 쿼리를 다 수행한 후 페이지를 리스트 페이지로 이동한다.
		// redirect
		// 이 페이지에서는 결과를 보여주지 않음
		
		resp.sendRedirect("/db/ex02.jsp");
		
		// + 삭제를 위한 페이지 따로 추가
		// delete query 수행
		
	}

}
