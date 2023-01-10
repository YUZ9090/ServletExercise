package org.comstudy21.myapp.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.print("[���� ó��] " + method +"() ");
		if(args[0] != null) {
			System.out.print("�� args : " + args[0].toString());
		} else {
			System.out.println();
		}
	}
}
