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
    int number1 = Integer.parseInt(request.getParameter("number1"));
    String operatorString = request.getParameter("operator");
    int number2 = Integer.parseInt(request.getParameter("number2"));
	
    double result = 0;
    String operator = "";
    switch (operatorString) {
        case "plus":
            result = number1 + number2;
            operator = "+";
            break;
        case "minus":
            result = number1 - number2;
            operator = "-";
            break;
        case "multiple":
            result = number1 * number2;
            operator = "x";
            break;
        case "divide":
            result = (double) number1 / number2;
            operator = "/";
    }

%>

<div class="container">
    <h2>계산 결과</h2>
    <span class="display-4"><%=number1%> <%=operator%> <%=number2%> = <span class="text-primary"><%=result%></span></span>
</div>

</body>
</html>