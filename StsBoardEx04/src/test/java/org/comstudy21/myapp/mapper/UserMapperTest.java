package org.comstudy21.myapp.mapper;

import static org.junit.Assert.*;

import org.comstudy21.myapp.user.UserVO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUser() {
		UserVO vo = new UserVO("test");
		System.out.println(userMapper.getUser(vo));
	}
	
	@Test
	public void testGetUserList() {
		UserVO vo = new UserVO("test");
		System.out.println(userMapper.getUserList(vo));
	}
	
	@Test
	public void testLogin() {
		String id = "user1";
		String password = "user1";
		UserVO vo = new UserVO(id, password);
		System.out.println(userMapper.loginUser(vo));
	}

}
