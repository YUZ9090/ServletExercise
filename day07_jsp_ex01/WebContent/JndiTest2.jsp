<%@page import="org.comstudy21.myapp.dbcp.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

Connection conn = JdbcUtil.getConnection("jdbc/h2DB");
out.println(conn);

%>
</body>
</html>