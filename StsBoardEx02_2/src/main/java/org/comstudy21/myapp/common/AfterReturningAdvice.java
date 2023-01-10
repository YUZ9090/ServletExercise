package org.comstudy21.myapp.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterReturningAdvice {

	@AfterReturning(pointcut = "PointcutCommon.getPointcut()", returning = "returnObj")
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
