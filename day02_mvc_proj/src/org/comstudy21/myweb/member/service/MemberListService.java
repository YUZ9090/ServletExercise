package org.comstudy21.myweb.member.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.member.MemberDTO;
import static org.comstudy21.myweb.controller.MyController.memberDAO;

public class MemberListService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		List<MemberDTO> memList = memberDAO.selectAll();
		req.setAttribute("memList", memList);
		return "member/list";
	}
}
