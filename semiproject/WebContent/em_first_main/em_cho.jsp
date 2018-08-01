<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function submit_form() {


  document.getElementById('main').submit();  
 }

</script>
<link rel="stylesheet" href="../css/style.css">
</head>
<body>
<form action="./cho_sel.em" method="post" id="main" name="nmsubmit">
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
<!-- cpu에 대해
인텔<input type="radio" id="cpu" name="cpusel" value="0" checked>
암드<input type="radio" id="cpu" name="cpusel" value="1"> -->

<br/>
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
<input type=button  name='nmsubmit' id='nmsubmit' onclick='submit_form()' value="가즈아">
</form>


<% if(request.getAttribute("set")!=null){
	%>
<c:set var="vga" value="${vga}"/>
<c:set var="pow" value="${power}"/>

<c:set var="in_ram" value="${in_ram}"/>
<c:set var="in_mainboard" value="${in_mb}"/>
<c:set var="in_cpu" value="${in_cpu}"/>
<c:set var="am_ram" value="${am_ram}"/>
<c:set var="am_mainboard" value="${am_mb}"/>
<c:set var="am_cpu" value="${am_cpu}"/>
<% if(request.getAttribute("hdd")!=null){%>
<c:set var="hdd" value="${hdd}"/>
<%} if(request.getAttribute("ssd")!=null){%>
<c:set var="ssd" value="${ssd}"/>
<%} %>

<span>
	<table>
	<tbody>
	<tr>
		<td id="name">CPU
		</td>
		<td	id="partid"><input type="radio" name="cpu" value="${in_cpu.num}">     ${in_cpu.maker}${in_cpu.brand}${in_cpu.name}
		</td>
		<td id="partid"><input type="radio" name="cpu" value="${in_cpu.num}">     ${am_cpu.maker}${am_cpu.brand}${am_cpu.name}
		</td>
		<td>
		<form action="saveem.em" id="cpuform">
		
		</form>
		<button class="snip1535">견적함에 추가</button>
		</td>
		
	</tr>
	<tr>
		<td id="name">메인보드
		</td> 
		<td id="partid">${in_mainboard.maker}${in_mainboard.brand}${in_mainboard.name}${in_mainboard.chip_group}${in_mainboard.chip_group_b}
		</td>
		<td id="partid">${am_mainboard.maker}${am_mainboard.brand}${am_mainboard.name}${am_mainboard.chip_group}${am_mainboard.chip_group_b}
		</td>
		<td>
		</td>
		
	</tr>
	<tr>
		<td id="name" >그래픽
		</td>
		<td colspan="2" id="partid">${vga.maker} ${vga.chipmaker} ${vga.chip}  ${vga.name}    ${vga.ram_mm}GB
		</td>
		<td>
		</td>
	</tr>
	<tr>
		<td id="name">RAM
		</td>
			
		<td id="partid">     ${in_ram.maker}${in_ram.kind} 용량: ${in_ram.mm}Gb
		</td>
		<td id="partid">     ${am_ram.maker}${am_ram.kind} 용량: ${am_ram.mm}Gb		
		</td>
		<td>
		</td>
		
	</tr>
	
	<tr>
		<td id="name">HDD
		</td >
		<td colspan="2" id="partid">
		     ${hdd.maker}  ${hdd.name} 용량:${hdd.memory}Tb
		</td>
		<td>
		</td>
	</tr>
	<tr>
		<td id="name">SSD
		</td>
		<td colspan="2" id="partid">
		     ${ssd.maker}${ssd.name} 용량:${ssd.memory}Gb
		</td>
		<td>
		</td>
	</tr>
	<tr>
		<td id="name">POWER
		</td>
		<td colspan="2" id="partid">
			${pow.maker }  ${pow.kind }  ${pow.eplus} ${pow.power }W
		</td>
		<td>
		</td>
	</tr>
	
	</tbody>
	</table>
</span>	
	

  

    
<%} %>




<span>
배우기


<a href="cho_sel.em" target="_blank">배우기.img</a>
</span>
</body>
</html>