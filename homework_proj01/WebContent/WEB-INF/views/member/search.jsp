<%@page import="org.comstudy21.myweb.model.SaramDTO"%> 
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>검색결과</h1>
<hr />
<%
SaramDTO member = (SaramDTO)request.getAttribute("result");
%>
<li> <%=member.getId() %> | <%=member.getName() %> | <%=member.getPhone() %> |  <%=member.getEmail() %>|  <a href="update.do?id=<%=member.getId()%>"> 회원 수정</a> | <a href="delete.do?id=<%=member.getId() %>">회원 삭제  </a> </li>

</ul>
<a href="list.do">리스트로</a>
</body>
</html>