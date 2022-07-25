<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get method request</title>
</head>
<body>

<%
	// 이름과 생년월일을 전달받고, 나이 계산 후 테이블에 출력
	// 전달 받는 req 개체 없음 -> 자동으로 전달해줌
	String name = request.getParameter("name");
	String birthDay = request.getParameter("birthday");
	
	int year = Integer.parseInt(birthDay.substring(0,4));
	int age = 2022 - year + 1;


%>

	<table border="1">
	
		<tr>
			<th>이름</th>
			<!-- <td> <%= name %></td>  같은 표현 방법 -->
			<td><%= request.getParameter("name") %></td>
			
		</tr>
		
		<tr>
			<th>나이</th>
			<td><%= age %></td>
		</tr>
	
	</table>



</body>
</html>