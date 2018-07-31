<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="./cho_sel.em" method="post">
<span>
추천
<!--디자인 -->

<!-- 사용하는 사무용
크라이엔진류 
<input name="samuyong" type="checkbox" value="designed"><br/>
포토샾류<input name="samuyong" type="checkbox" value="photoshop"><br/> -->

사용하는 pc게임용 </br>
전설의 전당:
<select id="game"  name="g1">
<option value="no" selected  hidden>안함</option>
<option value="high" >최상</option>
<option value="medium">권장</option>
<option value="low">최하</option>
</select><br/>
별들의전쟁2:
<select id="game"  name="g2">
<option value="no" selected  hidden>안함</option>
<option value="high" >최상</option>
<option value="medium">권장</option>
<option value="low">최하</option>
</select><br/>
엉덩이엉덩이안의신조-시초:
<select id="game"  name="g3">
<option value="no" selected hidden>안함</option>
<option value="high" >최상</option>
<option value="medium">권장</option>
<option value="low">최하</option>
</select><br/>
어두운혼:
<select id="game"  name="g4">
<option value="no" selected hidden>안함</option>
<option value="high" >최상</option>
<option value="medium">권장</option>
<option value="low">최하</option>
</select><br/>
마녀사냥꾼3:
<select id="game"  name="g5">
<option value="no" selected hidden>안함</option>
<option value="high" >최상</option>
<option value="medium">권장</option>
<option value="low">최하</option>
</select><br/>
고급시계:
<select id="game" name="g6">
<option value="no" selected hidden>안함</option>
<option value="high" >최상</option>
<option value="medium">권장</option>
<option value="low">최하</option>
</select><br/>
깜장사막:
<select id="game"  name="g7">
<option value="no" selected hidden>안함</option>
<option value="high" >최상</option>
<option value="medium">권장</option>
<option value="low">최하</option>
</select><br/>
모르는사람들의 싸움의 땅:
<select id="game" name="g8">
<option value="no" selected hidden>안함</option>
<option value="high" >최상</option>
<option value="medium">권장</option>
<option value="low">최하</option>
</select><br/>
무지개여섯:
<select id="game" name="g9">
<option value="no" selected hidden>안함</option>
<option value="high" >최상</option>
<option value="medium">권장</option>
<option value="low">최하</option>
</select><br/>
위대한차도둑5:
<select id="game" name="g10">
<option value="no" selected hidden>안함</option>
<option value="high" >최상</option>
<option value="medium">권장</option>
<option value="low">최하</option>
</select><br/>


</span>
메인보드의 값에 대해
<select id="mainboard" name="pay" >

<option value="1" selected>값을 제일 싼거 위주 </option>
<option value="2">중간</option>
<option value="3">품질을 제일 좋은거 위주</option>
</select><br/>

하드디스크 용량:
<select id="hard" name="hard" >

<option value="0" selected>0(사용안함) </option>
<option value="1">1GB</option>
<option value="2">2TB</option>
<option value="3">4TB</option>
</select><br/>
<input type="submit" value="가즈아">
</form>





<span>
배우기


<a href="cho_sel.em" target="_blank">배우기.img</a>
</span>
</body>
</html>