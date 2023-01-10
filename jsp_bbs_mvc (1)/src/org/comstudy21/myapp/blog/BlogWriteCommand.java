package org.comstudy21.myapp.blog;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.Command;
import org.comstudy21.myapp.ModelAndView;

public class BlogWriteCommand implements Command {

	@Override
	public ModelAndView action(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView(req, resp);
		if("GET".equals(req.getMethod())) {
			// 입력페이지를 forward한다.
			mav = new ModelAndView(req, resp);
			mav.setViewName("blog/write");
		} else if("POST".equals(req.getMethod())) {
			// 데이터 입력 처리 후 리다이렉트 하도록 설정.
			mav = new ModelAndView(req, resp);
			mav.setViewName("redirect:list.do");
		}
		return mav;
	}

}
