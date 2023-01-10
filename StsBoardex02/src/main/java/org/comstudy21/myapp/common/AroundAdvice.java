package org.comstudy21.myapp.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundLog(JoinPoint jp, ProceedingJoinPoint pjp, Object returnObj) throws Throwable {		
		System.out.println("[Before] ����Ͻ� �޼ҵ� ���� ���� ó�� �� ����...");
		String method = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		
		System.out.print("[���� ó��] " + method +"() ");
		if(args[0] != null) {
			System.out.print("�� args : " + args[0].toString());
		} else {
			System.out.println();
		}
		//Object returnObj = pjp.proceed();
		System.out.println("[After] ����Ͻ� �޼ҵ� ���� �Ŀ� ó�� �� ����...");
		System.out.println("[After] >>>>> " + returnObj);
		return returnObj;
	}
}
