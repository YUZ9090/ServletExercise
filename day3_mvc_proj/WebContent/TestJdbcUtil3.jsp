<%@page import="java.sql.PreparedStatement"%>
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
//saram 테이블에서 name필드가 'TEST'인 행 삭제하는 jdbc 구현

Connection conn = JdbcUtil.getConnection();
String sql = "DELETE FROM saram WHERE name = ?";

PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1,"TEST");

int cnt_result = pstmt.executeUpdate();
if(cnt_result>0){
	System.out.println("삭제성공!"); 
}else{
	System.out.println("삭제실패!");
}

JdbcUtil.close(conn,pstmt,null);
response.sendRedirect("TestJdbcUtil.jsp");
%>
</body>
</html>