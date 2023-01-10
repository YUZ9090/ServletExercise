package org.comstudy21.myapp.bbs;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.ModelAndView;

public class BoardListCommand {
	
	
	public ModelAndView action(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("ListCommand»£√‚");
		
		ModelAndView mav = new ModelAndView(req, resp);
		mav.setViewName("bbs/list");
		BoadDAO dao = new BoadDAO();
		List<BoardDTO> list = dao.selectAll();
		//mav.addObject("list", list);
		mav.addObject("msg","Hello World");
		
		return mav;
	}
}
