<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>thumbnailform01_a.jsp입니다.</h2>
	<section>
		<form action="thumbnailform01_b.jsp" method="post" enctype="multipart/form-data">
			이미지 업로드:<input type="file" name="filename">
			<input type="submit" value="전송">
	
		</form>
	
	</section>
</body>
</html>