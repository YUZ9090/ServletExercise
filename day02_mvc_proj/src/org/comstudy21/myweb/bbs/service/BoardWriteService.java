package org.comstudy21.myweb.bbs.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.bbs.BoardDTO;
import static org.comstudy21.myweb.controller.MyController.boardDAO;

public class BoardWriteService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		
		
		if("POST".equals(req.getMethod())) {
			//포스트일경우
			String title = req.getParameter("title");
			String article = req.getParameter("article");
			BoardDTO dto = new BoardDTO(0,title,article);
			boardDAO.write(dto);
			return "redirect:list.do";
		}else {
			//get일 경우

			return "bbs/write";
		}
		
		
	}
}
