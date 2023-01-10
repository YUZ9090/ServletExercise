package org.comstudy21.myapp.test01;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TvUser {
	
	public static void main(String[] args) {
		String resource = "classpath:applicationContext.xml";
		AbstractBeanFactory factory = new BeanFactory();
		//AbstractApplicationContext factory = 
		//		new GenericXmlApplicationContext(resource);
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
	
	
/*
	private static HashMap<String,TV> map=new HashMap();
	static {
		map.put("samsung",new SamsungTV());
		map.put("lg", new LgTV());
		map.put("panasonic", new PanasonicTV());
	}*/
	public static void test01(String[] args) {
		AbstractBeanFactory factory = new BeanFactory();
		//TV tv1 = map.get("lg");
		//TV tv2 = new SamsungTV();
		//TV tv = map.get(args[0]);
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
