<%@page import="org.comstudy21.myweb.model.OptionDTO"%> 
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원 목록</title>
</head>
<body>
<h1>예약 상품 조회</h1>
<hr />
<table>
	<tr>
		<th>번호</th>
		<th>예약상품</th>
		<th>가격</th>
		<th>삭제</th>
	</tr>
<%
List<OptionDTO> opList = (List<OptionDTO>)request.getAttribute("opList");
for(OptionDTO option : opList) {
%>
	<tr>
		<th><%=option.getRno() %></th>
		<th><%=option.getRtitle() %></th>
		<th><%=option.getRprice() %></th>
		<th><a href="delete.do?id=<%=option.getRno() %>">삭제  </a> </th>
<%
}
%>
	</tr>
<tr>
	<th colspan="2"><a href="regist.do">상품 등록</a> | <a href="../home.do">home</a></th>
</tr>
</table>


</body>
</html>