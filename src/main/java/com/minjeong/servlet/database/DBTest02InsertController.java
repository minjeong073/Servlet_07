package com.minjeong.servlet.database;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.minjeong.servlet.common.MysqlService;

@WebServlet("/db/test02/insert")
public class DBTest02InsertController extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String name = req.getParameter("name");
		String url = req.getParameter("url");
		
		String insertQuery = "INSERT INTO `bookmark`\r\n"
				+ "(`name`, `url`, `createdAt`, `updatedAt`)\r\n"
				+ "VALUES\r\n"
				+ "('" + name + "', '" + url + "', now(), now());\r\n";
		
		int count = mysqlService.update(insertQuery);
		
		mysqlService.disConnect();
		
		resp.sendRedirect("/db/test02.jsp");
	}

}
