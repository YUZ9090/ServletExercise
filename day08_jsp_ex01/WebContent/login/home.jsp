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
//������ �ּҰ��ٲ���� �ζ������ ���������մ�

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
<!-- ���ǿ������� �ٸ����������� ������������ ���ø����̼ǿ������� �ٸ����������� ����ֵ� -->
<!-- ���ø����̼��� ������ ��Ĺ �����̳��� �۷ι� ������ ����Ǵ°��� 
	�����ǰ�� ���Ǿ��̵� ���������� �����Ҽ��ֵ���.
	���������� ���Ǿ��̵� ���巯����.
	������ ���� �繰��, ���ø����̼��� ���� ī���� ���� ����.
	���÷������̼��� �����̶�´���. ��������. ���ø����̼��� ������ ī��Ʈ�� �������ְڴ�
-->
<a href="logout.jsp">LogOut</a>
<a href="login.html">Login</a>
</body>
</html>