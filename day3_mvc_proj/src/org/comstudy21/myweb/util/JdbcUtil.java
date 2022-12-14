package org.comstudy21.myweb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
   public static Connection getConnection() {
      String url = " jdbc:h2:tcp://localhost/~/test".trim();
      String user = "sa";
      String password = "12345";
      Connection conn = null;
      // 드라이버
      try {
         Class.forName("org.h2.Driver");
         conn = DriverManager.getConnection(url, user, password);
         System.out.println(conn);
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버 검색 실패!");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("접속 실패!");
         e.printStackTrace();
      }
      return conn;
   }
   
   public static void close(Connection conn) {
      if(conn != null) {
         try {
            conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }
   public static void close(Statement conn) {
      if(conn != null) {
         try {
            conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }
   public static void close(ResultSet conn) {
      if(conn != null) {
         try {
            conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }
   
   //위에서 만든 close 한번에 닫아주는 함수
   public static void close(Connection conn, Statement stmt, ResultSet rs) {
      close(conn);
      close(stmt);
      close(rs);
   }
}