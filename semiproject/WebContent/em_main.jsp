<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>견적에 대한 메인</h2>



<form action="main_sel.em" method="post" id="form1">
<span>
<input name="mainsel" type="hidden" value="recommend">
<img onclick="document.getElementById('form1').submit()" style="cursor:pointer" src="추천버튼.jpg">

</span>
</form>
<form action="main_sel.em" method="post" id="form2">
<span>
<input name="mainsel" type="hidden" value="choice">
<input type="submit"  value="선택 이미지칸 ">
</span>
</form>
<form>
<%  session.setAttribute("id","admin");//임시설정 

if("admin".equals(session.getAttribute("id"))){%>
<a href="em_adminmode.em">견적관리자모드에양</a>
<%} %>


</form>




</body>
</html>