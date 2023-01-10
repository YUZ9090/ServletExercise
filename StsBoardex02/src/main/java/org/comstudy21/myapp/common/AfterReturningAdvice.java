package org.comstudy21.myapp.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AfterReturningAdvice {
	/*
	 * public void afterReturningLog() {
	 * System.out.println("[사후 처리] 비즈니스 로직 수행 return 후 동작"); }
	 */
	public Object afterReturningLog(JoinPoint jp, Object returnObj) throws Throwable {		
		System.out.println("[Before] 비즈니스 메소드 수행 전에 처리 할 내용...");
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.print("[사전 처리] " + method +"() ");
		if(args[0] != null) {
			System.out.print("의 args : " + args[0].toString());
		} else {
			System.out.println();
		}
		System.out.println("[After] 비즈니스 메소드 수행 후에 처리 할 내용...");
		System.out.println("[After] >>>>> " + returnObj);
		return returnObj;
	}
}
