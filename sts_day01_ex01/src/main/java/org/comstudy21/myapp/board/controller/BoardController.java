package org.comstudy21.myapp.board.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.comstudy21.myapp.board.model.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
   @Autowired
   private SqlSessionTemplate mybatis;
   
   private static List<BoardDTO> list_ex = new ArrayList<BoardDTO>();
   static {
      //seq, title, writer, Content, regDate, cnt
      list_ex.add(new BoardDTO(1, "�۾��� ����", "ȫ�浿", "�Խ��� �۾��� �����Դϴ�.", "2022-09-29", 0));
      list_ex.add(new BoardDTO(2, "�۾��� ����2", "ȫ���", "�Խ��� �۾��� ����2�Դϴ�.", "2022-09-29", 0));
      list_ex.add(new BoardDTO(3, "�۾��� ����3", "ȫ����", "�Խ��� �۾��� ����3�Դϴ�.", "2022-09-29", 0));
      list_ex.add(new BoardDTO(4, "�۾��� ����4", "�����", "�Խ��� �۾��� ����4�Դϴ�.", "2022-09-29", 0));
   }
   
   @RequestMapping(value="/board/list.do")
   public ModelAndView boardList() {
      ModelAndView mav = new ModelAndView();
      
      List<BoardDTO> boardList = mybatis.selectList("BaordMapper.selectAll");
      
      mav.addObject("boardList", boardList);
      mav.setViewName("board/list");
      
      return mav;
   }
   
   public ModelAndView boardList_ex() {
      ModelAndView mav = new ModelAndView();
      
      mav.addObject("boardList", list_ex);
      mav.setViewName("board/list");
      
      return mav;
   }
   
   @RequestMapping(value="/board/detail.do")
   public ModelAndView boardDetail(@RequestParam("seq") int seq) {
      System.out.println("seq => " + seq);
      
      BoardDTO board = mybatis.selectOne("BaordMapper.selectBoard", seq);
      System.out.println(board);
      
      ModelAndView mav = new ModelAndView();
      mav.addObject("board", board);
      
      return mav;
   }
   
   
   public ModelAndView boardDetail_ex(HttpServletRequest req) {
      int seq = Integer.parseInt( req.getParameter("seq") );
      System.out.println("seq => " + seq);
      
      ModelAndView mav = new ModelAndView();
      
      int index = findIndex(list_ex, seq);
      if(index != -1) {
         mav.addObject("board", list_ex.get(index));
      }
      mav.setViewName("board/detail");
      
      return mav;
   }

   private int findIndex(List<BoardDTO> boardList, int seq) {
      int index = -1;
      for(int i=0; i<boardList.size(); i++) {
         if(boardList.get(i).getSeq() == seq) {
            index = i;
            break;
         }
      }
      return index;
   }
}