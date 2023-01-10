package org.comstudy21.myapp.test01;

public class SamsungTV implements TV {
	private String name = "삼성";
	private int volume = 5;
	
	public SamsungTV() {
		System.out.println(name+"의생성자");
	}
	
	public void initMethod() {
		
	}

	public void destoryMethod() {
		
	
	}
	@Override
	public void powerOn() {
		System.out.println(name+"TV 전원 켜기");
		
	}
	@Override
	public void powerOff() {
		System.out.println(name+"TV 전원 끄기");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("소리 높이기:"+volume);
		
	}

	@Override
	public void volumeDown() {
		System.out.println("소리 낮추기:"+volume);
		
	}



}
