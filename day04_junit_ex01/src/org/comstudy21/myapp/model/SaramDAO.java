package org.comstudy21.myapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myapp.dbcp.JdbcUtil;

public class SaramDAO {
   public static final String SELECT = "SELECT * FROM SARAM";
   public static final String INSERT = "INSERT INTO SARAM(NAME,PHONE,EMAIL)VALUES(?,?,?)";
   public static final String UPDATE = "UPDATE SARAM SET NAME=?, PHONE=?, EMAIL=? WHERE ID=?";
   public static final String SELECT_ONE = "SELECT * FROM SARAM WHERE ID=?";
   public static final String SELECT_NAME = "SELECT id, name, phone, email FROM SARAM WHERE NAME LIKE '%'||?||'%'";
   public static final String DELETE = "DELETE FROM SARAM WHERE ID=?";
   
   private Connection conn;
   private Statement stmt;
   private PreparedStatement pstmt;
   private ResultSet rs;
   
   public List<SaramDTO> selectAll() {
      conn = JdbcUtil.getConnection();
      List<SaramDTO> list = null;
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
            String email = rs.getString(4);
            list.add(new SaramDTO(id, name, phone, email) );
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         JdbcUtil.close(conn, pstmt, rs);
      }
      return list;
   }
   
   public SaramDTO selectOne(SaramDTO dto) {
      return findById(dto.getId());
   }
   
   public SaramDTO findById(int id) {
      conn = JdbcUtil.getConnection();
      SaramDTO saram = null;
      try {
         pstmt = conn.prepareStatement(SELECT_NAME);
         pstmt.setInt(1, id);
         rs = pstmt.executeQuery();
         if(rs.next()) {
            String name = rs.getString(2);
            String phone = rs.getString(3);
            String email = rs.getString(4);
            saram = new SaramDTO(id, name, phone, email);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         JdbcUtil.close(conn, pstmt, rs);
      }
      return saram;
   }
   
   public List<SaramDTO> findByName(SaramDTO dto) {
      conn = JdbcUtil.getConnection();
      List<SaramDTO> list = null;
      try {
         pstmt = conn.prepareStatement(SELECT_NAME);
         pstmt.setString(1, dto.getName());
         rs = pstmt.executeQuery();
         while(rs.next()) {
            if(list == null) {
               list = new ArrayList();
            }
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String phone = rs.getString(3);
            String email = rs.getString(4);
            list.add(new SaramDTO(id, name, phone, email) );
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         JdbcUtil.close(conn, pstmt, rs);
      }
      return list;
   }
   
   public int update(SaramDTO dto) {
      
      return 0;      
   }
   
   public int delete(SaramDTO dto) {
      return 0;
   }
   
   public int insert(SaramDTO dto) {
      conn = JdbcUtil.getConnection();
      int resultCnt = 0;
      try {
         pstmt = conn.prepareCall(INSERT);
         pstmt.setString(1, dto.getName());
         pstmt.setString(2, dto.getPhone());
         pstmt.setString(3, dto.getEmail());
         resultCnt = pstmt.executeUpdate();
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         JdbcUtil.close(conn, pstmt, rs);
      }
      return resultCnt;
   }
}