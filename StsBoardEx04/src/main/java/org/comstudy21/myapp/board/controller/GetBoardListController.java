package org.comstudy21.myapp.board.controller;

import java.util.List;

import org.comstudy21.myapp.board.BoardService;
import org.comstudy21.myapp.board.BoardVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GetBoardListController {
	private static final Logger logger = LoggerFactory.getLogger(GetBoardListController.class);
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/board/list")
	public ModelAndView list(BoardVO vo, ModelAndView mav) {
		System.out.println(vo);
		
		List<BoardVO> list = boardService.getBoardList(vo);
		mav.addObject("list", list);
		mav.setViewName("board/list");
		
		return mav;
	}
}
