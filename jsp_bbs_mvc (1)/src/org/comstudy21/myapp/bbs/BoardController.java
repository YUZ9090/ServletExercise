package org.comstudy21.myapp.bbs;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.Controller;
import org.comstudy21.myapp.ModelAndView;

public class BoardController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ModelAndView mav = new ModelAndView(req, resp);
		String filePath = (String)req.getAttribute("filePath");
		System.out.println("filePath => " + filePath);
		if("/list.do".equals(filePath)) {
			mav = BoardListCommand.action(req, resp);
		} else if("/write.do".equals(filePath)) {
			mav = writeCommand.action(req, resp);
		}
		
		mav.setViewName("bbs/list");
		return mav;
	}
}
