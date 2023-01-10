package org.comstudy21.myapp.bbs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.Command;
import org.comstudy21.myapp.ModelAndView;

public class BoardWriteCommand implements Command{
	
	@Override
	public ModelAndView action(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView(req, resp);
		if("GET".equals(req.getMethod())) {
			// �Է��������� forward�Ѵ�.
			mav = new ModelAndView(req, resp);
			mav.setViewName("bbs/write");
		} else if("POST".equals(req.getMethod())) {
			// ������ �Է� ó�� �� �����̷�Ʈ �ϵ��� ����.
			BoardDAO dao = new BoardDAO();
			mav = new ModelAndView(req, resp);
			
			String author = req.getParameter("author");
			String email = req.getParameter("email");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			String passwd = req.getParameter("passwd");
			
			//String author, String email, String title, String content, String passwd
			
			dao.write(author,email,title,content,passwd);
			
			mav.setViewName("redirect:list.do");
		}
		return mav;
	}
}
