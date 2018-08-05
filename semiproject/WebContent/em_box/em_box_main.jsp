<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="been.*" %>
    <%@ taglib prefix="c" 

uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	function.sumit_sel(){
		document.getElementById('em_sel').submit();
	}

</script>

<body>
<h2>견적함</h2>
	견적함 보기 
	
<form id="em_sel" name="boxnamesel">	
	<select name="em_number_sel" id="em_num_sel" onchange="submit_sel()">
		<c:forEach var="em_box" items="${list}"> 
		<option value="${em_box.num}" selected>${em_box.name}</option>	
		</c:forEach>
	</select>
</form>

<form id="em_info" name="em_boxinfo">
<span>
<%if(request.getAttribute("boxinfo")!=null){ 

em_box_userinfo box=((em_box_userinfo)request.getAttribute("boxinfo"));%> 

	<table>
	<tr>
	
	<td></td>
	<%if(box.getCpu().getCount()==1) %>
	<td></td><td></td>
	</tr>
	
	
	</table>

전체가격:<%=box.getBox().getPrice()%>
<%} %>
 </span>
</form>








</body>
</html>