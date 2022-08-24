package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import login.MemberController;
import myshop.ProductController;



public class HandlerMapping {
	//단하나만 있을거라 final 준당(상수됨)
	//ctrlMap라는 객체가 상수란거지 맵내부의 키 밸류 쌍은 변경가능 
	private static final Map<String, MyController> ctrlMap = new HashMap<String, MyController>();
	static {
		// 생성자 보다 먼저 실행된다.
		ctrlMap.put("", new HomeController());
		ctrlMap.put("/product", new ProductController());
		ctrlMap.put("/member", new MemberController());
	}
	
	public static void appendController(String key, MyController newCtrl) {
		ctrlMap.put(key, newCtrl);
	}
	
	public HandlerMapping() {
	}
	
	public HandlerMapping(Map<String, MyController> ctrlMap) {
		if(ctrlMap != null) {
			Iterator<String> iter = ctrlMap.keySet().iterator();
			this.ctrlMap.clear();
			while(iter.hasNext()) {
				String key = iter.next();
				this.ctrlMap.put(key, ctrlMap.get(key));
			}
			//위처럼 일일히 집어넣어도되고 아래처럼 한번에 넣어도된다
	         //this.ctrlMap.putAll(ctrlMap);
		}
	}

	public MyController getController(String key) {
		return ctrlMap.get(key);
	}
}
