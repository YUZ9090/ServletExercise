package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import login.MemberController;
import myshop.ProductController;



public class HandlerMapping {
	//���ϳ��� �����Ŷ� final �ش�(�����)
	//ctrlMap��� ��ü�� ��������� �ʳ����� Ű ��� ���� ���氡�� 
	private static final Map<String, MyController> ctrlMap = new HashMap<String, MyController>();
	static {
		// ������ ���� ���� ����ȴ�.
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
			//��ó�� ������ ����־�ǰ� �Ʒ�ó�� �ѹ��� �־�ȴ�
	         //this.ctrlMap.putAll(ctrlMap);
		}
	}

	public MyController getController(String key) {
		return ctrlMap.get(key);
	}
}
