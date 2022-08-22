<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>회원수정페이지</h1>
<form action="update.do" method="POST">
	<label for="">성명 : </label>
	<input type="text" name="name" value=""/>
	<label for="">연락처 : </label>
	<input type="text" name = "phone" value=""/>
	<label for="">이메일 : </label>
	<input type="text" name = "email" value=""/>
	<input type="submit" value ="수정"/>
</form>

</body>
</html>