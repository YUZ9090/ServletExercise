package org.comstudy21.myweb.service;

import static org.comstudy21.myweb.controller.MyController.saramDAO;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.model.SaramDTO;

public class MemberSearchService {
	
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		System.out.println("���� ����!!!");
		if("POST".equals(req.getMethod())) {
			int id =Integer.parseInt( req.getParameter("id"));
			
			SaramDTO one = saramDAO.findById(id);
			
			req.setAttribute("result", one);
			return "member/search";
		} else {
			//get
			return "member/search";
			
		}
		
		
	}

}
