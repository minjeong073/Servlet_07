<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 스크립트 요소</title>
</head>
<body>

	<!-- 1. 점수들의 평균 구하기 -->
	<%
		int[] scores = {80, 90, 100, 95, 80};
		int sum = 0;
		double avg = 0;
		
		for(int score : scores) {
			sum += score;
			avg = (double) sum / scores.length; 
		}
	
	%>
	
	<h3>점수 평균은 <%= avg %> 입니다.</h3>
	
	<!-- 2. 채점 결과 -->
	
	<%
	List<String> scoreList = Arrays.asList
	(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	
	int score = 0;
	
	for(String str : scoreList) {
		if (str.equals("O")) {
			score += 10;
		}
	}
	
	%>
	
	<h3>채점 결과는 <%= score %> 점 입니다.</h3>

	<%!
		
	%>


</body>
</html>