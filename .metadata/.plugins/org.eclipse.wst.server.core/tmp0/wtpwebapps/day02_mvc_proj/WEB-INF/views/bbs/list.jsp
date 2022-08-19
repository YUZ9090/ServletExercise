<%@page import="org.comstudy21.myweb.bbs.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<style>
table, th, td {
  border:1px solid black;
}
</style>
<title>Insert title here</title>
</head>
<body>
<h1>게시글 목록</h1>
<%
List<BoardDTO> bbsList = (List<BoardDTO>)request.getAttribute("bbsList");
//넘겨줄 매개변수(게시글번호)
int bbsID =1;
%>
<table style="width:100%">
	<tr>
		<th>번호</th>
		<th>제목</th>
	</tr>
	<%
	for(BoardDTO bbs : bbsList){
		//게시글번호 저장
		bbsID = bbs.getNo();
	%>
	<tr>
		<th><%=bbs.getNo() %></th>
		<th><a href="read.do?artnum=<%=bbs.getNo() %>" ><%=bbs.getTitle() %></a></th>
	</tr>
	<%}%>
	
</table>
<a href="write.do">게시물 등록</a>
</body>
</html>