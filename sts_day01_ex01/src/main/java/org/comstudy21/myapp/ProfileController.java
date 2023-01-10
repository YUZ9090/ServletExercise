package org.comstudy21.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

	@RequestMapping(value="/profile.do")
	public String profile() {
		System.out.println("profile():profileController »£√‚");
		return "profile";
	}
	
}
