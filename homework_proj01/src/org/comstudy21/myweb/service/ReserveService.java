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
	
	
	//����Ʈ����
	public String viewList(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		List<ReserveDTO> resList = reserveDAO.selectAll();
		List<OptionDTO> opList = optionDAO.selectAll();

		req.setAttribute("resList", resList);
		req.setAttribute("opList", opList);
		return "reservation/list";
	}
	
	//������
	public String regist(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		List<OptionDTO> opList = optionDAO.selectAll();
		req.setAttribute("opList", opList);
		if("POST".equals(req.getMethod())) {
			//���� ���� �� ���ΰ�ħ
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
	
	//�������
	public String delete(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		
		//Ư���� id �޾ƿ�
		int id =Integer.parseInt( req.getParameter("id"));
	
		reserveDAO.delete(id);
		return "redirect:list.do";
	}
	
}
