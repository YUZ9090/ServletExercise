package org.comstudy21.myapp.test01;

public class PanasonicTV implements TV {
	private String name = "�ĳ��Ҵ�";
	private int volume = 5;

	public PanasonicTV() {
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
