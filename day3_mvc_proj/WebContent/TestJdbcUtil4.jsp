<%@page import="org.comstudy21.myweb.util.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
//��������

Connection conn = JdbcUtil.getConnection();
String sql = "insert into saram(name, phone, email) values (?,?,?)";

%>
</body>
</html>