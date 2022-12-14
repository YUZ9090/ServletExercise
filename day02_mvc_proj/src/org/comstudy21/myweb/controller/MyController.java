package org.comstudy21.myweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.bbs.BoardDAO;
import org.comstudy21.myweb.member.MemberDAO;
import org.comstudy21.myweb.shop.ShopDAO;

public interface MyController {
	MemberDAO memberDAO = new MemberDAO();
	BoardDAO boardDAO = new BoardDAO();
	ShopDAO shopDAO = new ShopDAO();
	
	//이렇게 한곳에 모아놓으면 관리하기쉽다
	

	String handleRequest(HttpServletRequest req, HttpServletResponse resp);

}