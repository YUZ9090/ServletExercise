package org.comstudy21.myapp.member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myapp.dbcp.DAO;
import org.comstudy21.myapp.dbcp.JdbcUtil;

public class MemberDAO implements DAO<MemberDTO>{
   public static final String tableName = "member";
   public static final String[] fields = {"memNo", "memName", "memEmail", "memPassword", "regDate"};
   public static final String SELECT_ALL = DAO.mkSql_selectAll(tableName);
   public static final String SELECT_ONE = DAO.mkSql_selectOne(tableName, "memNo");
   public static final String INSERT = DAO.mkSql_insert(tableName, fields);
   public static final String UPDATE = DAO.mkSql_update(tableName, "memName", "memEmail", "memPassword", "regDate", "memNo");
   public static final String DELETE = DAO.mkSql_delete(tableName, "memNo");
   public static final String SEARCH = "SELECT * FROM member WHERE memName LIKE '%'||?||'%'";
   
   private Connection conn;
   private PreparedStatement stmt;
   private ResultSet rs;
   private int resultCnt;
   
   @Override
   public List<MemberDTO> selectAll() {
      
      return null;
   }

   @Override
   public MemberDTO selectOne(MemberDTO obj) {
      List<MemberDTO> list = new ArrayList<MemberDTO>();
      conn = JdbcUtil.getConnection("");
      
      return null;
   }

   @Override
   public int insert(MemberDTO obj) {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public int update(MemberDTO obj) {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public int delete(MemberDTO obj) {
      // TODO Auto-generated method stub
      return 0;
   }

   
   public static void main(String[] args) {
//      System.out.println(SELECT_ALL);
//      System.out.println(SELECT_ONE);
//      System.out.println(INSERT);
//      System.out.println(UPDATE);
//      System.out.println(DELETE);
   }
}