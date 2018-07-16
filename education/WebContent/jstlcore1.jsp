<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>jstlcore1.jsp 파일입니다.</h2>
<!-- 
jstl(jsp standard tag library)
 -->
설정:<c:set var="test" value="Hello JSTL"/>
출력:<c:out value="${test}"/>
삭제:<c:remove var="test"/>
출력:<c:out value="${test}"/>
<hr>
<br>
<c:if test="${11<10}">
11는 10보다 작다
</c:if>
<c:if test="${5<10}">
5는 10보다 작다
</c:if>
<hr>
<c:if test="${6+3==9}">
6+3은 9이다
</c:if>
<hr>
<c:choose>
<c:when test="${5+10==50}">5+10은 50이다</c:when>
<c:otherwise> 5+10은 50이아니다
</c:otherwise>
</c:choose>
<br>
<c:forEach var="test" begin="1" end="10" step="2">
test값 출력: ${test}<br>
</c:forEach>
<c:forEach var="test" items="a,b,c,d,e,f,g">
test값 출력:${test}<br></c:forEach>
<% 
String[] job={"냥꾼","술사","법사","도적","기사","사적","전사","흑마"};

pageContext.setAttribute("job",job);
					//page변수이름,속성값

%>
<br>
<c:forEach var="test" items="${pageScope.job}"
varStatus="sts">
test값 출력: ${test}<br>
</c:forEach>
</body>
</html>