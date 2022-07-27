<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
<%
	String searchMenu = request.getParameter("menu");
	String pointFilter = request.getParameter("pointFilter");
	// out.println(pointFilter);	// 체크되면 value 값 , 체크되지 않으면 null


	List<Map<String, Object>> list = new ArrayList<>();
	Map<String, Object> map = new HashMap<String, Object>() {{ put("name", "버거킹"); put("menu", "햄버거"); put("point", 4.3); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "BBQ"); put("menu", "치킨"); put("point", 3.8); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "교촌치킨"); put("menu", "치킨"); put("point", 4.1); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "도미노피자"); put("menu", "피자"); put("point", 4.5); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "맥도날드"); put("menu", "햄버거"); put("point", 3.8); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "BHC"); put("menu", "치킨"); put("point", 4.2); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "반올림피자"); put("menu", "피자"); put("point", 4.3); } };
	list.add(map);
%>


	<div class="container">
		
		<h1 class="text-center">검색 결과</h1>
		
		<table class="table text-center">
			<thead>
				<tr>
					<th>메뉴</th>
					<th>상호</th>
					<th>별점</th>
				</tr>
			</thead>
			
			<tbody>
			<% 
				for(Map<String, Object> store : list) { 
					// searchMenu = store.get("menu")
					if (searchMenu.equals(store.get("menu"))) {
						
						// pointFilter 체크 안됨 -> 보여주기
						// pointFilter 체크됨 -> 현재 맵의 point 가 4.0 이상이면 보여주기
						
						// if (pointFilter == null || 
						// (pointFilter.equals("true") && (Double) store.get("point") >= 4.0)) {
							// 타입이 double 이 확실할 경우에만 다운캐스팅
							// double, Double 둘 다 가능
							
						// +	
						// if (pointFilter.equals("true") ... ) 인 경우 null 조건이 뒤로 가게 되면 에러 발생
						// 앞의 것 참인 경우 뒤의 조건 확인 없이 넘어가기 때문에
						// 에러 발생할 수 있는 조건 먼저 작성
						
						
						// 다른 방법1
						// if (pointFilter == null || (Double) store.get("point") >= 4.0)
						// 앞의 조건이 거짓일 경우 뒤의 조건 넘어가기 때문에 
						// null 아니면 무조건 pointFilter 체크된 경우
						
						
						// 다른 방법2
						// 보여줘야 할 조건 2개
						// 보여주지 않아야 할 조건 명확히 하나 = pointFilter 체크됨 & 4.0 미만
						if (pointFilter != null && (Double) store.get("point") < 4.0) {
							continue;	// <tr> 넘어감
						}
			%>
				<tr>
					<td><%= store.get("menu") %></td>
					<td><%= store.get("name") %></td>
					<td><%= store.get("point") %></td>
				</tr>
			<% 
						//}
					}
				} 
			%>	
			</tbody>
		</table>	
	
	</div>




</body>
</html>