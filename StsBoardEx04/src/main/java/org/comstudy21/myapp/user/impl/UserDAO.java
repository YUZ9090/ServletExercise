package org.comstudy21.myapp.user.impl;

import java.util.List;

import org.comstudy21.myapp.mapper.UserMapper;
import org.comstudy21.myapp.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAO {
	@Autowired
	private UserMapper userMapper;
	
	public void insertUser(UserVO vo) {
		userMapper.insertUser(vo);
	}

	public void updateUser(UserVO vo) {
		userMapper.updateUser(vo);
	}

	public void deleteUser(UserVO vo) {
		userMapper.deleteUser(vo);
	}

	public UserVO getUser(UserVO vo) {
		return userMapper.getUser(vo);
	}
	
	public UserVO loginUser(UserVO vo) {
		return userMapper.loginUser(vo);
	}

	public List<UserVO> getUserList(UserVO vo) {
		return userMapper.getUserList(vo);
	}
}
