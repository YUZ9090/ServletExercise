<%@page import="org.comstudy21.myweb.model.OptionDTO"%> 
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>예약등록 페이지</h1>
<hr />
<form action="regist.do" method="POST">
	<table>
		<tr>
			<th>상품명</th>
			<th><input type="text" name="rtitle" value="일일무제한"/></th>
		</tr>
		<tr>
			<th>상품 가격</th>
			<th>
			<input type="text" name="rprice" value="30000"/>원
			</th>
		</tr>

		<tr>
			<th colspan="2"><input type="submit" value ="등록"/></th>
		</tr>
	</table>
	
</form>

</body>
</html>