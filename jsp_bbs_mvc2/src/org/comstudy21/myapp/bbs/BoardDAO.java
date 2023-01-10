package org.comstudy21.myapp.bbs;


import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class BoardDAO extends SqlMapConfig{
	
	
	//�Խñ۸���Ʈ�̱�
	public List<BoardDTO> selectAll(){
		
		SqlSession session = getSqlSessionFactory().openSession();
		List<BoardDTO> res = session.selectList("Mapper.selectAll");
		session.close();
		
		return res;
	}
	

	//�����Ϻ���
	public BoardDTO detail(String num){
		SqlSession session = getSqlSessionFactory().openSession();
		Map<String, String> map = new Hashtable<String, String>();
		map.put("num", num);
		BoardDTO dto = session.selectOne("Mapper.findByNum", map);
		session.close();
		return dto;
	}
	
	
	//����
	public void write(String author, String email, String title, String content, String passwd){
		//openSession(true) ����� ���Ⱑ��
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
	
	//����
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
	
	
	//����
	public void delete(String num){
		SqlSession session = getSqlSessionFactory().openSession(true);
		Map<String, String> map = new Hashtable<String, String>();
		map.put("num", num);
		BoardDTO res = session.selectOne("Mapper.delete",map);
		session.close();
		
	}

	
}
