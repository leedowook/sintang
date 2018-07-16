<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="been.boardbean" %>
<%@ taglib prefix="c" 

uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body><h2>infopage.jsp</h2>
<c:set var="board" value="${list_1}"/>
<table>
<tr>
	<td><label for="num">글 번호</label><td>
	<td><span id="size_1" id="num">${board.num}</span></td>
</tr>
<tr>
	<td><label for="name">글쓴이</label></td>
	<td><span id="size_1" id="name">${board.name}</span></td>
</tr>

<tr>
	<td><label for="subject">글제목</label></td>
	<td><span id="size_1" id="subject">${board.subject}</span></td>
</tr>
<tr>
	<td><label for="content">글내용</label></td>
	<td><span id="size_1" id="content">${board.content}</span></td>
</tr>

<tr>
	<td><label for="file">첨부파일</label></td>
	<td><span id="size_1" id="subject">
	<a href="boardDownload.bo?file=${board.file}">${board.file}</a></span></td>
</tr>
</table>
<table>
	<tr>
		<td><a href="boardRecoment.bo?num=${board.num}">답글</a></td>
		<td><a href="boardModified.bo?num=${board.num}&step=a">수정</a></td>
		<td><a  href="boardDelete.bo?num=${board.num}">삭제</a></td>
		<td><a href="boardList.bo?page=1">목록</a></td>
	</tr>

</table>




</body>
</html>