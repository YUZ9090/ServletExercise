<%@page import="org.comstudy21.myweb.model.ReserveDTO"%> 
<%@page import="org.comstudy21.myweb.model.OptionDTO"%> 
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ�� ���</title>
</head>
<body>
<h1>���� ���� ��ȸ</h1>
<hr />
<table>
	<tr>
		<th>��ȣ</th>
		<th>�̸�</th>
		<th>��ȭ</th>
		<th>�ϳ�</th>
		<th>�����ǰ</th>
		<th>����</th>
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
		rpay = "�ϳ�";
	}else if(member.getRpay() == "F"){
		rpay= "�̳�";
	}else
		rpay =member.getRpay();
%>


	<tr>
		<th><%=member.getId() %></th>
		<th><%=member.getName() %></th>
		<th><%=member.getPhone() %></th>
		<th><%=rpay %></th>
		<th><%=member.getRno()+" - "+ title+" - "+price %> </th>
		<th><a href="delete.do?id=<%=member.getId() %>">����  </a> </th>
		
	<%
	}
	%>
	</tr>
<tr>
	<th colspan="2"><a href="join.do">���� ���</a> | <a href="../home.do">home</a></th>
</tr>
</table>


</body>
</html>