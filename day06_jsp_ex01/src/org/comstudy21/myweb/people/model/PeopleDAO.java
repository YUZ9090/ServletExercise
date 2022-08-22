package org.comstudy21.myweb.people.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myapp.dbcp.JdbcUtil;
import org.comstudy21.myweb.DAO;
import org.comstudy21.myweb.product.model.ProductDTO;


interface sqlInterface extends DAO {
   String SELECT_ALL = "select * from people order by pno desc";
   String SELECT_ONE = "select * from people where pno=?";
   String INSERT = "insert into people(pno, name, phone, rpay, rno) values(nextval('seq_people'), ?, ?, ?, (select max(rno) from product))";
   String UPDATE = "update people set name=?, phone=?, rpay=? where pno=?";
   String DELETE = "delete from people where pno=?";
}

public class PeopleDAO implements sqlInterface {
   private ResultSet rs = null;
   private PreparedStatement stmt = null;
   private Connection conn = null;

   @Override
   public List<Object> selectAll() {
      List<Object> list = new ArrayList();
      conn = JdbcUtil.getConnection();
      try {
         stmt = conn.prepareStatement(SELECT_ALL);
         rs = stmt.executeQuery();
         while(rs.next()) {
            int pno = rs.getInt(1); 
            String name = rs.getString(2); 
            String phone = rs.getString(3); 
            String rpay = rs.getString(4); 
            int rno = rs.getInt(5);
            list.add(new PeopleDTO(pno, name, phone, rpay, rno));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         JdbcUtil.close(conn, stmt, rs);
      }
      return list;
   }

   @Override
   public Object selectOne(Object obj) {
      PeopleDTO dto = null;
      if(obj instanceof PeopleDTO) {
         dto = (PeopleDTO) obj;
      } else {
         return null;
      }
      PeopleDTO people = null;
      conn = JdbcUtil.getConnection();
      try {
         stmt = conn.prepareStatement(SELECT_ONE);
         stmt.setInt(1, dto.getPno());
         rs = stmt.executeQuery();
         if(rs.next()) {
            int pno = rs.getInt(1); 
            String name = rs.getString(2); 
            String phone = rs.getString(3); 
            String rpay = rs.getString(4); 
            int rno = rs.getInt(5);
            people = new PeopleDTO(pno, name, phone, rpay, rno);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         JdbcUtil.close(conn, stmt, rs);
      }

      return people;
   }

   @Override
   public int insert(Object obj) {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public int update(Object obj) {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public int delete(Object obj) {
      // TODO Auto-generated method stub
      return 0;
   }

@Override
public Object selectOne() {
	// TODO Auto-generated method stub
	return null;
}
   
}