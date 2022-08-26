<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web_socket_client.jsp</title>
</head>
<body>
<p>����� ���̵� �Է� �ϰ� �α��� �ϸ� ü���� ���� �˴ϴ�!</p>
<form>
	����� : <input id="sender" type="text" value="user1"> 
	<input id="loginBtn" value="Login" type="button">
	<input id="closeBtn" value="Disconnect" type="button"><br>
	�޴��� : <input id="recipient" type="text" value="All"><br>
	�޼��� : <input id="txtMsg" type="text" value="hello">
	<input id="sendBtn" value="Send" type="button">
</form>
<hr>
<textarea id="msgTxtArea" rows="10" cols="50"></textarea>

<script src="http://code.jquery.com/jquery.js"></script>
<script>
// ���� ��ü�� �����ϸ� URL�� ���� ������ ��� ���� �ǰ� �������� onOpen �޼ҵ尡 ���� �ȴ�.
var socket = null;
function connection() {
	// socket Ŭ���̾�Ʈ ������ �Լ��� (onopen, onclose, onmessage, onerror)
	socket.onopen = function(event) {
		$("#msgTxtArea").append(">>> open ...\n");
		$("#msgTxtArea").append($("#sender").val()+"���� �����ϼ̽��ϴ�!\n");
	}
	socket.onclose = function(event) {
		$("#msgTxtArea").append(">>> close ...\n");
	}
	socket.onmessage = function(event) {
		$("#msgTxtArea").append(">>> message ...\n");
		//console.log(event.data)
		$("#msgTxtArea").append("<<< " + event.data + "\n");
	}
	socket.onerror = function(event) {
		$("#msgTxtArea").append(">>> error ...\n");
	}
}

$("#loginBtn").click(function(event) {
	socket = new WebSocket("ws://localhost:8888/day08_websocket/broadSocket/"+$("#sender").val());
	//socket = new WebSocket("ws://localhost:8090/900WebSocketExample/broadSocket?user="+$("#sender").val());
	connection();
});

$("#sendBtn").click(function(event) {
	event.preventDefault();
	$("#msgTxtArea").append("�� : " + $("#txtMsg").val() +"\n");
	socket.send($("#recipient").val() + "|\|" + $("#txtMsg").val());
});
$("#closeBtn").click(function(event) {
	socket.close();
});
</script>

</body>
</html>