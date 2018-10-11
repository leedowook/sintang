<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
 <script type="text/javascript" src="resources/js/Addattribute.js">
  </script>
 <link rel="stylesheet" type="text/css"  href="resources/css/style.css">	



</head>
<body>
<%session.setAttribute("ID","Shit"); %>
<div class="AddConsertMenu" id="AddConsertMenu" >
<p><button onclick="Create()">새로만들기</button></p>
<form id="LoadConsertForm" method="post">
<p>
<select name="ConsertList" id="ConsertList">
</select>
</p>
</form>
<p><button onclick="Load()">불러오기</button></p>
<p><button onclick="AddHall_1()">홀 추가</button></p>

<p><button onclick="SaveMotion()">저장</button></p>
<p><button onclick="Back()">되돌아가기</button></p>
<p><button onclick="DeleteConsert()">삭제</button></p>
<p><button onclick="Check()">중간점검</button></p>
<p><button onclick="PreviewMotion()">미리보기</button></p>

</div>
<form id="ConsertInfoForm" name="ConsertInfoForm" action="ViewConsertSeat" method="POST">
<div class="AddJob" id="AddJob" id="menu">
<div id="Consertnamediv" style="text-align: center;"></div>
<div id='exit' style='position:absolute; left:200px; top:400px; cursor:pointer; cursor:hand' onmousedown='startDrag(event,this)'>출구</div>
<div id='entry'style='position:absolute; left:400px; top:400px; cursor:pointer; cursor:hand' onmousedown='startDrag(event,this)'>입구</div>
</div>
</form>
</body>
</html>