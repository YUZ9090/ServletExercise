package org.comstudy21.myapp.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myapp.common.JDBCUtil;
import org.comstudy21.myapp.user.UserVO;
import org.h2.util.JdbcUtils;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAO {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	private final String USER_INSERT = "INSERT INTO USERS(ID, PASSWORD, NAME, ROLE) VALUES (?,?,?,?)";
	private final String USER_UPDATE = "UPDATE USERS SET PASSWORD=?, NAME=?, ROLE=? WHERE ID=?";
	private final String USER_DELETE = "DELETE FROM USERS WHERE ID=?";
	private final String USER_GET = "SELECT * FROM USERS WHERE ID=?";
	private final String USER_LIST = "SELECT * FROM USERS";
	private final String USER_LOGIN = "SELECT * FROM USERS WHERE ID=? AND PASSWORD=?";

	public void insertUser(UserVO vo) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(USER_INSERT);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.setString(3, vo.getName());
			stmt.setString(4, vo.getRole());
			int cnt = stmt.executeUpdate();
			if(cnt>0) {
				conn.commit();
			} else {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, rs);
		}
	}

	public void updateUser(UserVO vo) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(USER_UPDATE);
			stmt.setString(1, vo.getPassword());
			stmt.setString(2, vo.getName());
			stmt.setString(3, vo.getRole());
			stmt.setString(4, vo.getId());
			int cnt = stmt.executeUpdate();
			if(cnt>0) {
				conn.commit();
			} else {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, rs);
		}
	}

	public void deleteUser(UserVO vo) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(USER_DELETE);
			stmt.setString(1, vo.getId());
			int cnt = stmt.executeUpdate();
			if(cnt>0) {
				conn.commit();
			} else {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, rs);
		}
	}

	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			rs = stmt.executeQuery();
			if(rs.next()) {
				String id = rs.getString(1);
				String password = rs.getString(2);
				String name = rs.getString(3);
				String role = rs.getString(4);
				user = new UserVO(id, password, name, role);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, rs);
		}
		return user;
	}
	
	public UserVO loginUser(UserVO vo) {
		UserVO user = null;
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(USER_LOGIN);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			if(rs.next()) {
				String id = rs.getString(1);
				String password = rs.getString(2);
				String name = rs.getString(3);
				String role = rs.getString(4);
				user = new UserVO(id, password, name, role);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, rs);
		}
		return user;
	}

	public List<UserVO> getUserList(UserVO vo) {
		List<UserVO> list = new ArrayList();
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(USER_LIST);
			rs = stmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String password = rs.getString(2);
				String name = rs.getString(3);
				String role = rs.getString(4);
				list.add( new UserVO(id, password, name, role) );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, rs);
		}
		return list;
	}
}
