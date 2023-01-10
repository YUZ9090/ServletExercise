package org.comstudy21.myapp.bbs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.Command;
import org.comstudy21.myapp.ModelAndView;

public class BoardUpdateCommand implements Command{
	
	@Override
	public ModelAndView action(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView(req, resp);
		if("GET".equals(req.getMethod())) {

			mav.setViewName("bbs/update");
			BoardDAO dao = new BoardDAO();

			String num = req.getParameter("num");
			BoardDTO dto=dao.detail(num);
			mav.addObject("board", dto);
			
			return mav;
		} else if("POST".equals(req.getMethod())) {
			// 데이터 입력 처리 후 리다이렉트 하도록 설정.
			BoardDAO dao = new BoardDAO();
			mav = new ModelAndView(req, resp);
			
			String num = req.getParameter("num");
			String author = req.getParameter("author");
			String email = req.getParameter("email");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			String passwd = req.getParameter("passwd");
			
			//String author, String email, String title, String content, String passwd
			dao.update(num,author,email,title,content,passwd);
			
			mav.setViewName("redirect:list.do");
		}
		return mav;
	}
}
