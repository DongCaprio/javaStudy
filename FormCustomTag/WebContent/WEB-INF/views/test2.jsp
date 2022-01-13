<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- 위에줄 꼭 쳐야작동 스프링 커스텀 태그를 사용하겠다!! -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test2</h1>
	<form:form modelAttribute="userDataBean" action="result">
		이름 : <form:input path="user_name"/><br>
		아이디 : <form:input path="user_id"/><br>
		비밀번호 : <form:password path="user_pw" showPassword="true"/><br>
		우편번호 : <form:input path="user_postcode"/><br>
		주소1 : <form:input path="user_address1"/><br>
		주소2 : <form:input path="user_address2"/><br>
		<button type="submit">확인</button>
	</form:form>
	<!-- test1.jsp와 완벽히 똑같은 결과 하지만 스프링 커스텀태그를 사용시에 
	훨신 더 간편하게 사용가능하다! -->
</body>
</html>