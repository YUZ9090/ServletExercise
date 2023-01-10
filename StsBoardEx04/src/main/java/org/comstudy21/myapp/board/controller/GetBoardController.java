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
public class GetBoardController {
	private static final Logger logger = LoggerFactory.getLogger(GetBoardController.class);
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	GetBoardModel resolver;
	
	@RequestMapping("/detail")
	public ModelAndView detail(BoardVO vo, ModelAndView mav) {
		return resolver.getBoardModel("board/detail", vo, mav);
	}
}
