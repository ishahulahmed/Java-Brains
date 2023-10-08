<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Testing JSPs</h3>

	<%!public int add(int a, int b) {
		return a + b;
	}%>
	
	
	<%
	int i = 1;
	int j = 2;
	int k;
	k = i + j;
	%>
	
	
	The Value of k is: <%=1 + 2%>
	
	<%
	k = add(3546, 87483);
	%>
	
	<br> The value of k is: <%=k%>!!
	
	<%
	for (i = 0; i < 5; i++) {
	%>
	
	<br> The new value of i = <%=i%>
	
	<% }%>
	
	

</body>
</html>