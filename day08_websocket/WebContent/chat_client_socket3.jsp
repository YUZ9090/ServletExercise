<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web_socket_client.jsp</title>
</head>
<body>
<p>사용자 아이디를 입력 하고 로그인 하면 체팅이 시작 됩니다!</p>
<form>
	사용자 : <input id="sender" type="text" value="user1"> 
	<input id="loginBtn" value="Login" type="button">
	<input id="closeBtn" value="Disconnect" type="button"><br>
	받는이 : <input id="recipient" type="text" value="All"><br>
	메세지 : <input id="txtMsg" type="text" value="hello">
	<input id="sendBtn" value="Send" type="button">
</form>
<hr>
<textarea id="msgTxtArea" rows="10" cols="50"></textarea>

<script src="http://code.jquery.com/jquery.js"></script>
<script>
// 소켓 객체를 생성하면 URL의 소켓 서버와 즉시 연결 되고 서버쪽의 onOpen 메소드가 실행 된다.
var socket = null;
function connection() {
	// socket 클라이언트 리스너 함수들 (onopen, onclose, onmessage, onerror)
	socket.onopen = function(event) {
		$("#msgTxtArea").append(">>> open ...\n");
		$("#msgTxtArea").append($("#sender").val()+"님이 입장하셨습니다!\n");
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
	$("#msgTxtArea").append("나 : " + $("#txtMsg").val() +"\n");
	socket.send($("#recipient").val() + "|\|" + $("#txtMsg").val());
});
$("#closeBtn").click(function(event) {
	socket.close();
});
</script>

</body>
</html>