<%@page import="myshop.ProductDAO"%>
<%@page import="myshop.ProductDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<%
ProductDAO dao = new ProductDAO();
List<ProductDTO> list =dao.selectAll();
request.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>�߰��� �Ź� ����</h1>
<table border="1" width="100%">
<tr>
   <th>����</th>
   <th>����</th>
   <th>������</th>
   <th>����</th>
   <th>����</th>
   <th>��ٱ���</th>
</tr>
<c:forEach var="p" items="${list }">
<!-- <p><c:out value="${p.pno}"> </c:out></p> ���� c:out�ϴ°Կ�Ģ�������׳ɲ����ᵵ�� -->
   <tr align="center">
      <td>${p.pno }</td><td>${p.pname }</td><td>${p.company }</td>
      <td>${p.price }</td>
      <td>
         <select name="ea">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
         </select>
      </td>
      <td><a href="#" onclick="addCart(this, ${p.pno })">��ٱ��� ���</a></td>
   </tr>
</c:forEach>

<script>
// �ٴҶ� ��ũ��Ʈ (�ٴҶ� ���̽�ũ��)
function addCart(row, pno) {
   var trEl = row.parentElement.parentElement;
   var ea = trEl.querySelector("select[name=ea]").value;
   var addCartUrl = "cart_process.jsp?cmd=add&pno="+pno+"&ea="+ea;
   location.assign(addCartUrl);
}
</script>
</table>
</body>
</html>