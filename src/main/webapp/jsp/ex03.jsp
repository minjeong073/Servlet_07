<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>post method</title>
</head>
<body>
	
	<%
		// 닉네임 전달받고 출력
		// get, post 상관없이 다 받음
		String nickname = request.getParameter("nickname");
	
		String animal = request.getParameter("animal");
		
		String fruit = request.getParameter("fruits");
		
		// String food = request.getParameter("food");
		// 하나의 파라미터로 여러개가 넘어올 경우 request.getParameterValues("food")
		// -> String[] 으로 값 받아오기
		String[] foodArray = request.getParameterValues("food");
		
		// 문자열 변환
		String foodString = "";
		for(int i = 0; i < foodArray.length; i++) {
			foodString += foodArray[i] + " ";
		}
	
		
	%>
	
	
	<!-- input text -->
	<div> nickname : <%= nickname %></div>
	
	<!-- input radio -->	
	<div> animal : <%= animal %></div>	
	<!-- -> on 이라는 value 가 전달됨 
	-> value를 지정해야함 -->
	
	<!-- input select -->
	<div>fruit : <%= fruit %></div>
	<!-- option tag 의 value 속성 값이 우선순위,
	value 가 없는 경우 option tag 의 내용이 전달 -->
	
	<!-- input checkbox -->
	<div>food : <%= foodString %></div>
	<!-- java.lang.String;@46c ... 주소값으로 전달
	-> 문자열로 변환 -->
	
	
</body>
</html>