<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>게시글작성</h1>
<form action="write.do" method="POST">
	<label for="">게시글제목 : </label>
	<input type="text" name="title" value="제목 입력"/>
	<br>
	<label for="">내용 : </label>
	<input type="text" name = "aritcle" value="내용 입력"/>
	<input type="submit" value ="등록"/>
</form>

</body>
</html>