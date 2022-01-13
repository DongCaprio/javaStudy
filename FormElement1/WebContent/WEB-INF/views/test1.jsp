<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- 필수 스프링 테그사용시 사용 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	<form:form modelAttribute="dataBean" action="result">
		<form:hidden path="a1"/>
		text : <form:input path="a2"/> <br>
		pass : <form:password path="a3" showPassword="true"/> <br>
		textarea : <form:textarea path="a4"/><br>
		<form:button disabled="true">확인 버튼</form:button>	
	</form:form>
</body>
</html>