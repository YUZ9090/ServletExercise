package org.comstudy21.myapp.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice2 {
	
	@Before("PointcutCommon.allPointcut()")
	public void printLog() {
		System.out.println("[공통 로그] printLog >>> ");
	}
	
	@After("PointcutCommon.getPointcut()")
	public void getPrintLog(JoinPoint jp) {
		System.out.println("[공통 로그] getPrintLog >>> " + jp.getSignature());
	}
}
/*
2.1 AOP 용어 정리

2.1.1 조인포인트 (Joinpoint)
포인트컷을 만들어서 aspect를 수행할 클래스등을 지칭한다.
포인트컷의 후보군이다.

2.1.2 포인트컷 (Pointcut)
포인트컷 : 실행중인 기능의 동작 패턴을 지정하는 것.
aspect를 수행할 지점을 지정하는 것.

2.1.3 어드바이스 (Advice)
aspect : 포인트컷에서 실행 될 기능.
포인트것에서 실행 할 메소드.
LogAdvice 클래스의 printLog()는 어드바이스이다.

2.1.4 위빙(Weaving)
핵심 관심에 횡단관심 메소드를 포인트 컷으로 지정되는 과정을 의미.
쉽게말해서 포인트컷과 어드바이저의 중간 콘트롤 역할
*/


/*
03. 어드바이스 동작 시점
Before - 비즈니스 메소드 실행 전 동작
After 
	- After Returning
	- After Throwing
	- Afetr
Around - 전 후 로직에 모두 동작 하는 로직 삽입
 */



/*
04. JoinPoint와 바인드 변수
4.1 JoinPoint 메소드
Signature getSignature() - 리턴타입, 이름, 매개변수
Object getTarget() - 비즈니스 메소드를 포함하는 비즈니스 객체 리턴
Object[] getArgs() - 메소드 호출시 넘겨준 인자 목록

String getName() - 클라이언트가 호출한 메소드 이름 리턴.
String getLongString() - 호출한 메소드의 리턴타입, 이름, 매개변술, 패키지 경로까지 포함 리턴.
String getShortString() - 메소드 시그니처를 축약한 문자열
*/






