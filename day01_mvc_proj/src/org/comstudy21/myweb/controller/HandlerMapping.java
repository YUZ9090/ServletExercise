package org.comstudy21.myweb.controller;

import java.util.HashMap;

import org.comstudy21.myweb.bbs.BoardController;
import org.comstudy21.myweb.member.MemberController;
import org.comstudy21.myweb.shop.ShopController;


//??Ʈ?ѷ??? ?Ѱ??ϴ? ?A???ѷ?. ????
public class HandlerMapping {
	HashMap<String,MyController> map = new HashMap();
	
	public HandlerMapping() {
		map.put("/member", new MemberController());
		map.put("/bbs", new BoardController());
		map.put("/shop", new ShopController());
		
	}
	
	
	//?ؽ??㿡 ??Ʈ?ѷ??? ?????????ϴ°???
	public MyController getController(String key) {
		return map.get(key);
		
	}

}
