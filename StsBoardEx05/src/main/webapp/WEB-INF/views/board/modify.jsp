<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/inc/top.jsp" %>
    
    <h1>내용 수정</h1>    
    <hr />
<form action="modify" method="post">
	<input name="seq" type="hidden" value="${board.seq }" />
	<table class="table table-striped">
		<tr>
			<th>제목</th>
			<td><input name="title" value="${board.title }" /></td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td><input name="writer" value="${board.writer }" /></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea name="content" rows="8" cols="50"><c:out value="${board.content }"></c:out></textarea></td>
		</tr>
	</table>
	<input type="submit" value="수정 완료">
</form> 
<%@ include file="/inc/bottom.jsp" %>
