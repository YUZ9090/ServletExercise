package org.comstudy21.myapp.test01;

public class LgTV implements TV {
	private String name = "LG";
	private int volume = 5;

	public LgTV() {
		System.out.println(name+"의생성자");
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
