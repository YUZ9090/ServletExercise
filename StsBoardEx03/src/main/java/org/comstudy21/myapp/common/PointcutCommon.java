package org.comstudy21.myapp.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	@Pointcut("execution(* org.comstudy21.myapp..*Impl.*(..))")
	public void allPointcut() {}
	
	@Pointcut("execution(* org.comstudy21.myapp..*Impl.get*(..))")
	public void getPointcut() {}
}
