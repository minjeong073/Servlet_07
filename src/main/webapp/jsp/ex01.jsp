<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 기본 문법</title>
</head>
<body>

	<!-- html 주석 : 자바 코드를 포함시킨다 (브라우저 sources 에서 주석 보임) -->
	
	<%-- jsp 주석 : 자바 코드를 포함시킨다 (실행될 때 사라지기 때문에 브라우저에서 보이지 않음) --%>

	<h2>JSP 기본 문법</h2>
	
	<%
		// 자바 주석
		// 1부터 10까지의 합 구하기
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
	%>
	
	<h3>합계 : <%= sum %> </h3>
	
	<input type="text" value="<%= sum %>">
	
	<%
		// 동물 이름 리스트
		// import 수동으로
		List<String> animals  = new ArrayList<>();
		animals.add("dog");
		animals.add("cat");
		
	
	%>
	
	<h3><%= animals.get(0) %></h3>
	<h3><%= animals.get(1) %></h3>
	
	<%! 
		// 멤버 변수
		private int number = 100;
	
		// 메서드
		// hello world 를 리턴하는 메서드
		
		public String getHelloWorld() {
			return "Hello World";
		}
		
		
	%>
	
	<h3><%= getHelloWorld() %></h3>


</body>
</html>