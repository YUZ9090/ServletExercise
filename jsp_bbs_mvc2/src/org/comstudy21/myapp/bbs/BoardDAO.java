package org.comstudy21.myapp.bbs;


import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class BoardDAO extends SqlMapConfig{
	
	
	//게시글리스트뽑기
	public List<BoardDTO> selectAll(){
		
		SqlSession session = getSqlSessionFactory().openSession();
		List<BoardDTO> res = session.selectList("Mapper.selectAll");
		session.close();
		
		return res;
	}
	

	//디테일보기
	public BoardDTO detail(String num){
		SqlSession session = getSqlSessionFactory().openSession();
		Map<String, String> map = new Hashtable<String, String>();
		map.put("num", num);
		BoardDTO dto = session.selectOne("Mapper.findByNum", map);
		session.close();
		return dto;
	}
	
	
	//쓰기
	public void write(String author, String email, String title, String content, String passwd){
		//openSession(true) 해줘야 쓰기가능
		SqlSession session = getSqlSessionFactory().openSession(true);
		Map<String, String> map = new Hashtable();
		

		//num, author, email, title, content, passwd
		map.put("author", author);
		map.put("email", email);
		map.put("title", title);
		map.put("content", content);
		map.put("passwd", passwd);
		session.insert("Mapper.write", map);
		session.close();
	}
	
	//수정
	public void update(String num, String author, String email, String title, String content,String passwd){
		SqlSession session = getSqlSessionFactory().openSession(true);
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("author", author);
		map.put("email", email);
		map.put("title", title);
		map.put("content", content);
		map.put("passwd", passwd);
		map.put("num", num);
		
		session.update("Mapper.update", map);
		session.close();
	}
	
	
	//삭제
	public void delete(String num){
		SqlSession session = getSqlSessionFactory().openSession(true);
		Map<String, String> map = new Hashtable<String, String>();
		map.put("num", num);
		BoardDTO res = session.selectOne("Mapper.delete",map);
		session.close();
		
	}

	
}
