package org.comstudy21.myweb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil_test {
//�����
	public static void main(String[] args) {
		//����̹��� �־�����Ѵ�.
		//�����н��� ����� ����Ҽ�����.
		//���۷������̺귯��: ���ο����������س־��ִ���
		//lib���ִ°�: ��������������
		
		String url = "jdbc:h2:tcp://localhost/~/test".trim();
		//Ȥ�ó��� ������ ���� triml()����
		String user = "sa";
		String password = "12345";
		Connection conn;
		
		System.out.println("�⵿��...");
		try {
			Class.forName("org.h2.Driver");
			//�ش����̹��� ã���� ���ÿ� �ε����ش�.
			//org.h2.Driver.class ���� Ȯ���ڴ¾����ʴ´�(class)
			System.out.println("����̹� �˻� ����!");
			//Ŀ�ؼ�Ÿ��
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹� �˻� ����..");
			e.printStackTrace();
		}
		
		catch (SQLException e) {
	 		System.out.println("���ӽ���..");
			e.printStackTrace();
		}
		
		//����Ŭ�����ϱ� �ڹ� ���ø����̼����� �����Ѵ�.
	}

}