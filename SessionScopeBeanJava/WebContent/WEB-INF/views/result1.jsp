<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result1</h1>
	<h3>sessionBean1.data1 : ${requestScope.sessionBean1.data1 }</h3>
	<h3>sessionBean1.data2 : ${sessionBean1.data2 }</h3> <!-- 이렇게해도잘출력된다 굳이 앞에 쓰는이유는 헷갈리지 않기위해  -->
	<h3>sessionBean2.data3 : ${requestScope.sessionBean2.data3 }</h3>
	<h3>sessionBean2.data4 : ${requestScope.sessionBean2.data4 }</h3>
	<%-- ${}안에는 model를 이용해서 넘겼으므로 sessionScope.이 아닌 requestScope를 붙여야한다!!!!!헷갈림주의  --%>
	<h3>sessionBean3.data5 : ${requestScope.sessionBean3.data5 }</h3>
	<h3>sessionBean3.data5 : ${requestScope.sessionBean3.data6 }</h3>
	<h3>sessionBean3.data5 : ${requestScope.sessionBean4.data7 }</h3>
	<h3>sessionBean3.data5 : ${sessionBean4.data8 }</h3>
	
</body>
</html>