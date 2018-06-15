<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
1부터 100까지의 합은 
<%!//메소드 선언시 %!
public int sum(){
int sum=0;
for(int i=1;i<=100;i++){
	sum+=i;

}return sum;}

%><%=//출력시 %=
sum()%>입니다
1부터 100까지의 합에 3을 곱하면 
<%//선언시 %
int case1=sum()*3;

%><%=case1 %>이됩니다.
1부터 100까지의 합에 1000으로 나누면 
<%
float case2=(float)sum()/1000;

%><%=case2 %>이됩니다.
</body>
</html>