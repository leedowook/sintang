<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<jsp:useBean id="beantest" class="education.beantest1" scope="page"/>
<!-- id="현제 페이지에서 사용할 class의 객쳬이름"  -->


<jsp:setProperty name="beantest" property="name" param="name"/>

<jsp:setProperty name="beantest" property="*" />

<!--setProperty는 setter역할 name:사용할 빈의 이름 property:사용할 필드이름  value="변경할 필드값" 

param="name"-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><!-- 자바빈: jsp에서 관련있는 데이터를 저장하는 클래스를 정의하여 사용하기위함 -->
<h2>beanTest1.jsp 파일입니다.</h2>
<%=beantest.getName()%>

</body>
</html>