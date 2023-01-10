package org.comstudy21.myapp.blog;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.Command;
import org.comstudy21.myapp.ModelAndView;

public class BlogListCommand implements Command {

	public ModelAndView action(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView(req, resp);
		mav.setViewName("blog/list");
		List<BlogDTO> list = null;
		mav.addObject("list", list);
		mav.addObject("msg","Hello World");
		return mav;
	}

}
