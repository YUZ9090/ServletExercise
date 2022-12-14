package org.comstudy21.myweb.service;


import static org.comstudy21.myweb.controller.MyController.saramDAO;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.model.SaramDTO;



public class MemberListService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		List<SaramDTO> memList = saramDAO.selectAll();
		
		req.setAttribute("memList", memList);
		return "member/list";
	}
}
