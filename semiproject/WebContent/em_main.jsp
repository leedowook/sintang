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


<%session.setAttribute("id", "asddasf") ;%>
<form action="main_sel.em" method="post" id="form1">
<span>
<input name="mainsel" type="hidden" value="recommend">

<input type="submit"  value="직접고르기">
<img onclick="document.getElementById('form1').submit()" style="cursor:pointer" src="추천버튼.jpg">

</span>
</form>
<form action="main_sel.em" method="post" id="form2">
<span>
<input name="mainsel" type="hidden" value="choice">

</span>
</form>
<form name="idboxform" method="post" action="box_list.em">
<span>
<%if(!session.getAttribute("id").equals(null)){ %>
<button onclick="documentgetElementById('idboxform')" style="cursor:pointer" >
견적함으로
</button>
<%} %>
</span>
</form>
<form>
<% 

if("admin".equals(session.getAttribute("id"))){%>
<a href="em_adminmode.em">견적관리자모드</a>
<%} %>


</form>




</body>
</html>