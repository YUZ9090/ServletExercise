<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%
request.setCharacterEncoding("UTF-8");
%>    
<jsp:useBean id="m" class="test.web.MemberBean" scope="application" />
<jsp:setProperty property="*" name="m"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join us process</title>
</head>
<body>

<table>
   <tr>
      <td><label for="">사용자이름</label></td>
      <td>${applicationScope.m.name }</td>
   </tr>
   <tr>
      <td><label for="">나이</label></td>
      <td>${applicationScope.m.age }</td>
   </tr>
   <tr>
      <td><label for="">몸무게</label></td>
      <td>${m.weight }</td>
   </tr>
   <tr>
      <td><label for="">키</label></td>
      <td>${m.height }</td>
   </tr>
   <tr>
      <td><label for="">성별</label></td>
      <td>${m.gender }</td>
   </tr>
   <tr>
      <td><label for="">&npsp;</label></td>
      <td><input type="submit" value="확인" /></td>
   </tr>
</table>

</body>
</html>