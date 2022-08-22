package org.comstudy21.myweb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements MyController {
	static Map<String, String> items = null;

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		String ctxPath = req.getContextPath();
		if(items == null){
			items = new HashMap();
			items.put("���� ��û(����)",ctxPath+"/reservation/join.do");
			items.put("�Ĵ� ���� �� ���(������)",ctxPath+"/reservation/list.do");
			items.put("�Ĵ� �޴�����(������)",ctxPath+"/menu/list.do");
		}
		
		//System.out.println(">>> HomeController ... ");
		
		req.setAttribute("items", items);
		
		return "home";
	}

}
