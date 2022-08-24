package test.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SetCookieTest extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=euk-kr");
		PrintWriter out = resp.getWriter();
		
		Enumeration enu = req.getHeaderNames();
		
		while(enu.hasMoreElements()) {
			String key = (String)enu.nextElement();
			System.out.println(key+" "+ req.getHeader(key));
		}
		
		Date d = new Date();
		
		System.out.println("!!!!!!!!!!!!!!!"+d.toString());
		//쿠키생성
		Cookie c = new Cookie("cookieTest",d.toString());
		c.setMaxAge(24*60*60);//24시간
		
		resp.addCookie(c);
		
		out.println("현재시간"+d);
		out.println("현재시간을 Cookie로 저장합니다");
		
	}

}
