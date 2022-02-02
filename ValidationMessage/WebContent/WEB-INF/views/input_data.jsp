<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
<!-- 이걸 추가해야 springTag사용가능 -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>input_data</h1>
	
	<form:form action="input_pro" modelAttribute="dataBean1" method="post">
		<%--request영역에 dataBean1이라는 Bean객체를 추출해서 
		객체안에 들어있는 변수의 이름과 path속성이 동알한 input태그에
		 값이 자동으로 주입된다--%>
		 data1 : <form:input path="data1" type='text'/><br>
		 		 <form:errors path="data1"/><br>
		 data2 : <form:input path="data2" type='text'/><br>
				 <form:errors path="data2"/><br>
				 <form:button type="submit">확인</form:button>
	</form:form>
	
	
	<%-- <form action="input_pro" method="post">
		data1 : <input type="text" name="data1">
		<spring:hasBindErrors name="dataBean1">
		dataBean1안에있는 프로퍼티들 중에서 유효성검사에
			통과하지 못한 것이 있는가
			<c:if test="${errors.hasFieldErrors('data1') }">
			data1이 통과하지 못했다면
				${errors.getFieldError('data1').defaultMessage }<br>
				<spring:message code="${errors.getFieldError('data1').codes[0] }"/>
				${errors.getFieldError('data1').codes[0] }
			</c:if>
				<br>
		</spring:hasBindErrors>
		data2 : <input type="text" name="data2"><br>
		<button type="submit">확인</button>
	</form> --%>
</body>
</html>




