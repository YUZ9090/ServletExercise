<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>글수정하기</h1>
<form action="update.do?num=${board.seq }" method="POST">
<table>
	<tr>
		<td>작성자</td>
		<td><input type="text" size="30" name="author" /></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input type="text" size="30" name="email" /></td>
	</tr>
	<tr>
		<td>제목</td>
		<td><input type="text" size="50" name="title" /></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><textarea rows="10" cols="60" name="content" /></textarea></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="text" size="30" name="passwd" /></td>
	</tr>
</table>
<input type="submit" value="저장" />
</form>

</body>
</html>