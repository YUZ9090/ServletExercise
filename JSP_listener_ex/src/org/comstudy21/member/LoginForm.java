package org.comstudy21.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/webapp/login")
public class LoginForm extends HttpServlet {
   private static final long serialVersionUID = 1L;
   private String id= "hong";
   private String passwd ="1234";
   

   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
   }
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("UTF-8");
      resp.setCharacterEncoding("UTF-8");
      resp.setContentType("text/html; charset=UTF-8");
      
      HttpSession session = req.getSession();
      
      String userid = req.getParameter("userid");
      String password = req.getParameter("password");
      
      String result="실패";
      
      if(userid.equals(id)&&password.equals(passwd)) {
    	  result="성공";
    	  Login login = new Login(userid, password);
    	  //HttpSessionBindingListenr 실행
    	  session.setAttribute("login", login);
      }
      System.out.println(">>>> doPost 요청 받음");
      
      PrintWriter out = resp.getWriter();
      out.println("<html><head>\r\n"
            + "<meta charset=\"UTF-8\">\r\n"
            + "<title>Insert title here</title>\r\n"
            + "</head><body>");
      out.println("<h1>로그인 결과</h1>");
      out.printf("<h3>total login:%d </h3>",Login.total);
      out.printf("userID:%s, password:%s\n", userid, password);
      out.println("</body></html>");
      out.close();
   }

}