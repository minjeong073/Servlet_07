<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>

<%
	int length = Integer.parseInt(request.getParameter("length"));
	String[] units = request.getParameterValues("unit");
	
	String result = "";
	
	for(String unit : units) {
		if (unit.equals("inch")) {
			result += length / 2.54 + " in <br>";
		}
		else if (unit.equals("yard")) {
			result += length / 91.44 + " yd <br>";
		}
		else if (unit.equals("feet")) {
			result += length / 30.48 + " ft <br>";
		}
		else if (unit.equals("meter")) {
			result += length / 100.0 + " m <br>";
		}
	}
	
%>
<div class="container">

	<h2>변환 결과</h2>
	<span class="font-weight-bold">	
		<%= length %> cm
		<br>
		<hr>
		<%= result %>
	</span>
</div>


</body>
</html>