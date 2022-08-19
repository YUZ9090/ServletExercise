package org.comstudy21.myweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
   
   protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println(">>> DispatcherServlet ...");
      String ctxPath = req.getContextPath();
      String reqUri = req.getRequestURI();
      
      //패스만드는거
      int beginIndex = ctxPath.length();
      int endIndex = reqUri.lastIndexOf("."); //점앞에서 잘라냄
      String path = reqUri.substring(beginIndex, endIndex); //시작끝점
      String filename = reqUri.substring(reqUri.lastIndexOf("/", endIndex)); //뒤에서부터 처음만나는 슬래시위치까지 잘라냄
      
      
      //패스확인 테스트
//      System.out.println("ctxPath : " + ctxPath);
//      System.out.println("reqUri : " + reqUri);
//      System.out.println("path : " + path);
      req.setAttribute("path", path);
      req.setAttribute("Filename", filename);
      System.out.println("path: "+path);
      System.out.println("filename: "+filename);
      
      //방법 1: switch 문 또는 if~else 문으로 path를 분기시키기
      //방법 2: Map 구조에 Controller 를 저장해서 path를 key 값으로 실행
      
   }
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doProcess(req, resp);
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doProcess(req, resp);
   }
}