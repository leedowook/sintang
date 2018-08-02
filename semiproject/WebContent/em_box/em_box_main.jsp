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
<%if(request.getAttribute("boxinfo")!=null){ %>
<form id="em_info" name="em_boxinfo">



<%} %>



</form>


</body>
</html>