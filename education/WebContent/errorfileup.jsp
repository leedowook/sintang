<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
#mai{
border:1px solid;

text-align:center;
}
table{
text-align:center;}


td{
text-align:left;
}
</style>
<body>


<form action="fileupload01_a.jsp" id="mai" method="post"
enctype="miltipart/form-data"><!-- enctype:파일이 제대로 넘어가기 위해서 추가해줌 -->
<table>
<tr><td id="mt">올리사람:</td><td><input type="text" name="name"></td>
</tr>
<tr><td id="mt">제목:</td><td><input type="text" name="subject"></td>
</tr>
<tr><td id="mt">파일명1</td><td><input type="file" name="fileName1" id="fileName1"><br></td>
</tr>
<tr><td id="mt">파일명2</td><td><input type="file" name="fileName2" id="fileName2"><br></td>
</tr>
</table>

<input type="submit" value="전송">
</form>


</body>
</html>