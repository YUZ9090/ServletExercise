package org.comstudy21.myapp.common;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;


public class LogAdvice {
	public void printLog() {
		System.out.println("[���� �α�] �񽺴Ͻ� ���� ���� �� ����");
	}
	
	public void printLog(JoinPoint jp) {
		System.out.println("[���� �α�] JoinPoint >>> " + jp.getSignature());
	}
}
/*
2.1 AOP ��� ����

2.1.1 ��������Ʈ (Joinpoint)
����Ʈ���� ���� aspect�� ������ Ŭ�������� ��Ī�Ѵ�.
����Ʈ���� �ĺ����̴�.

2.1.2 ����Ʈ�� (Pointcut)
����Ʈ�� : �������� ����� ���� ������ �����ϴ� ��.
aspect�� ������ ������ �����ϴ� ��.

2.1.3 �����̽� (Advice)
aspect : ����Ʈ�ƿ��� ���� �� ���.
����Ʈ�Ϳ��� ���� �� �޼ҵ�.
LogAdvice Ŭ������ printLog()�� �����̽��̴�.

2.1.4 ����(Weaving)
�ٽ� ���ɿ� Ⱦ�ܰ��� �޼ҵ带 ����Ʈ ������ �����Ǵ� ������ �ǹ�.
���Ը��ؼ� ����Ʈ�ư� ���������� �߰� ��Ʈ�� ����
*/


/*
03. �����̽� ���� ����
Before - ����Ͻ� �޼ҵ� ���� �� ����
After 
	- After Returning
	- After Throwing
	- Afetr
Around - �� �� ������ ��� ���� �ϴ� ���� ����
 */



/*
04. JoinPoint�� ���ε� ����
4.1 JoinPoint �޼ҵ�
Signature getSignature() - ����Ÿ��, �̸�, �Ű�����
Object getTarget() - ����Ͻ� �޼ҵ带 �����ϴ� ����Ͻ� ��ü ����
Object[] getArgs() - �޼ҵ� ȣ��� �Ѱ��� ���� ���

String getName() - Ŭ���̾�Ʈ�� ȣ���� �޼ҵ� �̸� ����.
String getLongString() - ȣ���� �޼ҵ��� ����Ÿ��, �̸�, �Ű�����, ��Ű�� ��α��� ���� ����.
String getShortString() - �޼ҵ� �ñ״�ó�� ����� ���ڿ�
*/





