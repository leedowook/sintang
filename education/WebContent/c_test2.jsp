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
<c:set var="value" value="${param.color}"/>

<c:if test="${value=='red'}">
	<span style="color:red">빨강</span>
</c:if>

<c:if test="${value=='green'}">
<span style="color:green">초록</span>
</c:if>

<c:if test="${value=='blue'}">
<span style="color:blue">파랑</span>
</c:if>
</body>
</html>