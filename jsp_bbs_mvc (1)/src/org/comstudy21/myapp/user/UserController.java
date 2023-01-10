package org.comstudy21.myapp.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.Controller;
import org.comstudy21.myapp.ModelAndView;
import org.comstudy21.myapp.blog.BlogDTO;

public class UserController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ModelAndView mav = new ModelAndView(req, resp);
		mav.setViewName("user/list");
		return mav;
	}

}
