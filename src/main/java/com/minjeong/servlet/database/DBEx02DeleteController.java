package com.minjeong.servlet.database;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.minjeong.servlet.common.MysqlService;

@WebServlet("/db/ex02/delete")
public class DBEx02DeleteController extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String id = req.getParameter("id");
		
		// DELETE 쿼리 수행
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		// 전달받은 id 기반으로 지워야 함
		String query = "DELETE FROM `new_user` WHERE `id` = " + id + ";";
		
		int count = mysqlService.update(query);
		
		mysqlService.disConnect();
		
		// redirect
		// 리스트 페이지 다시 보여주기
		resp.sendRedirect("/db/ex02.jsp");
		
	}

}
