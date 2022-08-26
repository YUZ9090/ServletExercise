package day08_websocket;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/broadSocket1")
public class BroadSocket {

   //4���� �̺�Ʈ��鷯
   //�޼����̸��� �ߺ������������� ����������
	   @OnOpen
	   public String onOpen(Session session) throws IOException {
	      System.out.println("onOpen...");

	      session.getBasicRemote().sendText("socket open");

	      return "Server : Hello Client";
	   }
   
   @OnClose
   public void onClose() {
      System.out.println("onClose ...");
   }
   
   @OnMessage
   public void onMessage(String message, Session session) {
      System.out.println("onMessage ...");
   }
   
   @OnError
   public void onError(Throwable th) {
      System.out.println("onError ...");
   }
}