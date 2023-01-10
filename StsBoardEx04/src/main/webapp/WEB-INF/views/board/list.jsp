<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/inc/top.jsp" %>


<h1>게시글 목록</h1>
<form action="list" method="get">
검색: 
<select name="searchCondition">
	<option value="title">제목</option>
	<option value="writer">글쓴이</option>
	<option value="content">내용</option>
</select>
<input type="text" name="searchKeyword" /> <input type="submit" value="검색" />
<a href="list">취소</a>
</form>
<table class="table table-striped">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>조회수</th>
	</tr>
	<c:forEach var="row" items="${list }">
		<tr>
			<td><c:out value="${row.seq }"></c:out></td>
			<td><a href="detail?seq=${row.seq }"><c:out value="${row.title }"></c:out></a></td>
			<td><c:out value="${row.writer }"></c:out></td>
			<td><c:out value="${row.cnt }"></c:out></td>
		</tr>
	</c:forEach>
</table>
<a href="insert">새 글 등록</a>

<%@ include file="/inc/bottom.jsp" %>