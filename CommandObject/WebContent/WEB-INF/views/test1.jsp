<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>																												   <!-- data1은 jsp에서 지정한이름  바로 밑에줄은 Controller에서 get메서드 안쓰고 그냥 아무것도 안써도 사용가능!! -->
	<h3>data1 : ${requestScope.dataBean.data1 }</h3> <!-- !중요한! 사용법 @ModelAttribute DataBean bean 로 전달하면 클래스명인 DataBean.data1 으로 가져올수있는데 클래스이름인 DataBean의 맨앞글자로 소문자로 바꿔서 dataBean.data1로 사용한다-->
	<h3>data1 : ${dataBean.data1 }</h3>
	<h3>data2 : ${dataBean.data2 }</h3>
</body>
</html>