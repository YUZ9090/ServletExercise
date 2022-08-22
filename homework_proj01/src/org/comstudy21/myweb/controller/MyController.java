package org.comstudy21.myweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.model.OptionDAO;
import org.comstudy21.myweb.model.ReserveDAO;

public interface MyController {
	//컨트롤러 모아둘것
	//SaramDAO saramDAO = new SaramDAO();
	ReserveDAO reserveDAO = new ReserveDAO();
	OptionDAO optionDAO = new OptionDAO();
	
	
	
	String handleRequest(HttpServletRequest req, HttpServletResponse resp);

}