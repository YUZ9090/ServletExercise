<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입페이지</h1>
<form action="join.do" method="POST">
	<label for="">성명 : </label>
	<input type="text" name="name" value="TEST"/>
	<label for="">연락처 : </label>
	<input type="text" name = "phone" value="010-1212-1212"/>
	<label for="">이메일 : </label>
	<input type="text" name = "email" value="hong@aa.com"/>
	<input type="submit" value ="등록"/>
</form>

</body>
</html>