<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%! //데클라레이션(선언부)
//class 의 멤버필드 및 메소드 선언(!)
//함수 밖이라고 생각하면된다%>
<% 
//스크립트 릿 (함수 실행부분)
//서비스함수(doget 등). 서비스 메소드 내부
//함수 내부라고 생각하면됨.
String title = "즐겁고 행복한 jsp";
String id ="hong";
String passwd="1234";

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title><%=title %></title>
</head>
<body>
   <h1><%=title%></h1>
<%
session.setAttribute("id", id);
session.setAttribute("name", "홍길동");

String userId = (String)session.getAttribute("id");
String userName = (String)session.getAttribute("name");

application.setAttribute("appId", id);
application.setAttribute("appName", "김길동");



response.sendRedirect("home.jsp");
%>



</body>
</html>