package org.comstudy21.myapp.board.controller;

import org.comstudy21.myapp.board.BoardService;
import org.comstudy21.myapp.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
public class GetBoardModel {
	@Autowired
	BoardService boardService;
	
	public ModelAndView getBoardModel(String viewName, BoardVO vo, ModelAndView mav) {
		BoardVO board = boardService.getBoard(vo);
		mav.addObject("board", board);
		mav.setViewName(viewName);
		
		return mav;
	}
}
