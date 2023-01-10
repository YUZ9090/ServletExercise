package org.comstudy21.myapp.test01;

import java.util.HashMap;


//Factory 디자인 호
public class BeanFactory implements AbstractBeanFactory {
	private static HashMap<String,TV> map=new HashMap();
	static {
		map.put("samsung",new SamsungTV());
		map.put("lg", new LgTV());
		map.put("panasonic", new PanasonicTV());
	}
	
	@Override
	public Object getBean(String name) {
		// TODO Auto-generated method stub
		return map.get(name);
	}
}
