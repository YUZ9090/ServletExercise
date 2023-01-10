package org.comstudy21.myapp.bbs;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.Command;
import org.comstudy21.myapp.Controller;
import org.comstudy21.myapp.ModelAndView;

public class BoardController implements Controller {
	BoardListCommand listCommand = new BoardListCommand();
	Command writeCommand = new BoardWriteCommand();
	Command updateCommand = new BoardUpdateCommand();
	Command deleteCommand = new BoardDeleteCommand();
	Command detailCommand = new BoardDetailCommand();
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ModelAndView mav = new ModelAndView(req, resp);
		
		String filePath = (String)req.getAttribute("filePath");
		System.out.println("filePath => " + filePath);
		if("/list.do".equals(filePath)) {
			mav = listCommand.action(req, resp);
		} else if("/write.do".equals(filePath)) {
			mav = writeCommand.action(req, resp);
		}else if("/update.do".equals(filePath)) {
			mav = updateCommand.action(req, resp);
		}else if("/delete.do".equals(filePath)) {
			mav = deleteCommand.action(req, resp);
		}else if("/detail.do".equals(filePath)) {
			mav = detailCommand.action(req, resp);
		}
		return mav;
		
	}
}
