package util;

import java.util.List;

public interface DAO<T> {
   // selectAll, insert, update, delete, selectOne
   public List<T> selectAll();
   public T selectOne(T obj);
   public int insert(T obj);
   public int update(T obj);
   public int delete(T obj);
   
   public static String mkSql_selectOne(String table, String condition) {
      return String.format("SELECT * FROM %s WHERE %s=?", table, condition);
   }
   public static String mkSql_selectAll(String table) {
      return String.format("SELECT * FROM %s", table);
   }
   public static String mkSql_insert(String table, String ... fields) {
      // "insert into %s(a, b, c) values(?,?,?)"
      String str = "insert into %s(";
      for(int i=0; i<fields.length; i++) {
         str += fields[i] + (i<fields.length-1?", ":"");
      }
      str += ") values (";
      for(int i=0; i<fields.length; i++) {
         str += i<fields.length-1?"?, ":"?";
      }
      str += ")";
      System.out.println(str);
      return String.format(str, table);
   }
   
   
   
   public static String mkSql_update(String table, String ... fields) {
      // update test set a=?, b=? where c=?
      String str = "update %s set ";
      for(int i=0; i<fields.length-1; i++) {
         str += fields[i] + (i<fields.length-2?"=?, ":"=?");
      }
      str +=  " where "+fields[fields.length-1]+"=?";
      System.out.println(str);
      return String.format(str, table);
   }
   public static String mkSql_delete(String table, String condition) {
      return String.format("DELETE FROM %s WHERE %s=?", table, condition);
   }
   
   
   public static void main(String[] args) {
      //String sql = mkSql_insert("test", "aa", "bb", "cc");
      //System.out.println(sql);
      
      //String sql = mkSql_update("table", "aa","bb","cc");
      //System.out.println(sql);
      
      //String sql = mkSql_selectOne("table", "id");
      //System.out.println(sql);
      
      String sql = mkSql_delete("table", "id");
      System.out.println(sql);
   }
}