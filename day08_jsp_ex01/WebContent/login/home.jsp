<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
//세션은 주소가바뀌더라도 부라우저가 같으면살아잇다

String userId = (String)session.getAttribute("id");
String userName = (String)session.getAttribute("name");

String userId_app = (String)application.getAttribute("appId");
String userName_app = (String)application.getAttribute("appName");

%>

User ID: <%=userId %><br />
User Name : <%=userName %><<br />
<hr />
User ID(application) : <%=userId_app %><br />
User Name(application) : <%=userName_app %><<br />
<!-- 세션에넣은건 다른브라우저에서 보이지않지만 어플리케이션에넣으면 다른브라우저여도 살아있따 -->
<!-- 어플리케이션은 서버의 톰캣 컨테이너의 글로벌 변수에 저장되는것임 
	세션의경우 세션아이디가 같을때에만 저장할수있도록.
	브라우저마다 세션아이디가 마드러진다.
	세션은 개인 사물함, 어플리케이션은 공용 카운터 같은 느낌.
	어플레ㅣ케이션은 공용이라는느낌. 전역변수. 어플리케이션은 세션의 카운트를 넣을수있겠다
-->
<a href="logout.jsp">LogOut</a>
<a href="login.html">Login</a>
</body>
</html>