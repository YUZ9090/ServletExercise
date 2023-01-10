package org.comstudy21.myapp.bbs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.Command;
import org.comstudy21.myapp.ModelAndView;

public class BoardDeleteCommand implements Command {

	@Override
	public ModelAndView action(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView(req, resp);
		mav = new ModelAndView(req, resp);
		BoardDAO dao = new BoardDAO();
		String num = req.getParameter("num");
		
		dao.delete(num);
		
		mav.setViewName("redirect:list.do");

		return mav;
	}
}
