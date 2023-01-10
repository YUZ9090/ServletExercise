<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>게시글보기</h1>
<table>
	<tr>
		<td>작성자</td>
		<td>${board.author }</td>
	</tr>
	<tr>
		<td>이메일</td>
		<td>${board.email }</td>
	</tr>
	<tr>
		<td>제목</td>
		<td>${board.title }</td>
	</tr>
	<tr>
		<td>내용</td>
		<td>${board.content }</td>
	</tr>

</table>
<a href="update.do?num=${board.num }">[글수정]</a>
<a href="delete.do?num=${board.num }">[글삭제]</a>

</form>
</body>
</html>