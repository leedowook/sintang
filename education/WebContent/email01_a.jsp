<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>자바 메일 보내기</h2>
<form action="mailsend" method="post">
	<table>
		<tr>
			<td>
				보내는 사람메일:
			</td>
			<td width="80">
				<input type="text" name="sende">
			</td>
		</tr>
				<tr>
			<td>
				받는 사람이메일:
			</td>
			<td>
				<input type="text" name="rece">
			</td>
		</tr>
				<tr>
			<td>
				제목:
			</td>
			<td>
				<input type="text" name="title">
			</td>
		</tr>
				<tr>
			<td>
				내용:
			</td>
			<td>
				<textarea name="subject" cols="80" rows="20">
				</textarea>
			</td>
		</tr>
		<tr>
		<td colspan="2" align="center">
			<input type="submit" value="전송">
		</td>
		</tr>
	</table>


</form>

</center>

</body>
</html>