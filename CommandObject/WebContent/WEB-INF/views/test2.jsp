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
	<h3>data1 : ${requestScope.testData.data1 }</h3> <!-- 내가 정한 이름인 testData를 dataBean(원래는DataBean인데 첫번째소문자) 대신에 사용한다 -->
	<h3>data2 : ${testData.data2 }</h3> <!-- requestScope는 생략가능 & Controller에서 내가정한이름. 으로 출력가능-->
</body>
</html>