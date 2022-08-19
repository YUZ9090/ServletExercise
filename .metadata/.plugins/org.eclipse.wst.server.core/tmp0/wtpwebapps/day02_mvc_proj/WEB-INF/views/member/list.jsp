<%@page import="org.comstudy21.myweb.member.MemberDTO"%>
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
<h1>회원 목록</h1>
<hr />
<ul>
<%
List<MemberDTO> memList = (List<MemberDTO>)request.getAttribute("memList");
for(MemberDTO member : memList) {
%>
<li><%=member.getNo() %> | <%=member.getName() %> | <%=member.getPhone() %> </li>
<%
}
%>
</ul>
<a href="join.do">회원 등록</a>
</ul>
</body>
</html>