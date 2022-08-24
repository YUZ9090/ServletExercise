<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="myshop.ProductDAO"%>
<%@page import="myshop.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//장바구니 컨트롤 기능
//서블릿의 할일을 대신해줄 jsp임
int pno = Integer.parseInt( request.getParameter("pno") );
String cmd = request.getParameter("cmd");
int ea = Integer.parseInt( request.getParameter("ea") );

ProductDAO dao = new ProductDAO();
ProductDTO product = dao.selectOne(new ProductDTO(pno,"","",0,0));
product.setEa(ea);
//session에 cartList가 만들어져야함
if(session.getAttribute("cartList") == null) {
    //카트리스트가 세션에 없으면 카트리스트 새로생성
	session.setAttribute("cartList", new ArrayList<ProductDTO>());
}
//존재하면 그냥 카트리스트부름
List<ProductDTO> cartList = (List<ProductDTO>)session.getAttribute("cartList");
cartList.add(product);

response.sendRedirect("cart_list.jsp");
%>