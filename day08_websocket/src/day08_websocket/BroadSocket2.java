package day08_websocket;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/broadSocket2")
public class BroadSocket2 {
	// �ؽ����� ����ȭ�� ���� ���� �ʱ� ������ ����ȭ ���� �ϵ��� �����Ѵ�.
	static Set<Session> clientSessionSet = Collections.synchronizedSet(new HashSet<Session>());
	
	@OnOpen
	public void onOpen(Session session) {
		System.out.println("���� ���� "+ session.getId() +"��(��) ���� �Ǿ����ϴ�...");
		// Ŭ���̾�Ʈ�� ������ �����ϸ� Ŭ���̾�Ʈ ������ �¿� �߰� �� �д�.
		clientSessionSet.add(session);
	}
	
	@OnClose
	public void onClose(Session session) {
		System.out.println("���� ����"+ session.getId() +"��(��) �������ϴ�...");
		clientSessionSet.remove(session);
	}
	
	@OnMessage
	public void onMessage(String message, Session session) throws IOException {
		System.out.println("���� �޼��� : " + message);
		// clientSessionSet���� Ŭ���̾�Ʈ ������ �����ͼ� sender�� ������ ��� ���ǿ� �޼����� ������.
		// ���������� �޼����� ������ �Ѵ�.
		synchronized(clientSessionSet) {
			System.out.println("set size : " + clientSessionSet.size());
			for(Session clientSession : clientSessionSet) {
				if(!session.equals(clientSession)) {
					//https://docs.oracle.com/javaee/7/api/javax/websocket/Session.html#getBasicRemote--
					// Ŭ���̾�Ʈ session���� RemoteEndpoint ��ü�� �޾ƿͼ� �޼��� �ؽ�Ʈ�� ������.
					// RemoteEndpoint�� ���ؼ� ���������� �޼����� ���� �� �ִ�.
					clientSession.getBasicRemote().sendText(session.getId() + " : " +message);
				}
			}
		}
	}
	
	@OnError 
	public void onError(Throwable th) {
		th.printStackTrace();
	}
}