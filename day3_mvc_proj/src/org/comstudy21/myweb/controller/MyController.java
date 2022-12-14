package org.comstudy21.myweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.model.BoardDAO;
import org.comstudy21.myweb.model.SaramDAO;
import org.comstudy21.myweb.model.ShopDAO;

public interface MyController {
	//컨트롤러 모아둘것
	SaramDAO saramDAO = new SaramDAO();
	BoardDAO boardDAO = new BoardDAO();
	ShopDAO shopDAO = new ShopDAO();
	
	
	
	String handleRequest(HttpServletRequest req, HttpServletResponse resp);

}