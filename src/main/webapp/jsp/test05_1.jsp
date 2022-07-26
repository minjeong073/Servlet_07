<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int centimeter = Integer.parseInt(request.getParameter("length"));
	String[] types = request.getParameterValues("type");
	
	String result = "";
	
	for(String type : types) {
		if (type.equals("inch")) {
			double inch = centimeter * 0.39;
			result += inch + "in<br>";
		} else if (type.equals("yard")) {
			double yard = centimeter * 0.010936133;
			result += yard + "yd<br>";
		} else if (type.equals("feet")) {
			double feet = centimeter * 0.032808399;
			result += feet + "ft<br>";
		} else if (type.equals("meter")) {
			double meter = centimeter / 100.0;
			result += meter + "m<br>";
		}
	}
%>

<div>

	<h2>변환 결과</h2>
	<h3><%= centimeter %> cm</h3>
	
	<hr>
	
	<h3><%=result %></h3>
</div>


</body>
</html>