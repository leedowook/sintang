<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<%@ page import="been.boardbean" %>
    <%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><h2>게시글 리스트 페이지</h2>
<table>


<td id="num">글번호
</td>
<td id="name">글쓴이
</td>
<td id="subject">제목
</td>
<td id="date">날짜
	
</td>
<td id="readcount">조회수
</td>
</tr>
<%ArrayList<boardbean> ar=new ArrayList<>();
	ar=(ArrayList<boardbean>)request.getAttribute("boardlist");
	for(int j=0;j<ar.size();j++){
%>
<tr>

<td id="num_c"><%=ar.get(j).getNum()%>
</td>
<td id="name_c"><%=ar.get(j).getName()%>
</td>
<td id="subject_c">
<%for(int i=ar.get(j).getRelev();i>0;i--) {%>
&nbsp;&nbsp;
<% }%>
<a href="./boardInfo.bo?num=<%=ar.get(j).getNum()%>"><%=ar.get(j).getSubject()%></a>
</td>
<td id="date_c"><%=ar.get(j).getDate()%>
</td>
<td id="readcount_c"><%=ar.get(j).getReadcount()%>
</td>
</tr>
<%  } %>
<tr>
<td rowspan="4">
<%
double size=(int)request.getAttribute("count");
int pagemax=(int)Math.ceil(size/20);
if((int)request.getAttribute("page")!=1){
	%>
	<a href="boardList.bo?page=<%=(int)request.getAttribute("page")-1%>">[이전]</a><%
}
for(int i=1;i<=pagemax;i++){ if(i!=(int)request.getAttribute("page")){%>
<a href="boardList.bo?page=<%=i%>">[<%=i %>]</a><%} }
if((int)request.getAttribute("page")!=pagemax){
	%>
	<a href="boardList.bo?page=<%=(int)request.getAttribute("page")+1%>">[다음]</a><%

}
%>

</td>
</tr>

</table>


</body>
</html>