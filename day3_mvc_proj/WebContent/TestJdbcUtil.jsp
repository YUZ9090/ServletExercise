<%@page import="org.comstudy21.myweb.model.SaramDTO"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
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
<h1> 테스트</h1>
<hr />
<%
	Connection conn = JdbcUtil.getConnection();
	out.println(conn+"<br/>");
	
	//saram 테이블 내용 읽어올거임
	Statement stmt =conn.createStatement(); //conn을 이용해서 갖고올수있음
	ResultSet rs =stmt.executeQuery("SELECT * FROM SARAM");
	//테이블을 읽을수있는 커서가오는것임(테이블이오는게아님.)
	while(rs.next()){
		//넥스트를 할때ㅔ마다 row(레코드)를 한줄씩읽어옴
		//next가 null일때 = 레코드를 다읽었을때 빠져나간다
		int id = rs.getInt("id");	//getInt()에 레코드 순서(1)를넣어도되고 이름("id")를넣어도됨
		String name = rs.getString("name");
		String phone = rs.getString("phone");
		String email = rs.getString("email");
		SaramDTO dto = new SaramDTO(id,name,phone,email);
		out.println(dto+"<br/>"); //jsp 자동줄바꿈안되므로 br넣어줌
	}
	



//다썼음 닫아줌
//JdbcUtil.close(conn);
//JdbcUtil에서 한번에 닫을수있따면 더 편리하므로 구현한다.
JdbcUtil.close(conn,stmt,rs);
	
%>
</body>
</html>