package org.comstudy21.myweb.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.service.ReserveService;

public class ReserveController implements MyController{
	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {

		System.out.println("---- ReserveController ----");
		
		
		String fileName = (String)req.getAttribute("fileName");

		String viewName = "reservation/list";
		
		//리스트
		if("/list".equals(fileName)) {
			try {
				viewName = new ReserveService().viewList(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//등록
		}else if("/join".equals(fileName)) {
			try {
				viewName = new ReserveService().regist(req,resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			//삭제
		}else if("/delete".equals(fileName)) {
			try {
				viewName = new ReserveService().delete(req,resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return viewName;
		

	}
}
