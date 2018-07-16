<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="ppp" class="education.property" scope="page"/>

<jsp:setProperty property="*" name="ppp" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>자바빈 속성 값 출력</h1>
이름:<%=ppp.getName() %><br>
주소:<%=ppp.getAdd() %><br>
이메일:<%=ppp.getEmail() %><br>
생년월일:<%=ppp.getBirth() %>



<!-- 액션태그를 이용한 입력받은 값 출력하기 -->
<jsp:getProperty property="name" name="ppp"/>
<!-- 이렇게쳐도 위에 get안하고도 나옴 -->
</body>
</html>