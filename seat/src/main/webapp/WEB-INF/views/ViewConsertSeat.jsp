<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
 <script type="text/javascript" src="resources/js/ViewConsert.js">
 </script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
ViewConsertSeat


콘서트장 이름 ${ConsertSeat.c_name}
<form>
<c:forEach items="${ConsertSeat.hallinfo}" var="Hallinfo">
<div class="${Hallinfo.c_hall_name }" name="${Hallinfo.c_hall_name}Hall" style="position:absolute; left:${Hallinfo.c_hall_loc_left-160}px; top:${Hallinfo.c_hall_loc_top}px;">
<p style='text-align:center;'>${Hallinfo.c_hall_name}</p>
<div>
	<c:forEach items="${ConsertSeat.lineList}" var="Linelist">
		<c:if test="${Hallinfo.c_hall_name eq Linelist.c_hall_name}">
			<c:forEach var="i" begin="00" end="${Linelist.c_row_count}" step="1">
			<c:if test="${i<10}">
			<input type="checkbox" data-toggle="tooltip" style="vertical-align:0px;padding:-3px;margin:-2px" name="seat" value="${Hallinfo.c_hall_num}${Linelist.c_col_num}0${i}" title="${Hallinfo.c_hall_name}-${Linelist.c_col_name}0${i}"></c:if><c:if test="${i>=10}">
			<input type="checkbox" data-toggle="tooltip" style="vertical-align:0px;padding:-3px;margin:-2px" name="seat" value="${Hallinfo.c_hall_num}${Linelist.c_col_num}${i}"  title="${Hallinfo.c_hall_name}-${Linelist.c_col_name}${i}"></c:if>
			</c:forEach><br/>
		</c:if>
	</c:forEach>
</div>
</div>
</c:forEach>
</form>
<script>
$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();   
});
</script>


</body>
</html>