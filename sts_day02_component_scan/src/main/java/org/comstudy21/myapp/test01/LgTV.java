package org.comstudy21.myapp.test01;

public class LgTV implements TV {
	private String name = "LG";
	private int volume = 5;

	public LgTV() {
		System.out.println(name+"�ǻ�����");
	}
	
	@Override
	public void powerOn() {
		System.out.println(name+"TV ���� �ѱ�");
		
	}
	@Override
	public void powerOff() {
		System.out.println(name+"TV ���� ����");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("�Ҹ� ���̱�:"+volume);
		
	}

	@Override
	public void volumeDown() {
		System.out.println("�Ҹ� ���߱�:"+volume);
		
	}



}
