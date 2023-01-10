<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>블로그 글쓰기</h1>
<form action="write.do" method="post">
제목 : <input type="text" name="title" value="블로그 연습 제목" /><br/>
글쓴이 : <input type="text" name="writer" value="블로그 연습 제목" /><br/>
내용 : <input type="text" name="content" value="블로그 연습 제목" /><br/>
<input type="submit" value="저장" />
</form>

</body>
</html>