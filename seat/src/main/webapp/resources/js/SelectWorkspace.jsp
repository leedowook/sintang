<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자모드</title>
<script>
	function InputConcert(){
		document.getElementById("InputConserthallname").submit();
	}
	
</script>

</head>
<body>
<!-- 공연장 이름을 고르고 이전 작업공간에 변경할게 있으면 불러오기 버튼을 누르면 해당 아이디가 저장된 정보리스트를 가져옴
그외엔 공연장 이름을 치고 새로만들기를 누르면 새로 만들어짐  
공연장 이름입력시 session 에 저장 
-->
<form action="InputConserthallname" method="post">
<input type="text" placeholder="공연장 이름을 입력하세요" name="concert">
</form>



<button onclick="InputConcert()">새로만들기</button>
<a href="#">불러오기 목록</a>
</body>
</html>