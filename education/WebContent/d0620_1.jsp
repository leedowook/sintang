<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
액셔 태그 의미: jsp페이지에서 자바코등을 사용하지 않고도 다른페이지의 서클릿이나 자바빈의 객체에 접근
			접근 ㅏㄹ수 있도록 태그를 이용해 구현한 기능
종류:forward,include,useBean(자바빈으 나중을 뒤에서)애션태그들
 -->
 <h2>forwadtest.jsp파일입니다.</h2>
 forwardtest1.jsp파일로 입력한 정보를 전송
 <form action="d0620_1_b.jsp" method=post>
 <input type="hidden" name="forwardpage" value="d0620_1_a.jsp">
 이름:<input type="text" name="name"><br>
 나이:<input type="text" name="ag"> <br>
 주소:<input type="text" name="ad"><br>
 <input type="submit" value="전송">
 </form>
 
</body>
</html>