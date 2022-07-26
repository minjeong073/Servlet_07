<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 제어문</title>
</head>
<body>

	<%
	
		// 과일 이름 리스트
		List<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("딸기");
		
		String result = "";
		for(String item : fruits) {
			// result += item + " ";
			out.println(item);
			// out.println("<h2>" + item + "</h2>"); // out.println 은 권장하지 않음
		}

	%>

	<!-- <h1><%=result %></h1> -->

	
	<!-- 필요한 곳만 java code 로 처리하고 나머지는 html 로 쓸 수 있음 -->

	<%
	
		for(String item : fruits) {
	%>
			<h2> <%= item %></h2>
	<%
		}
	%>


	<!-- 반복되는 구간 tag 잘 확인해서 java code 작성하기 -->
	
	<table border="1">
	<%
		for(String item : fruits) {
	%>
		<tr>
			<td><%= item %></td>
		</tr>
	<%
		}
	%>
	</table>


</body>
</html>