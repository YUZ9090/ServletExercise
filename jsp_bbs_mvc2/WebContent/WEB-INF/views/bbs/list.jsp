<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


<h1>Board List</h1>
<table border=1>
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>이메일</td>
	</tr>
	<c:forEach var = "board" items="${boardlist}">
	<tr>
		<td>${board.num }</td>
		<td><a href="detail.do?num=${board.num }">${board.title }</a></td>
		<td>${board.author }</td>
		<td>${board.email }</td>
	</tr>	
	</c:forEach>

</table>

<a href="write.do">글쓰기</a>
</body>
</html>