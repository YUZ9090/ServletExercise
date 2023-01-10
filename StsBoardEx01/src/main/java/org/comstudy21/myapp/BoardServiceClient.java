package org.comstudy21.myapp;

import java.util.List;

import org.comstudy21.myapp.board.BoardService;
import org.comstudy21.myapp.board.BoardVO;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class BoardServiceClient {

	public static void main(String[] args) {
		//1 구동
		String resourceLocations = "classpath:applicationContext.xml";
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext(resourceLocations);
		
		//2 lookup
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		//3 글등록
		String title = "test";
		String writer = "tester";
		String content = "test content";
		BoardVO vo = new BoardVO(title, writer, content);
		boardService.insertBoard(vo);

		
		//4 목록검색
		List<BoardVO> list = boardService.getBoardList(null);
		for(BoardVO board : list) {
			System.out.println(board);
		}
	}
	
	
}
