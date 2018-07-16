<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- property="*"의 의미: 뷰페이제에서 입력한 각 내용의 name속성과
 param값이 일치하면 알아서 저장 -->
<form action="propery1.jsp" >
<h2>property="*"테스트</h2><br>
<hr>
이름:<input type="text" name="name"><br>
주소:<input type="text" name="add"><br>
이메일주소:<input type="email" name="email"><br>
생년월일:<input type="text" name="birth"><br>
<input type="submit">


</form>

</body>
</html>