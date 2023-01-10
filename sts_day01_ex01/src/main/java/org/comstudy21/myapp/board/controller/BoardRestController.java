package org.comstudy21.myapp.board.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardRestController {
	@RequestMapping(value="/rest/board/list.do")
	public String boardList() {
		
		
		return "hello";
	}
}
