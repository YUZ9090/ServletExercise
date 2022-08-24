<%@page import="org.comstudy21.myapp.dbcp.JdbcUtil"%>
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
Connection conn = JdbcUtil.getConnection("jdbc/h2DB");
out.println(conn);

%>
</body>
</html>