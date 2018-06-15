<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="intruduces"method="post">
성별: <input type="radio" name="gender" value="남자" checked/>남자 
<input type="radio" name="gender" value="여자" />여자 
<br>
<label for="check_mail">메일정보 수신여부</label>
<input type="radio" name="come" value="yes" checked/>수신 
<input type="radio" name="come" value="no" />거부
<br>
<label id="content">간단한 인삿가입인사</label>>
<textarea id="content "name="hi" rows="3" cols="5"></textarea>
<input type="submit"value="전송"/>

</form>

</body>
</html>