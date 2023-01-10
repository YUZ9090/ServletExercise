package org.comstudy21.myapp.board.controller;

import org.comstudy21.myapp.board.BoardService;
import org.comstudy21.myapp.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class DeleteBoardController {
	@Autowired
	BoardService boardService;
	
	@Autowired
	GetBoardModel resolver;
	
	@RequestMapping("/delete")
	public ModelAndView delete(BoardVO vo, ModelAndView mav) {
		return resolver.getBoardModel("board/delete", vo, mav);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView deleteProcess(BoardVO vo, ModelAndView mav) {
		boardService.deleteBoard(vo);
		mav.setViewName("redirect:list");
		return mav;
	}
}
