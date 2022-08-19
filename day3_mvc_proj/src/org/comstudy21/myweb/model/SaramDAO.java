package org.comstudy21.myweb.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myweb.util.JdbcUtil;

public class SaramDAO {
   public static final String SELECT = "SELECT * FROM SARAM";
   public static final String INSERT = "INSERT INTO SARAM(NAME,PHONE,EMAIL) VALUES(?,?,?)";
   public static final String UPDATE = "UPDATE SARAM SET NAME=?, PHONE=?, EMAIL=? WHERE ID=?";
   public static final String SELECT_ONE = "SELECT * FROM SARAM WHERE ID=?";
 //이름으로 검색하는용 (LIKE를쓰는게좋다)
   public static final String SELECT_NAME = "SELECT * FROM SARAM WHERE NAME LIKE '%'||?||'%'";
   public static final String DELETE = "DELETE FROM SARAM WHERE ID=?";
   
   
   private Connection conn ;
   private Statement stmt ; //statement를 만들필욘없지만만들어본다
   private PreparedStatement pstmt;
   private ResultSet rs;
   
   
   public List<SaramDTO> selectAll() throws SQLException {
	   

	   //리스트보기
	   List<SaramDTO> dtoList = new ArrayList<SaramDTO>();
	   
	   conn = JdbcUtil.getConnection();
	   stmt =conn.createStatement();
	   rs = stmt.executeQuery(SELECT);
		while(rs.next()){
			int id = rs.getInt("id");	
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String email = rs.getString("email");
			SaramDTO dto = new SaramDTO(id,name,phone,email);
			dtoList.add(dto);
			
			System.out.println(dto);
			}
	   
	      return dtoList;
	   }
   
	   
   public SaramDTO selectOne(int id) throws SQLException {
	   conn = JdbcUtil.getConnection();
	   PreparedStatement pstmt = conn.prepareStatement(SELECT_ONE);
	   pstmt.setInt(1, id);

	   rs = pstmt.executeQuery();	
		String name = rs.getString("name");
		String phone = rs.getString("phone");
		String email = rs.getString("email");
		SaramDTO dto = new SaramDTO(id,name,phone,email);
	   
	      return dto;
	   }
	   
   
   public List<SaramDTO> findByName(SaramDTO dto){
	   conn = JdbcUtil.getConnection();
	   List<SaramDTO> list=null;
	   try {
			pstmt = conn.prepareStatement(SELECT_NAME);
			pstmt.setString(1,dto.getName());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				if(list==null) {
					list = new ArrayList();
				}
				int id =rs.getInt(1);
				String name = rs.getString(2); //순서로넣는거임
				String phone = rs.getString(3);
				String email = rs.getString(4);
				list.add(new SaramDTO(id,name,phone,email));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn,pstmt,rs);
		}
	   
      return null;
   }
	   public void update(SaramDTO dto) throws SQLException {
		   conn = JdbcUtil.getConnection();
		   PreparedStatement pstmt = conn.prepareStatement(UPDATE);
		   pstmt.setString(1,dto.getName());
		   pstmt.setString(2,dto.getPhone());
		   pstmt.setString(3,dto.getEmail());
		   pstmt.setInt(4,dto.getId());
		   
		   pstmt.executeUpdate();
	      
	   }
	   
	   public void delete(int no) throws SQLException {
		   conn = JdbcUtil.getConnection();
		   PreparedStatement pstmt = conn.prepareStatement(DELETE);
		   pstmt.setInt(1, no);
		   
		   pstmt.executeUpdate();
		   
		   JdbcUtil.close(conn,pstmt,null);
		   
	   }
	   
	   
	   //등록하기
	   public void insert(SaramDTO dto) throws SQLException {
		   
		   conn = JdbcUtil.getConnection();
		   PreparedStatement pstmt = conn.prepareStatement(INSERT);
		   pstmt.setString(1,dto.getName());
		   pstmt.setString(2,dto.getPhone());
		   pstmt.setString(3,dto.getEmail());
		   
		   //업데이트를해줘야 실행된다.
		   pstmt.executeUpdate();
		   
		   JdbcUtil.close(conn, pstmt, null);
	      
	   }

}
