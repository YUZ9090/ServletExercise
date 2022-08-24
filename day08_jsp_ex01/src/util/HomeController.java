package util;

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
			items.put("로그인",ctxPath+"/login/home.do");
			items.put("상품 목록",ctxPath+"/shop/list.do");
			items.put("장바구니 목록",ctxPath+"/shop/cart.do");
		}
		
		//System.out.println(">>> HomeController ... ");
		
		req.setAttribute("items", items);
		
		return "home";
	}

}
