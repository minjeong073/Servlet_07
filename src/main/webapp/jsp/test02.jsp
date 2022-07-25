<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get method - 링크</title>
</head>
<body>

<%
	String input = request.getParameter("link");

	Date now = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 dd일 HH시 mm분 ss초");
	String date = formatter.format(now);
	
	String str = "";
	if (input.equals("date")) {
		str = "오늘 날짜 " + date.substring(0, 12);
	} else if (input.equals("time")) {
		str = "현재 시간 " + date.substring(13);
	}
	
%>

<h1><%= str %></h1>

</body>
</html>