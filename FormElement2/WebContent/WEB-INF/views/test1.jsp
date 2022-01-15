<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	<form:form action="result" modelAttribute="dataBean">
		<form:select path="a1">
			<form:option value="data1">항목1</form:option>
			<form:option value="data2">항목2</form:option>
			<form:option value="data3">항목3</form:option>
		</form:select>
		<hr>
		<form:select path="a2">
			<form:options items="${requestScope.data_list1}"/>
		</form:select>
		<hr>
		<form:select path="a3">
			<form:options items="${requestScope.data_list2 }"/>
		</form:select>
		<hr>
		<form:select path="a4">
			<form:options items="${requestScope.data_list3 }" itemLabel="key" itemValue="value"/>
		</form:select>
		
	</form:form>
</body>
</html>