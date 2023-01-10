package org.comstudy21.myapp.board.controller;

import java.io.File;
import java.io.IOException;

import org.comstudy21.myapp.board.BoardService;
import org.comstudy21.myapp.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@SessionAttributes("board")
public class InsertBoardController {
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/board/insert")
	public ModelAndView insert() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/insert");
		return mav;
	}
	
	@RequestMapping(value = "/board/insert", method = RequestMethod.POST)
	public ModelAndView insertProcess(BoardVO vo) throws IllegalStateException, IOException {
		// 파일 저장 경로 및 업로드 처리
		MultipartFile uploadFile = vo.getUploadFile();
		String  uploadLocation = "E:/source/project/java_workspace/StsBoardEx04/src/main/webapp/resources/upload/";
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File(uploadLocation + fileName));
			vo.setFileName(fileName);
			vo.setUploadLocation(uploadLocation);
		}
		
		ModelAndView mav = new ModelAndView();
		boardService.insertBoard(vo);
		mav.setViewName("redirect:list");
		return mav;
	}
}