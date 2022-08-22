package org.comstudy21.myweb.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myweb.util.JdbcUtil;

public class ReserveDAO {
	public static final String SELECT = "select * from people";
	public static final String INSERT = "INSERT INTO people(pno,NAME,PHONE,RPAY,RNO) VALUES(NEXTVAL('seq_people'),?,?,?,?)";
	public static final String DELETE = "DELETE FROM people WHERE pno=?";

	private Connection conn ;
	   private Statement stmt ; //statement를 만들필욘없지만만들어본다
	   private PreparedStatement pstmt;
	   private ResultSet rs;
	
	//전체리스트
   public List<ReserveDTO> selectAll() {
	      conn = JdbcUtil.getConnection();
	      List<ReserveDTO> list = null;
	      try {
	         pstmt = conn.prepareStatement(SELECT);
	         rs = pstmt.executeQuery();
	         while(rs.next()) {
	            if(list == null) {
	               list = new ArrayList();
	            }
	            int id = rs.getInt(1);
	            String name = rs.getString(2);
	            String phone = rs.getString(3);
	            String rpay = rs.getString(4);
	            int rno = rs.getInt(5);
	            list.add(new ReserveDTO(id, name, phone, rpay ,rno) );
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         JdbcUtil.close(conn, pstmt, rs);
	      }
	      return list;
	   }
   
   //삭제
   public void delete(int no) throws SQLException {
	   conn = JdbcUtil.getConnection();
	   PreparedStatement pstmt = conn.prepareStatement(DELETE);
	   pstmt.setInt(1, no);
	   
	   pstmt.executeUpdate();
	   
	   JdbcUtil.close(conn,pstmt,null);
	   
   }
   
   //등록하기
   public void insert(ReserveDTO dto) throws SQLException {
	   
	   conn = JdbcUtil.getConnection();
	   PreparedStatement pstmt = conn.prepareStatement(INSERT);
	   pstmt.setString(1,dto.getName());
	   pstmt.setString(2,dto.getPhone());
	   pstmt.setString(3,dto.getRpay());
	   pstmt.setInt(4,dto.getRno());
	   
	   //업데이트를해줘야 실행된다.
	   pstmt.executeUpdate();
	   
	   JdbcUtil.close(conn, pstmt, null);
      
   }
}
