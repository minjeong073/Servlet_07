package com.minjeong.servlet.database;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.minjeong.servlet.common.MysqlService;

@WebServlet("/db/test02/delete")
public class DBTest02DeleteController extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String id = req.getParameter("id");
		
		String deleteQuery = "DELETE FROM `bookmark` WHERE `id` = " + id + ";";
		
		int count = mysqlService.update(deleteQuery);
		
		mysqlService.disConnect();
		
		resp.sendRedirect("/db/test02.jsp");
	}

}
