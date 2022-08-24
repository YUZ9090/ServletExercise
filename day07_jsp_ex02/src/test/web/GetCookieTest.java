package test.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookieTest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html;charset=euk-kr");
		PrintWriter out = resp.getWriter();
		
		Enumeration enu = req.getHeaderNames();
		
		while(enu.hasMoreElements()) {
			String key = (String)enu.nextElement();
			System.out.println(key+" "+req.getHeader(key));
		}
		
		Cookie [] allValues = req.getCookies();
		
		for(int i = 0; i<allValues.length ; i++) {
			if(allValues[i].getName().equals("cookieTest")) {
				out.println("<h2>Cookie 값 가져오기: " +allValues[i].getValue());
				out.println("<hr><h2>저장된 Cookie 값을 가져왔습니다<br>");
			}
		}
	}


}
