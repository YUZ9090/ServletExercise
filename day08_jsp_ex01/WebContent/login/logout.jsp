<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>�α׾ƿ� ������</h1>
<%
//���Ǻ��
session.invalidate();
//���ø����̼� ���
application.removeAttribute("appId");
application.removeAttribute("appName");

response.sendRedirect("home.jsp");
%>

</body>
</html>