<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
request.setAttribute("message", "Hello world");
List list = new ArrayList();
list.add("hello");
list.add("world");
request.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="홍길동"></c:out><br/>
<c:out value="${message }"></c:out>
<hr />
<c:forEach var="word" items="${list }">
   <c:out value="${word }"></c:out><br/>
</c:forEach>
</body>
</html>