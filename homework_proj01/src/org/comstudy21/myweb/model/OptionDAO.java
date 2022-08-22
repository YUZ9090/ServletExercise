package org.comstudy21.myweb.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myweb.util.JdbcUtil;

public class OptionDAO {
	public static final String SELECT = "select * from product";
	public static final String INSERT = "insert into product(rno, rtitle, rprice) values (NEXTVAL('seq_product'), ?, ?)";
	public static final String DELETE = "DELETE FROM product WHERE rno=?";
	
	
	private Connection conn ;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
//전체리스트
   public List<OptionDTO> selectAll() {
	      conn = JdbcUtil.getConnection();
	      List<OptionDTO> list = null;
	      
	      try {
	         pstmt = conn.prepareStatement(SELECT);
	         rs = pstmt.executeQuery();
	         while(rs.next()) {
	            if(list == null) {
	               list = new ArrayList();
	            }
	            int id = rs.getInt(1);
	            String rtitle = rs.getString(2);
	            int rprice = rs.getInt(3);
	            list.add(new OptionDTO(id, rtitle, rprice));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         JdbcUtil.close(conn, pstmt, rs);
	      }
	      return list;
      }


	   //등록하기
	   public void insert(OptionDTO dto) throws SQLException {

		   
		   conn = JdbcUtil.getConnection();
		   PreparedStatement pstmt = conn.prepareStatement(INSERT);
		   
		   pstmt.setString(1,dto.getRtitle());
		   pstmt.setInt(2,dto.getRprice());
		   //업데이트를해줘야 실행된다.
		   pstmt.executeUpdate();
		   
		   JdbcUtil.close(conn, pstmt, null);
	      
	   }
	   
	   //삭제
	   public void delete(int no) throws SQLException {
		   conn = JdbcUtil.getConnection();
		   PreparedStatement pstmt = conn.prepareStatement(DELETE);
		   pstmt.setInt(1, no);
		   
		   pstmt.executeUpdate();
		   
		   JdbcUtil.close(conn,pstmt,null);
		   
	   }
}
