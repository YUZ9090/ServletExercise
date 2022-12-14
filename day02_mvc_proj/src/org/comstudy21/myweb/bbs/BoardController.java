package org.comstudy21.myweb.bbs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.bbs.service.BoardDeleteService;
import org.comstudy21.myweb.bbs.service.BoardListService;
import org.comstudy21.myweb.bbs.service.BoardReadService;
import org.comstudy21.myweb.bbs.service.BoardUpdateService;
import org.comstudy21.myweb.bbs.service.BoardWriteService;
import org.comstudy21.myweb.controller.MyController;

public class BoardController implements MyController {

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(">>>Board controller...");
		
		
		//서비스 호출할 filename 받음
		String fileName = (String)req.getAttribute("fileName");
		String viewName = "bbs/list";	// bbs/list로 초기화
		
		System.out.println("fileName => " + fileName);
		
		
		//기능별로 서비스호출
		if("/list".equals(fileName)) {
			//게시글보기
			viewName = new BoardListService().service(req, resp);
		}else if("/write".equals(fileName)) {
			//게시글쓰기
			viewName = new BoardWriteService().service(req,resp);
		}else if("/read".equals(fileName)) {
			//게시글보기
			viewName = new BoardReadService().service(req,resp);
		}else if("/delete".equals(fileName)) {
			//게시글삭제
			viewName = new BoardDeleteService().service(req,resp);
		}else if("/update".equals(fileName)) {
			//게시글 수정
			viewName = new BoardUpdateService().service(req,resp);
		}
		
		
		
		return viewName;
	}

}
