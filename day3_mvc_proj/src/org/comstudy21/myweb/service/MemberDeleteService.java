package org.comstudy21.myweb.service;

import static org.comstudy21.myweb.controller.MyController.saramDAO;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.model.SaramDTO;



public class MemberDeleteService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		
		//Ư���� id �޾ƿ�
		int id =Integer.parseInt( req.getParameter("id"));
	
		saramDAO.delete(id);
		return "redirect:list.do";
	}
	

}
