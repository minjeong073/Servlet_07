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

	<!-- 3. 1부터 n까지 합계를 구하는 함수 -->

	<%!
		private int nSum = 0;

		public int NSum(int N) {
			for (int i = 1; i <= N; i++) {
				nSum += i;
			}
			return nSum;
		}
	%>

	<h3>1에서 50까지의 합은 <%= NSum(50) %> </h3>

	<!-- 4. 나이 구하기 -->
	<%
		String birthDay = "20010820";
		int year = Integer.parseInt(birthDay.substring(0, 4));
		int age = 2022 - year + 1;
	%>

	<h3><%= birthDay %> 의 나이는 <%= age%> 살 입니다. </h3>

</body>
</html>