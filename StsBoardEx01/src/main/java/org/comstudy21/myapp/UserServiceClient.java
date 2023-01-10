package org.comstudy21.myapp;

import java.util.List;

import org.comstudy21.myapp.user.UserService;
import org.comstudy21.myapp.user.UserVO;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

   public static void main(String[] args) {
      // 1. ����
      String resourceLocations = "classpath:applicationContext.xml";
      AbstractApplicationContext container = 
            new GenericXmlApplicationContext(resourceLocations);
      
      //2 ���
      UserService userService = (UserService)container.getBean("userService");
      
      
      //�Է� �ؽ�Ʈ
      UserVO vo = new UserVO("admin", "admin", "������2", "Admin");
      userService.insertUser(vo);
      
      
      //4 ��� �˻� �׽�Ʈ
      List<UserVO> list = userService.getUserList(null);
      for(UserVO user : list) {
         System.out.println(user);
      }
   }
}