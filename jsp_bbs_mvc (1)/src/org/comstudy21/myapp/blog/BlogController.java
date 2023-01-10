package org.comstudy21.myapp.blog;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.Command;
import org.comstudy21.myapp.Controller;
import org.comstudy21.myapp.ModelAndView;

public class BlogController implements Controller {
	BlogListCommand listCommand = new BlogListCommand();
	Command writeCommand = new BlogWriteCommand();
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ModelAndView mav = null;
		String filePath = (String)req.getAttribute("filePath");
		System.out.println("filePath => " + filePath);
		if("/list.do".equals(filePath)) {
			mav = listCommand.action(req, resp);
		} else if("/write.do".equals(filePath)) {
			mav = writeCommand.action(req, resp);
		}
		
		return mav;
	}

}
