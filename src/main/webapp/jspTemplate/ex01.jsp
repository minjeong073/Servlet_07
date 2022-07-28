<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재 시간</title>
</head>
<body>
	<h2>현재 시간</h2>
	
	<%-- 정적 방식 --%>
	<%@ include file="date.jsp" %>
	
	<%-- <% String dateString = ""; --%> 
	<%-- 에러 발생 Duplicate local variable dateString --%>
	<%-- 단점 : 기존 파일 안의 변수 등을 모두 파악해서 중복되는 경우 피해야함 --%>
	<%-- -> 정적 방식을 많이 쓰이지는 않음 --%>
	<%-- 장점 : 하나의 변수를 여러 페이지에서 동시에 쓸 경우 좋음 --%>
	
	
	
</body>
</html>