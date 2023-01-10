package org.comstudy21.myapp.bbs;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class BoadDAO extends SqlMapConfig{

	public List<BoardDTO> selectAll(){
		SqlSession session = getSqlSessionFactory().openSession(true);
		List<BoardDTO> res = session.selectList("Mapper.selectAll");
		session.close();
		
		return res;

	}


}
