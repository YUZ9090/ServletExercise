package org.comstudy21.myapp.bbs;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {

	//session생성
	private SqlSessionFactory sqlSessionFactory;

	// getter 메서드 생성
	public SqlSessionFactory getSqlSessionFactory() {

		// config
		String resource = "mybatis-config.xml";

		try {
			Reader reader = Resources.getResourceAsReader(resource);

			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sqlSessionFactory;
	}

}
