<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1> 식당 예약 프로그램 </h1>
<hr />
<%
Map items = (Map)request.getAttribute("items");
Set keys = items.keySet();
Iterator iterator = keys.iterator();
while(iterator.hasNext()) {
	String key = (String)iterator.next();
%>
<!-- HTML 코드 -->
<li><a href="<%=items.get(key) %>"><%=key %></a></li>
<%
}
%>

</body>
</html>