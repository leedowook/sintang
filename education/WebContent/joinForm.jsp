<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원가입 페이지입니다.</h2>

<form action="joinProcess.jsp" method="post">
<table>
<tr>
	<td>아이디</td>
	<td><input type="text" name="id"></td>
</tr>
<tr>
	<td>비밀번호</td>
	<td><input type="password" name="password"></td>
</tr>
<tr>
	<td>이름</td>
	<td><input type="text" name="name"></td>
</tr>
<tr>
	<td>나이</td>
	<td><select name="age">
<%for(int i=5;i<=120;i++){ %>
	<option value="<%=i%>"><%=i%></option>
<% }%>
</select>
</td>
</tr>
<tr>
	<td rowspan="2">성별</td>
	<td><input type="radio" value="여성" name="gender" checked>여성</td></tr>
<tr>
	<td><input type="radio" value="남성" name="gender">남성</td>
</tr>
<tr>
	<td>이메일</td>
	<td><input type="email" name="email"></td>
</tr>
<tr>
	<td colspan="2"><input type="submit" value="전송"></td>
</tr>
</table>
</form>
</body>
</html>