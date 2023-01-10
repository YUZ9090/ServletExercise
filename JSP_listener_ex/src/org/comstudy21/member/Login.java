package org.comstudy21.member;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Login implements HttpSessionBindingListener {
   public static int total = 0;
   private String userid;
   private String passwd;
   
   public Login(String userid, String passwd) {
      this.userid = userid;
      this.passwd = passwd;;
   }
   
   public String getUserid() {
      return userid;
   }

   public String getPasswd() {
      return passwd;
   }

   @Override
   public void valueBound(HttpSessionBindingEvent event) {
      System.out.println(">>> valueBound");
      total++;
   }
   
   @Override
   public void valueUnbound(HttpSessionBindingEvent event) {
      System.out.println(">>> valueUnbound");
      total--;
   }
}