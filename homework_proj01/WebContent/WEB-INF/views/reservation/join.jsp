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
<form action="join.do" method="POST">
	<table>
		<tr>
			<th>성명</th>
			<th><input type="text" name="name" value="TEST"/></th>
		</tr>
		<tr>
			<th>예약상품</th>
			<th>
			<select name="rno" id="rno">
				<%
				List<OptionDTO> opList = (List<OptionDTO>)request.getAttribute("opList");
				for(OptionDTO option : opList) {
				%>
				<option value="<%= option.getRno()%>">
					<%= option.getRno() + option.getRtitle() +option.getRprice()+"원" %>
				</option>
				<%} %>
			</select>
			</th>
		</tr>
		<tr>
			<th>전화번호</th>
			<th><input type="text" name = "phone" value="010-1212-1212"/></th>
		</tr>
		<tr>
			<th>결제상태</th>
			<th>
			<input type="radio" id="html" name="rpay" value="F"><label for="F">미납</label>
			<input type="radio" id="css" name="rpay" value="T"><label for="T">완납</label>
			</th>
		</tr>
		<tr>
			<th colspan="2"><input type="submit" value ="등록"/></th>
		</tr>
	</table>
	
</form>

</body>
</html>