package org.comstudy21.myapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.comstudy21.myapp.user.UserVO;

public interface UserMapper {
	
	@Select("SELECT * FROM USERS WHERE id = #{id}")
	public UserVO getUser(UserVO vo);
	
	@Insert("INSERT INTO USERS(ID, PASSWORD, NAME, ROLE) VALUES (#{id},#{password},#{name},#{role})")
	public void insertUser(UserVO vo);

	@Update("UPDATE USERS SET PASSWORD=#{password}, NAME=#{name}, ROLE=#{role} WHERE ID=#{id}")
	public void updateUser(UserVO vo);

	@Delete("DELETE FROM USERS WHERE ID=#{id}")
	public void deleteUser(UserVO vo);
	
	@Select("SELECT * FROM USERS WHERE ID=#{id} AND PASSWORD=#{password}")
	public UserVO loginUser(UserVO vo);

	@Select("SELECT * FROM USERS")
	public List<UserVO> getUserList(UserVO vo);
}
