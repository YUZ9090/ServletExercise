<%@page import="org.comstudy21.myweb.model.ReserveDTO"%> 
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
<h1>예약 내역 조회</h1>
<hr />
<table>
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>전화</th>
		<th>완납</th>
		<th>예약상품</th>
		<th>삭제</th>
	</tr>
<%
String rpay;
String title="";
int price=0;
List<OptionDTO> opList = (List<OptionDTO>)request.getAttribute("opList");
List<ReserveDTO> resList = (List<ReserveDTO>)request.getAttribute("resList");
for(ReserveDTO member : resList) {

	for(OptionDTO option : opList){
		if(option.getRno()==member.getRno()){
			title = option.getRtitle();
			price = option.getRprice();
		}
	}
	
	if(member.getRpay() == "T"){
		rpay = "완납";
	}else if(member.getRpay() == "F"){
		rpay= "미납";
	}else
		rpay =member.getRpay();
%>


	<tr>
		<th><%=member.getId() %></th>
		<th><%=member.getName() %></th>
		<th><%=member.getPhone() %></th>
		<th><%=rpay %></th>
		<th><%=member.getRno()+" - "+ title+" - "+price %> </th>
		<th><a href="delete.do?id=<%=member.getId() %>">삭제  </a> </th>
		
	<%
	}
	%>
	</tr>
<tr>
	<th colspan="2"><a href="join.do">예약 등록</a> | <a href="../home.do">home</a></th>
</tr>
</table>


</body>
</html>