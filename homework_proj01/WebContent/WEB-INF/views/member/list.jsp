<%@page import="org.comstudy21.myweb.model.SaramDTO"%> 
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
<h1>ȸ�����</h1>
<hr />
<%
List<SaramDTO> memList = (List<SaramDTO>)request.getAttribute("memList");
for(SaramDTO member : memList) {
%>
<li><%=member.getId() %> | <%=member.getName() %> | <%=member.getPhone() %> | <%=member.getEmail() %>| <a href="update.do?id=<%=member.getId()%>"> ȸ�� ����</a> | <a href="delete.do?id=<%=member.getId() %>">ȸ�� ����  </a> </li>
<%
}
%>
</ul>
<a href="join.do">ȸ�� ���</a>


<form action="search.do" method="POST">
	<label for="">���̵�� �˻��ϱ� : </label>
	<input type="text" name="id" value=""/>
	<input type="submit" value ="�˻�"/>
</form>


<form action="searchName.do" method="POST">
	<label for="">�̸����� �˻��ϱ� : </label>
	<input type="text" name="name" value=""/>
	<input type="submit" value ="�˻�"/>
</form>

</body>
</html>