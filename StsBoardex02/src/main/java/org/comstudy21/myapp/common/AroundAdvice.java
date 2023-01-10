package org.comstudy21.myapp.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundLog(JoinPoint jp, ProceedingJoinPoint pjp, Object returnObj) throws Throwable {		
		System.out.println("[Before] 비즈니스 메소드 수행 전에 처리 할 내용...");
		String method = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		
		System.out.print("[사전 처리] " + method +"() ");
		if(args[0] != null) {
			System.out.print("의 args : " + args[0].toString());
		} else {
			System.out.println();
		}
		//Object returnObj = pjp.proceed();
		System.out.println("[After] 비즈니스 메소드 수행 후에 처리 할 내용...");
		System.out.println("[After] >>>>> " + returnObj);
		return returnObj;
	}
}
