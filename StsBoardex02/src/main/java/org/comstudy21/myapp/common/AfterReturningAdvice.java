package org.comstudy21.myapp.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AfterReturningAdvice {
	/*
	 * public void afterReturningLog() {
	 * System.out.println("[���� ó��] ����Ͻ� ���� ���� return �� ����"); }
	 */
	public Object afterReturningLog(JoinPoint jp, Object returnObj) throws Throwable {		
		System.out.println("[Before] ����Ͻ� �޼ҵ� ���� ���� ó�� �� ����...");
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.print("[���� ó��] " + method +"() ");
		if(args[0] != null) {
			System.out.print("�� args : " + args[0].toString());
		} else {
			System.out.println();
		}
		System.out.println("[After] ����Ͻ� �޼ҵ� ���� �Ŀ� ó�� �� ����...");
		System.out.println("[After] >>>>> " + returnObj);
		return returnObj;
	}
}
