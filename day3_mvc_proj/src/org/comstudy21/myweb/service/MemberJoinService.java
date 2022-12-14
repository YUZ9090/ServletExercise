package org.comstudy21.myweb.service;

import static org.comstudy21.myweb.controller.MyController.saramDAO;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.model.SaramDTO;


public class MemberJoinService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		if("POST".equals(req.getMethod())) {
			//내용 저장 후 새로고침
			String name= req.getParameter("name");
			String phone = req.getParameter("phone");
			String email = req.getParameter("email");
			SaramDTO dto = new SaramDTO(0,name,phone, email);
			saramDAO.insert(dto);
			return "redirect:list.do";
		} else {
			//get
			return "member/join";
			
		}
		
		
	}
}
