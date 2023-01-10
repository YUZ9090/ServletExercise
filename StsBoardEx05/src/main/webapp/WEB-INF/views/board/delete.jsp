<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/inc/top.jsp" %>

	<h1>삭제 확인</h1>
	<p>정말 삭제 하시겠습니까?</p>
	<table class="table table-striped">
		<tr>
			<th>번호</th>
			<td><c:out value="${board.seq }"></c:out></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><c:out value="${board.title }"></c:out></td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td><c:out value="${board.writer }"></c:out></td>
		</tr>
	</table>
	<form action="delete" method="post">
		<input type="hidden" name="seq" value="${board.seq }" />
		<input type="submit" value="삭제 완료" />
	</form>

<%@ include file="/inc/bottom.jsp" %>
