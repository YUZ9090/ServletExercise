<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.comstudy21.myweb.util.JdbcUtil"%>
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
//데이터가 테이블에 입력되도록 테스트
String name = "TEST";
String phone = "010-1234-4371";
String email = "test@aaa.com";

Connection conn = JdbcUtil.getConnection();
String sql = "insert into saram(name, phone, email) values (?,?,?)";
//Statement를 상속받았음
//sql을 미리 준비해서 쓰는거
PreparedStatement pstmt = conn.prepareStatement(sql);
//변수대입
//이렇게하면 포맷형태로되어잇엇던게 채워진당.
pstmt.setString(1,name);
pstmt.setString(2,phone);
pstmt.setString(3,email);

//위에서이미했기때문에 인자없는 업데이트쓰면됨.
int cnt_result = pstmt.executeUpdate();	//리턴형 int - 처리된갯수
if(cnt_result>0){
	System.out.println("입력성공!"); //System.붙이면 콘솔에찍힘
}else{
	System.out.println("입력실패!");
}
//업캐스팅되므로 pstmt 넣어도된당
JdbcUtil.close(conn, pstmt, null);
//다시 보기화면 리다이렉트.
response.sendRedirect("TestJdbcUtil.jsp");
%>

</body>
</html>