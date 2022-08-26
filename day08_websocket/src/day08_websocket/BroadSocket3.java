package day08_websocket;
import java.io.IOException;
import java.security.cert.Extension;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import javax.websocket.Extension.Parameter;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;



@ServerEndpoint(value="/broadSocket/{userID}")
public class BroadSocket3 {
	// �ӼӸ� �޼����� ���� �� session�� userID�� ã�� ���ؼ� userID�� session�� �����Ѵ�.
	static Map<String, Session> sessionMap = Collections.synchronizedMap(new HashMap<>());
	
	@OnOpen
	public void onOpen(Session session, @PathParam("userID") String userID) throws IOException {
		System.out.println("���� ���� "+ session.getId() +"��(��) ���� �Ǿ����ϴ�...");
		
		System.out.println(Arrays.toString(session.getClass().getFields()) );
		System.out.println("session id : " + session.getId());
		
		// ���� ��Ʈ���� ���� �� �ִ�.
		System.out.println("session querystr : " + session.getQueryString());
		// ���ڿ� ����Ʈ�� �Ķ���� ������ ���� ���� �� �ִ�.
		Map<String, List<String>> params = session.getRequestParameterMap();
		System.out.println(params.get("sender"));
		
		// PathParam ������̼��� �̿��� �Ķ���� ����
		System.out.println("path param sender : " + userID);
		// ������ ������� session�� Map�� �����Ѵ�.
		sessionMap.put(userID, session);
		
		for(String userid : sessionMap.keySet()) {
			(sessionMap.get(userid)).getBasicRemote().sendText(userID + "���� �����Ͽ����ϴ�!");
		}
	}
	
	@OnClose
	public void onClose(Session session, @PathParam("userID") String userID) {
		System.out.println("���� ����"+ session.getId() +"��(��) �������ϴ�...");
		sessionMap.remove(userID);
	}
	
	@OnMessage
	public void onMessage(String message, Session session, @PathParam("userID") String userID) throws IOException {
		System.out.println("���� �޼��� : " + message);
		// clientSessionSet���� Ŭ���̾�Ʈ ������ �����ͼ� sender�� ������ ��� ���ǿ� �޼����� ������.
		// ���������� �޼����� ������ �Ѵ�.
		synchronized(sessionMap) {
			//System.out.println("set size : " + sessionMap.size());
			System.out.println(message);
			StringTokenizer stk = new StringTokenizer(message, "||");
			String recipient = stk.nextToken().trim();
			String msg = stk.nextToken().trim();
			if("All".equals(recipient)) {
				for(String userid : sessionMap.keySet()) {
					if(!userid.equals(userID)) {
						//https://docs.oracle.com/javaee/7/api/javax/websocket/Session.html#getBasicRemote--
						// Ŭ���̾�Ʈ session���� RemoteEndpoint ��ü�� �޾ƿͼ� �޼��� �ؽ�Ʈ�� ������.
						// RemoteEndpoint�� ���ؼ� ���������� �޼����� ���� �� �ִ�.
						(sessionMap.get(userid)).getBasicRemote().sendText(userID + " : " + msg);
					}
				}
			} else {
				(sessionMap.get(recipient)).getBasicRemote().sendText(userID + " : " + msg);
			}
		}
	}
	
	@OnError 
	public void onError(Throwable th) {
		th.printStackTrace();
	}
}