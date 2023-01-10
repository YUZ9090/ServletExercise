package org.comstudy21.myapp.board.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myapp.board.BoardVO;
import org.comstudy21.myapp.common.JDBCUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("boardDAO")
public class BoardDAOSpring {
   @Autowired
   private JdbcTemplate jdbcTemplate;
   
   private final String BOARD_INSERT = "INSERT INTO BOARD(SEQ, TITLE, WRITER, CONTENT) VALUES ((select nvl(max(seq),0)+1 from board), ?,?,?)";
   private final String BOARD_UPDATE = "UPDATE BOARD SET TITLE=?, WRITER=?, CONTENT=? WHERE SEQ=?";
   private final String BOARD_DELETE = "DELETE FROM board WHERE SEQ=?";
   private final String BOARD_GET = "SELECT * FROM BOARD WHERE SEQ=?";
   private final String BOARD_LIST = "SELECT * FROM BOARD ORDER BY SEQ DESC";

   public void insertBoard(BoardVO vo) {
      System.out.println("===> JDBC로 insertBoard() 기능 처리");
      jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
   }

   public void updateBoard(BoardVO vo) {
      System.out.println("===> JDBC로 updateBoard() 기능 처리");
      jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
   }

   public void deleteBoard(BoardVO vo) {
      System.out.println("===> JDBC로 deleteBoard() 기능 처리");
      jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
   }
   
   class BoardMapper implements RowMapper<BoardVO> {
      @Override
      public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
         int seq = rs.getInt("seq");
         String title = rs.getString("title");
         String writer = rs.getString("writer");
         String content = rs.getString("content");
         Date regdate = rs.getDate("regdate");
         int cnt = rs.getInt("cnt");
         return new BoardVO(seq, title, writer, content, regdate, cnt);
      }
   }
   
   public BoardVO getBoard(BoardVO vo) {
      System.out.println("===> JDBC로 getBoard() 기능 처리");
      Object[] args = {vo.getSeq()};
      return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardMapper());
   }
   
   public List<BoardVO> getBoardList(BoardVO vo) {
      System.out.println("===> JDBC로 getBoardList() 기능 처리");
      return jdbcTemplate.query(BOARD_LIST, new BoardMapper());
   }
}