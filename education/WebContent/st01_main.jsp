<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="prodo" class="education.st01_pro" scope="page"/>
<%String pagefile=request.getParameter("page");
if(pagefile==null)(pagefile=newfile) %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>

#since{
text-align: right;}
</style>

<body style="border-width:6px; border-style:double; ">
<script type="text/javascript">
	function loginpop(){
		window.open("login.jsp","login","");
		
	}
</script>
<center>
<span >
	<span>
		<span>
			<a href="st01_login.jsp">Login join</a>
			<!-- <jsp:includ page="st01_login.jsp"로그인 조인 페이지 -->
		</span>
		<span>
			<%=prodo.getUser() %>님 반갑습니다.
		</span><br>
		
	</span>
	<table width="80%">
		<tr>
		<!-- <jsp:include page="" 인기상품 신상품 고를수 있는거 -->
			<td>
				<a href="WebContent/st01_hotp.jsp">신상품</a>
			</td>
			<td colspan="2" width="50%"><%=prodo.getMenu()%>상품목록입니다.<td>
			</tr>
			<tr>
			<td>
			<a href="st01_newp">인기상품</a>
			</td>
			</tr>
			<!--<jsp:includ page=""-->
		<tr ><td rowspan="2" id="since">Since 2018<td></tr>
	</table>
</span>
</center>


</body>
</html>