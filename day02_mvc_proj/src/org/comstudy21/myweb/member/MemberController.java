package org.comstudy21.myweb.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;
import org.comstudy21.myweb.member.service.MemberJoinService;
import org.comstudy21.myweb.member.service.MemberListService;

public class MemberController implements MyController {
	//MyController???? ?Ѱ??? ?־??Z?⶧???? ???⼭ ???ξ??ص???.
	//private MemberDAO memberDAO = new MemberDAO();
	

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		//System.out.println(">>>Member controller...");

		System.out.println("---- MemberController ----");
		
		/*
		if("POST".equals(req.getMethod())) {
			//???? ???? ?? ???ΰ?ħ
			String name= req.getParameter("name");
			String phone = req.getParameter("phone");
			MemberDTO dto = new MemberDTO(0,name,phone);
			memberDAO.insert(dto);
			return "redirect:list.do";
		}*/
		
		
		
		
		String fileName = (String)req.getAttribute("fileName");
		//System.out.println("fileName => " + fileName);
		
		String viewName = "member/list";
		if("/list".equals(fileName)) {
			viewName = new MemberListService().service(req, resp);
		}else if("/join".equals(fileName)) {
			viewName = new MemberJoinService().service(req,resp);
		}
		
		
		
		
		return viewName;
		
		
		//??Ʈ?ѷ????ο????? ???ɱ??????ʿ???.
		//?????? ???⿡???α????ϸ? ?? ????????
		//??Ʈ?ѷ??? ?????Ѱ?ó?? ???񽺸? ???⼭ ???????ش?
		
	}

}
