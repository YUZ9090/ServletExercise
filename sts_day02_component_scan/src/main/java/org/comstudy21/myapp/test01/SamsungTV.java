package org.comstudy21.myapp.test01;

public class SamsungTV implements TV {
	private String name = "�Ｚ";
	private int volume = 5;
	
	public SamsungTV() {
		System.out.println(name+"�ǻ�����");
	}
	
	public void initMethod() {
		
	}

	public void destoryMethod() {
		
	
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
