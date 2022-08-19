package org.comstudy21.myweb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil_test {
//백업용
	public static void main(String[] args) {
		//드라이버를 넣어줘야한다.
		//빌드패스를 해줘야 사용할수있음.
		//레퍼런스라이브러리: 메인에서쓰기위해넣어주느거
		//lib에넣는거: 웹에서쓰기위해
		
		String url = "jdbc:h2:tcp://localhost/~/test".trim();
		//혹시나모를 공백을 위해 triml()써줌
		String user = "sa";
		String password = "12345";
		Connection conn;
		
		System.out.println("기동중...");
		try {
			Class.forName("org.h2.Driver");
			//해당드라이버를 찾음과 동시에 로드해준다.
			//org.h2.Driver.class 에서 확장자는쓰지않는다(class)
			System.out.println("드라이버 검색 성공!");
			//커넥션타입
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 검색 실패..");
			e.printStackTrace();
		}
		
		catch (SQLException e) {
	 		System.out.println("접속실패..");
			e.printStackTrace();
		}
		
		//메인클래스니까 자바 어플리케이션으로 실행한당.
	}

}
