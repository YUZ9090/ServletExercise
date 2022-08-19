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
<h1>게시글읽기</h1>

<table style="width:100%">
<tr>
	<th>글번호</th>
		<th>${no}</th>
	</tr>
	<tr>
		<th>제목</th>
		<th>${title}</th>
	</tr>
	
	<tr>
		<th>내용</th>
		<th>${article}</th>
	</tr>

	
</table>
<a href="delete.do">게시물 삭제</a>

</body>
</html>