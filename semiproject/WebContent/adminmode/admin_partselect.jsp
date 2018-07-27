<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 파츠 선택하는곳 
 
	
	
	
	<form action="/semiproject/inputdata/ram_inputdata.jsp">
	<input type="hidden" name="part" value="ram">
	<input type="submit" value="RAM">
	옵션개수
	<select name="optionnum">
	<% for(int i=1;i<7;i++){ %>
		<option value="<%=i%>"><%=i%></option>
	<% }%>
	</select>
	</form>
	<form action="/semiproject/inputdata/hdd_inputdata.jsp">
	<input type="hidden" name="part" value="hdd">
	<input type="submit" value="HDD">
	옵션개수
	<select name="optionnum">
	<% for(int i=1;i<7;i++){ %>
		<option value="<%=i%>"><%=i%></option>
	<% }%>
	</select>
	</form>
	<form action="/semiproject/inputdata/ssd_inputdata.jsp">
	<input type="hidden" name="part" value="ssd">
	<input type="submit" value="SSD">
	옵션개수
	<select name="optionnum">
	<% for(int i=1;i<7;i++){ %>
		<option value="<%=i%>"><%=i%></option>
	<% }%>
	</select>
	</form>
	<form action="/semiproject/inputdata/vga_inputdata.jsp">
	<input type="hidden" name="part" value="vga">
	<input type="submit" value="VGA">
	옵션개수
	<select name="optionnum">
	<% for(int i=1;i<7;i++){ %>
		<option value="<%=i%>"><%=i%></option>
	<% }%>
	</select>
	</form>
	<form action="/semiproject/inputdata/power_inputdata.jsp">
	<input type="hidden" name="part" value="power">
	<input type="submit" value="POWER">

	</form>
	<form action="/semiproject/inputdata/cpu_inputdata.jsp">
	<input type="hidden" name="part" value="cpu">
	<input type="submit" value="CPU">
	
	</form>
	<form action="/semiproject/inputdata/mainboard_inputdata.jsp">
	<input type="hidden" name="part" value="mainboard">
	<input type="submit" value="MAINBOARD">
	
	</form>
	
	
		


 

</body>
</html> 