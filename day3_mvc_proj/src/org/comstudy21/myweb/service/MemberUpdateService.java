package org.comstudy21.myweb.service;

import static org.comstudy21.myweb.controller.MyController.saramDAO;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.model.SaramDTO;

public class MemberUpdateService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		//수정할 id
		int id =Integer.parseInt( req.getParameter("id"));
		//req.setAttribute("name", name);
		//req.setAttribute("phone", phone);
		//req.setAttribute("email", email);
		
		if("POST".equals(req.getMethod())) {
			//내용 저장 후 새로고침
			String name= req.getParameter("name");
			String phone = req.getParameter("phone");
			String email = req.getParameter("email");
			SaramDTO dto = new SaramDTO(id,name,phone, email);
			saramDAO.update(dto);
			return "redirect:list.do";
		} else {
			//get
			return "member/update";
			
		}
	}
}
