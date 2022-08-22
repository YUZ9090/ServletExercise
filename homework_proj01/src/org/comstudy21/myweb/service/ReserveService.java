package org.comstudy21.myweb.service;


import static org.comstudy21.myweb.controller.MyController.reserveDAO;
import static org.comstudy21.myweb.controller.MyController.optionDAO;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.model.OptionDTO;
import org.comstudy21.myweb.model.ReserveDTO;

public class ReserveService {
	
	
	//리스트보기
	public String viewList(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		List<ReserveDTO> resList = reserveDAO.selectAll();
		List<OptionDTO> opList = optionDAO.selectAll();

		req.setAttribute("resList", resList);
		req.setAttribute("opList", opList);
		return "reservation/list";
	}
	
	//예약등록
	public String regist(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		List<OptionDTO> opList = optionDAO.selectAll();
		req.setAttribute("opList", opList);
		if("POST".equals(req.getMethod())) {
			//내용 저장 후 새로고침
			String name= req.getParameter("name");
			String phone = req.getParameter("phone");
			String rpay = req.getParameter("rpay");
			int rno = Integer.parseInt( req.getParameter("rno"));
			ReserveDTO dto = new ReserveDTO(0,name,phone, rpay, rno);
			reserveDAO.insert(dto);
			return "redirect:list.do";
		} else {
			//get
			return "reservation/join";
		}
	}
	
	//예약삭제
	public String delete(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		
		//특정값 id 받아옴
		int id =Integer.parseInt( req.getParameter("id"));
	
		reserveDAO.delete(id);
		return "redirect:list.do";
	}
	
}
