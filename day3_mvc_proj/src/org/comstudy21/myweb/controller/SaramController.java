package org.comstudy21.myweb.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.service.MemberDeleteService;
import org.comstudy21.myweb.service.MemberJoinService;
import org.comstudy21.myweb.service.MemberListService;
import org.comstudy21.myweb.service.MemberSearchService;
import org.comstudy21.myweb.service.MemberUpdateService;



public class SaramController implements MyController {
	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {

		System.out.println("---- MemberController ----");
		
		
		String fileName = (String)req.getAttribute("fileName");

		String viewName = "member/list";
		
		
		if("/list".equals(fileName)) {
			try {
				viewName = new MemberListService().service(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if("/join".equals(fileName)) {
			try {
				viewName = new MemberJoinService().service(req,resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}else if("/delete".equals(fileName)) {
			try {
				viewName = new MemberDeleteService().service(req,resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else if("/update".equals(fileName)) {
			try {
				viewName = new MemberUpdateService().service(req,resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else if("/search".equals(fileName)) {
			try {
				System.out.println("??ġ ??????");
				viewName = new MemberSearchService().service(req,resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}else if("/searchName".equals(fileName)) {
			
		}
		
		return viewName;
		

	}

}
