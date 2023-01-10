package org.comstudy21.myapp.bbs;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.Command;
import org.comstudy21.myapp.ModelAndView;

public class BoardListCommand implements Command{

	public ModelAndView action(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("ListCommand»£√‚");
		
		ModelAndView mav = new ModelAndView(req, resp);
		mav.setViewName("bbs/list");
		BoardDAO dao = new BoardDAO();
		
		List<BoardDTO> boardlist = dao.selectAll();
		mav.addObject("boardlist", boardlist);
		mav.addObject("msg","Hello World");
		
		return mav;
	}
	
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		BoardDAO dao = new BoardDAO();
		ArrayList list = (ArrayList) dao.selectAll();
		System.out.println("list.size"+list.size());
		req.setAttribute("lists",list);
	}
	
}
