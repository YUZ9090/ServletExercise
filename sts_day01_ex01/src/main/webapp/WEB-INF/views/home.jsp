<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	comstudy it academy
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p>userName : ${userName }</p>
<ul>


<c:forEach var = "menu" items="${menuItemList}">
   <p><a href="${menu.url }">${menu.title }</a></p>
</c:forEach>

</ul>
</body>
</html>
