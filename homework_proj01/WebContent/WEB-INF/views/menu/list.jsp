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
<h1>���� ��ǰ ��ȸ</h1>
<hr />
<table>
	<tr>
		<th>��ȣ</th>
		<th>�����ǰ</th>
		<th>����</th>
		<th>����</th>
	</tr>
<%
List<OptionDTO> opList = (List<OptionDTO>)request.getAttribute("opList");
for(OptionDTO option : opList) {
%>
	<tr>
		<th><%=option.getRno() %></th>
		<th><%=option.getRtitle() %></th>
		<th><%=option.getRprice() %></th>
		<th><a href="delete.do?id=<%=option.getRno() %>">����  </a> </th>
<%
}
%>
	</tr>
<tr>
	<th colspan="2"><a href="regist.do">��ǰ ���</a> | <a href="../home.do">home</a></th>
</tr>
</table>


</body>
</html>