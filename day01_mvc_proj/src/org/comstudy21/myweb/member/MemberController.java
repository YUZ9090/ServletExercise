package org.comstudy21.myweb.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;

public class MemberController extends MyController {

   @Override
   public String handler(HttpServletRequest req, HttpServletResponse resp) {
      // TODO Auto-generated method stub
	   System.out.println(">>>MemeberController...");
	      return "member/list";
   }

}