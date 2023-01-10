package org.comstudy21.myapp.bbs;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.Command;
import org.comstudy21.myapp.ModelAndView;

public class BoardDetailCommand implements Command{

	public ModelAndView action(HttpServletRequest req, HttpServletResponse resp) {

		ModelAndView mav = new ModelAndView(req, resp);
		mav.setViewName("bbs/detail");
		BoardDAO dao = new BoardDAO();

		String num = req.getParameter("num");
		BoardDTO dto=dao.detail(num);
		mav.addObject("board", dto);
		
		return mav;
	}
	

	
}
