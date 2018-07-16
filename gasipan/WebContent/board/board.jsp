<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>boardWrite.jsp파일입니다.</h2>
<center>
<form action="boardWritePro.bo" method="post" enctype="multipart/form-data">
<table>

<tr>
	<td><label for="name">글쓴이</label></td>
	<td><input type="text" name="name" id="name" size="20" required="required"></td>
</tr>

<tr>
	<td><label for="password">비밀번호</label></td>
	<td><input type="password" name="password" id="password" size="15"></td>
</tr>

<tr>
	<td><label for="subject">제목</label></td>
	<td><input type="text" name="subject" id="subject" size="50"></td>
</tr>

<tr>
	<td><label for="content">글내용</label></td>
	<td><textarea name="content" id="content" cols="80" rows="20" size="2000" ></textarea></td>
</tr>

<tr>
	<td><label for="file">파일업로드</label></td>
	<td><input type = "file" name = "file" id="file" size="50"></td>
</tr>
</table>
<table>
<tr>
	<td><input type="button" onclick="javascript:history.back();" value="되돌아가기"></td>	
	<td><input type="reset" value="다시쓰기"></td>
</tr>
<tr>
<td rowspan="2"><input type="submit" value="등록"></td>
</tr>

</table>



</form>
	
</center>

</body>
</html>