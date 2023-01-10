<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>글보기</h1>
<table>
	<tr>
		<th>제목</th>
		<td>${board.title }</td>
	</tr>
	<tr>
		<th>글쓴이</th>
		<td>${board.writer }</td>
	</tr>
	<tr>
		<th>글내용</th>
		<td>${board.content }</td>
	</tr>
</table>
</body>
</html>