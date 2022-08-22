package org.comstudy21.myweb.service;
import static org.comstudy21.myweb.controller.MyController.reserveDAO;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.model.OptionDTO;
import org.comstudy21.myweb.model.ReserveDTO;

import static org.comstudy21.myweb.controller.MyController.optionDAO;


public class MenuService {
	
	
	//리스트보기
	public String viewList(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

		List<OptionDTO> opList = optionDAO.selectAll();

		req.setAttribute("opList", opList);
		return "menu/list";
	}
	
	//상품등록
	public String regist(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		if("POST".equals(req.getMethod())) {
			//내용 저장 후 새로고침
			String rtitle= req.getParameter("rtitle");
			int rprice = Integer.parseInt(req.getParameter("rprice")) ;
			OptionDTO dto = new OptionDTO(0, rtitle, rprice);
			optionDAO.insert(dto);
			
			System.out.println(rtitle+","+rprice);
			return "redirect:list.do";
		} else {
			//get
			return "menu/regist";
		}
	}
	
	//예약삭제
	public String delete(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		
		//특정값 id 받아옴
		int id =Integer.parseInt( req.getParameter("id"));
	
		optionDAO.delete(id);
		return "redirect:list.do";
	}
	
	
}
