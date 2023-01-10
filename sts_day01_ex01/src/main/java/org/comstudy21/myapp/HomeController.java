package org.comstudy21.myapp;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	


	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("userName","ȫ�浿");
		model.addAttribute("serverTime", formattedDate );
		List<HashMap<String,String>> menuItemList = new ArrayList<HashMap<String,String>>();
		HashMap<String,String> menu = new HashMap<String,String>();
		menu.put("title", "naver");
		menu.put("url", "https://www.naver.com/");
		menuItemList.add(menu);
		menu = new HashMap<String,String>();
		menu.put("title", "profile");
		menu.put("url", "profile.do");
		menuItemList.add(menu);
		menu = new HashMap<String,String>();
		menu.put("title", "gallery");
		menu.put("url", "gallery.do");
		menuItemList.add(menu);
		menu = new HashMap<String,String>();
		menu.put("title", "board");
		menu.put("url", "board/list.do");
		menuItemList.add(menu);
		model.addAttribute("menuItemList",menuItemList);
		
		return "home";
		
		

	}
	
}
