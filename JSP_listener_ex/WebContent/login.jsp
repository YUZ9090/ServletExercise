<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.lang.String" %>
<%!
//필드나 메소드 선언부
private String name = "title";
public void test(){
	
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Login Form</h2>
<form action="webapp/login" method="POST" >
   <table>
      <tr>
         <th>사용자 아이디</th>
         <td>
            <input type="text" name="userid" value="hong" />
         </td>
      </tr>
      <tr>
         <th>비밀번호</th>
         <td>
         <input type="password" name="password" value="1234" />
         </td>
      </tr>
      <tr>
         <th></th>
         <td>
            <input type="submit" value="Login" />
         </td>
      </tr>
   </table>
</form>
</body>
</html>