<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
 <script type="text/javascript" src="resources/js/Addattribute.js"></script>
 <link rel="stylesheet" type="text/css"  href="resources/css/style.css">	



</head>
<body>

<div class="AddConsertMenu" id="AddConsertMenu" >

<p><button onclick="AddHall_1()">홀 추가</button></p>

<p><button onclick="AddLine()">라인 추가</button></p>
<p><button onclick="Entry()">입구 추가</button></p>
<p><button onclick="exit()">출구 추가</button></p>
<p><button onclick="Save()">저장</button></p>
<p><button onclick="Back()">되돌아가기</button></p>
</div>

<form id="ConcertInfoForm"action="AddConcert" method="post">
<div class="AddJob" id="AddJob" id="menu">
<p>dddddddd</p>
</div>



</form>
</body>
</html>