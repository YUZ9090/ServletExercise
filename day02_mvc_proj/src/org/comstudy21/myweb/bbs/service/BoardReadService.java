package org.comstudy21.myweb.bbs.service;

import static org.comstudy21.myweb.controller.MyController.boardDAO;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.bbs.BoardDTO;

public class BoardReadService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		List<BoardDTO> bbsList = boardDAO.selectAll();
		//jsp에서 아이디값 받아옴
		req.setAttribute("bbsID", req.getParameter("artnum"));
		//int로 형변환
		int bbsID =Integer.parseInt( req.getParameter("artnum"));
		

		System.out.println(bbsID);
		
		//dto에서 게시글 번호에 해당하는 내용만 추출
		for(BoardDTO bbs : bbsList){
			if(bbs.getNo()==bbsID){
				req.setAttribute("no", bbs.getNo());
				req.setAttribute("title", bbs.getTitle());
				req.setAttribute("article", bbs.getArticle());
			}
		}
		
		
		return "bbs/read";
	}
	
}
