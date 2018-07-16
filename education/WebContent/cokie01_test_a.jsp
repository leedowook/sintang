<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String name="";
	String value="";
	//쿠키가 생성되었는지 확인
	String cookie=request.getHeader("Cookie");
	if(cookie!=null){
		Cookie cookies[]=request.getCookies();
		for(int i=0;i<cookies.length;i++){
			if(cookies[i].getName().equals("name")){
				name=cookies[i].getName();
				value=cookies[i].getValue();
				
				
			}
			
		}
		
	}
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>cookiettest2.jsp</h2>
쿠키이름:<%=name %>
쿠키값:<%=value %>
<input type="button" oneclick="location.href=cokie01_test">
</body>
</html>