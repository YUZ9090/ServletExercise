<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>�Խñۺ���</h1>
<table>
	<tr>
		<td>�ۼ���</td>
		<td>${board.author }</td>
	</tr>
	<tr>
		<td>�̸���</td>
		<td>${board.email }</td>
	</tr>
	<tr>
		<td>����</td>
		<td>${board.title }</td>
	</tr>
	<tr>
		<td>����</td>
		<td>${board.content }</td>
	</tr>

</table>
<a href="update.do?num=${board.num }">[�ۼ���]</a>
<a href="delete.do?num=${board.num }">[�ۻ���]</a>

</form>
</body>
</html>