<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	<h3>data1 : ${param.data1}</h3> <!-- param. 은 파라미터를 뜻함 (저거 안붙이고 그냥 data1만 치면 아무것도 안뜬다) -->
	<h3>data2 : ${param.data2}</h3>
	<h3>data2 : ${data2}</h3>  <!-- 위에줄과 다른결과! 이건 출력안됨 결과값 -> data2 :  만 뜬다 파라미터는 앞에 param. 을 추가하자 -->
</body>
</html>