package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.MemberDAO;
import myshop.ProductDAO;



public interface MyController {
	//컨트롤러 모아둘것
	//SaramDAO saramDAO = new SaramDAO();
	MemberDAO memberDAO = new MemberDAO();
	ProductDAO productDAO = new ProductDAO();
	
	
	
	String handleRequest(HttpServletRequest req, HttpServletResponse resp);

}