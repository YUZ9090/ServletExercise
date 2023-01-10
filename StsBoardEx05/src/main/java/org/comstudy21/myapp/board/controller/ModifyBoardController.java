package org.comstudy21.myapp.board.controller;

import org.comstudy21.myapp.board.BoardService;
import org.comstudy21.myapp.board.BoardVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class ModifyBoardController {
	private static final Logger logger = LoggerFactory.getLogger(ModifyBoardController.class);
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	GetBoardModel resolver;
	
	@RequestMapping("/modify")
	public ModelAndView modify(BoardVO vo, ModelAndView mav) {
		return resolver.getBoardModel("board/modify", vo, mav);
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public ModelAndView modifyProcess(BoardVO vo, ModelAndView mav) {
		boardService.updateBoard(vo);
		mav.setViewName("redirect:list");
		return mav;
	}
}
