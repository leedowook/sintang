<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="sel" method="post" >
탄
<select id="bullet" name="bul">
<option value="5mm">5mm</option>
<option value="7mm">7mm</option>
<option value="4.5mm">4.5mm</option>

</select>
갯수
<select id="bnum" multiple="multiple" name="bnums">
<%for(int i=0;i<=100;i++){ %>
<option value="<%=i %>"><%=i%></option>
<%} %>
</select>
<input type="submit" value="전송"/>
</form>

</body>
</html>