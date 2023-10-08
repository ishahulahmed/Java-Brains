<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="org.koushik.javabrains.dto.User" scope="request">
<jsp:setProperty property="*" name="user" />
</jsp:useBean>

Hello <jsp:getProperty property="userName" name="user"/>
Address 1: <jsp:getProperty property="address1" name="user"/>
Address 2: <jsp:getProperty property="address2" name="user"/>
City: <jsp:getProperty property="city" name="user"/>
State: <jsp:getProperty property="state" name="user"/>
Pincode: <jsp:getProperty property="pincode" name="user"/>

</body>
</html>