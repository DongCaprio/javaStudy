<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test2</h1>
	<h3>${requestScope.data1 }</h3>
	<h3>${requestScope.data2 }</h3> <!-- requestScope는 생략가능 -->
	<h3>${data2 }</h3> 				<!-- 위에줄과 동일함(but 유지보수할때 편하려면 붙히는것도 좋다)  -->
</body>
</html>