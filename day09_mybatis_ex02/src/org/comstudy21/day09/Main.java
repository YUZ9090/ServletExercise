package org.comstudy21.day09;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main {

   public static void main(String[] args) throws IOException {
      String resource = "org/comstudy21/day09/mybatis-config.xml";
      InputStream inputStream = Resources.getResourceAsStream(resource);
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
      
      try (SqlSession mybatis = sqlSessionFactory.openSession()) {
        BlogMemo memo = mybatis.selectOne("BlogMapper.selectBlog", 001);
        System.out.println(memo);
        System.out.println();
        
        //List<Blog> list =mybatis.selectList("BlogMapper.selectAll");
       // System.out.println(list);
        
      }
   }

}