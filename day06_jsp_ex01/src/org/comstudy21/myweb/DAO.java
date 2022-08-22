package org.comstudy21.myweb;

import java.util.List;

public interface DAO {
   // selectAll, insert, update, delete, selectOne
   public List<Object> selectAll();
   public Object selectOne();
   public int insert(Object obj);
   public int update(Object obj);
   public int delete(Object obj);
}