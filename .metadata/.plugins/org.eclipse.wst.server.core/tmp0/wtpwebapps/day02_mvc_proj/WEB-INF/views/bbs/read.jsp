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
<h1>�Խñ��б�</h1>

<table style="width:100%">
<tr>
	<th>�۹�ȣ</th>
		<th>${no}</th>
	</tr>
	<tr>
		<th>����</th>
		<th>${title}</th>
	</tr>
	
	<tr>
		<th>����</th>
		<th>${article}</th>
	</tr>

	
</table>
<a href="delete.do">�Խù� ����</a>

</body>
</html>