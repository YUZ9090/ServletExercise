<%@page import="org.comstudy21.myweb.model.SaramDTO"%> 
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
<h1>회원목록</h1>
<hr />
<%
List<SaramDTO> memList = (List<SaramDTO>)request.getAttribute("memList");
for(SaramDTO member : memList) {
%>
<li><%=member.getId() %> | <%=member.getName() %> | <%=member.getPhone() %> | <%=member.getEmail() %>| <a href="update.do?id=<%=member.getId()%>"> 회원 수정</a> | <a href="delete.do?id=<%=member.getId() %>">회원 삭제  </a> </li>
<%
}
%>
</ul>
<a href="join.do">회원 등록</a>


<form action="search.do" method="POST">
	<label for="">아이디로 검색하기 : </label>
	<input type="text" name="id" value=""/>
	<input type="submit" value ="검색"/>
</form>


<form action="searchName.do" method="POST">
	<label for="">이름으로 검색하기 : </label>
	<input type="text" name="name" value=""/>
	<input type="submit" value ="검색"/>
</form>

</body>
</html>