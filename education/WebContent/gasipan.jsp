<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#rowstyle{
font-weight:bold;/*굵게*/
background-color:#81f7f3;/*배경색지정*/
text-align:center;/*중앙정렬*/
}
h2{
	text-align:center;
}
table{margin:auto;}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>게시판 글쓰기</h1>
<form action="gasipanview" method="post">
<table>
<tr>
	<td id="rowstyle">작성자</td>
	<td><input type="text" name="name"></td>
</tr>
<tr>
	<td id="rowstyle">비밀번호</td>
	<td><input type="password" name="password">게시글 수정 삭제시 필요합니다.</td>
</tr>
<tr>
	<td id="rowstyle">이메일</td><!-- size=입력 칸의 수 -->
	<td><input type="email" name="email" size="50"></td>
</tr>
<tr>
	<td id="rowstyle">글제목</td>
	<td><input type="text" size="20" name="title"></td>
</tr>
<tr>
	<td id="rowstyle">글내용</td>
	<td><textarea cols="80" rows="20" name="sub"></textarea></td>

</tr>
</table>
<section id="command">
<input type="submit" value="등록">
<input type="reset" value="다시작성">
</section>
</form>
</center>
</body>
</html>