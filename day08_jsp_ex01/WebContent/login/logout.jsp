<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>로그아웃 페이지</h1>
<%
//세션비움
session.invalidate();
//어플리케이션 비움
application.removeAttribute("appId");
application.removeAttribute("appName");

response.sendRedirect("home.jsp");
%>

</body>
</html>