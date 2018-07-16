<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<%@ page import="been.boardbean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><h2>수정화면</h2>
<center>

<form action="boardModified.bo?step=b" method="post" >
<input type="hidden" name="num" value="${list_1.num}">
<table>

<tr>
	<td><label for="name">글쓴이</label></td>
	<td><input type="text" name="name" id="name" size="20" required="required" value="${list_1.name}"></td>
</tr>

<tr>
	<td><label for="password">비밀번호</label></td>
	<td><input type="password" name="password" id="password" size="15"></td>
</tr>

<tr>
	<td><label for="subject">제목</label></td>
	<td><input type="text" name="subject" id="subject" size="50" value="${list_1.subject}"></td>
</tr>

<tr>
	<td><label for="content">글내용</label></td>
	<td><textarea name="content" id="content" cols="80" rows="20" size="2000" >${list_1.content}</textarea></td>
</tr>
</table>
<table>
<tr>
	<td><input type="button" onclick="javascript:history.back();" value="되돌아가기"></td>	
	
</tr>
<tr>
<td rowspan="2"><input type="submit" value="수정"></td>
</tr>

</table>



</form>
	
</center>

</body>
</html>