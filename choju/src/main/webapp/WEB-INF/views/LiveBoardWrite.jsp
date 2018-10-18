<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page import="com.choju.fpro.vo.*"%>
<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Store Template</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="author" content="" />

  <!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">
	<!-- ----------------------------------절대 수정 하지 말것. -->
	<!-- Animate.css -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
 
	<!-- Magnific Popup -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/magnific-popup.css">

	<!-- Flexslider  -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/flexslider.css">

	<!-- Owl Carousel -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/owl.carousel.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/owl.theme.default.min.css">
	
	<!-- Date Picker -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap-datepicker.css">
	<!-- Flaticons  -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts/flaticon/font/flaticon.css">

	<!-- Theme style  -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

	<!-- Modernizr JS -->
	<script src="<c:url value="/resources/js/modernizr-2.6.2.min.js" />"></script>
	<!-- -------------------------------------절대 수정 하지 말것.---------------------------------------------------  -->
	
	<script src="https://code.jquery.com/jquery-latest.js"></script>
	<script type="text/javascript" src="./resources/editor/js/HuskyEZCreator.js" charset="utf-8"></script>


	</head>
	
	<script type="text/javascript">
    $(function(){
        //전역변수
        var obj = [];              
        //스마트에디터 프레임생성
        nhn.husky.EZCreator.createInIFrame({
            oAppRef: obj,
            elPlaceHolder: "editor",
            sSkinURI: "./resources/editor/SmartEditor2Skin.html",
            htParams : {
                // 툴바 사용 여부
                bUseToolbar : true,            
                // 입력창 크기 조절바 사용 여부
                bUseVerticalResizer : false,    
                // 모드 탭(Editor | HTML | TEXT) 사용 여부
                bUseModeChanger : false,
            }
        });
         $("#insertBoard").click(function(){
            //id가 smarteditor인 textarea에 에디터에서 대입
            obj.getById["editor"].exec("UPDATE_CONTENTS_FIELD", []);
            //폼 submit
            $("#boardwriteFrm").submit();
        });
    });
</script>
	
	
	
	
	<body>
		
	<div class="colorlib-loader"></div>

	<div id="page">
		<nav class="colorlib-nav" role="navigation">
			<div class="top-menu">
				<div class="container">
					<div class="row">
						<div class="col-xs-2">
							<div id="colorlib-logo"><a href="/fpro/">HOME</a></div>
						</div>
						<div class="col-xs-10 text-right menu-1">
							<ul>
								<li><a href="ConsertView">Concert & Busking</a></li>
								
								<li><a href="freeboardForm">Free Board</a></li>
								<li><a href="about">Public Board</a></li>
								<li><a href="contact.html">Customer</a></li>			
								<%if((String)session.getAttribute("session_Email")==null){ %>
								<li><a href="Login">Login</a></li> <!-- <i class="icon-shopping-cart"></i> -->
								<%}else if(session.getAttribute("session_Email").equals("Admin")){ %>
								<li><a href="Admin">Admin</a></li>
								<li><a href="logout">Logout</a></li>
								<%}else{ %>
								<li><a href="Mypage.go?id=<%=session.getAttribute("session_Email")%>">MyPage</a></li>
								<li><a href="logout">Logout</a></li>
								<%} %>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</nav>
		<aside id="colorlib-hero">
			<div class="flexslider">
				<ul class="slides">
				<!-- ì´ë¯¸ì§ í¸ì¶ ìë ì  backgrount-size:100%; êµ¬ë¬¸ ì¶ê°  -->
			   	<li style="background-image: url(./resources/images/SZ.jpg);background-size:30%;">
		</aside>
		
		<div id="colorlib-featured-product">
			<div align="center"> <!-- class="container" -->
				<div>
					<form action="Liveboardwrite" name="write" method="post" enctype="multipart/form-data" id="boardwriteFrm">
						<table border=1 style="cellpadding:0;cellspacing:0;border-top:2px solid red;border-bottom:2px solid red;
							border-left:1px solid black;border-right:1px solid black;">
							
							<tr style="border-bottom:black;">
								<td bgcolor="#d6d6d6" style="text-align:center;height:50px;width:70px;">작성자</td>
								<td>&nbsp;&nbsp;&nbsp;<%=session.getAttribute("session_Nickname")%></td>
								<!-- <input type="text" name="Member_nickname" style="height:50px;width:750px;text-align:left;"> -->
							</tr>
							
							<tr style="border-bottom:black;">
								<td bgcolor="#d6d6d6" style="text-align:center;height:50px;width:70px;">글제목</td>
								<td><input type="text" name="Board_Title" style="height:50px;width:750px;text-align:left;"></td>
							</tr>
							
							<tr style="border-bottom:black;">
								<td bgcolor="#d6d6d6" style="text-align:center;height:50px;">비밀번호</td>
								<td><input type="password" name="Board_Password" style="height:50px;width:750px;text-align:left;"></td>
							</tr>
			
							<tr style="border-bottom:black;">
								<td bgcolor="#d6d6d6" style="text-align:center;height:50px;">글유형</td>
								<td>&nbsp;&nbsp;&nbsp;<select name="Board_Type">
										<option value="Free">자유</option>
										<option value="Auction">경매</option>
										<option value="Relations">홍보</option>
									</select>
								</td>
							</tr>
							
							<tr style="border-bottom:black;">
								<td bgcolor="#d6d6d6" style="text-align:center;height:50px;">글내용</td>
								<td>
								<input type="text" id="editor" name="Board_Content" style="width:750px;height:500px;"/>
								</td>
							</tr>

							
							<!-- <tr style="border-bottom:black;">
								<td bgcolor="#d6d6d6" style="text-align:center;height:50px;">글내용</td>
								<td><input type="text" name="Board_Content" style="height:500px;width:750px;"></td>
							</tr> -->
							
							<tr style="border-bottom:black;">
								<td bgcolor="#d6d6d6" style="text-align:center;height:50px;">동영상</td>
								<td><input type="text" name="Board_Videourl" style="height:50px;width:750px;" placeholder="동영상 url를 작성해주세요"></td>
							</tr>
			
							<tr style="text-align:center;border-bottom:black;">
								<td bgcolor="#d6d6d6" style="height:50px;">첨부파일</td>
								<td><input type="file" name="Board_File"></td>
							</tr>
		
							<tr>
								<td colspan="2" style="height:50px;text-align:right;">
								<a href="##" onclick="history.go(-1)">돌아가기&nbsp;&nbsp;&nbsp;</a>
								<a href="javascript:write.submit()" id="insertBoard" >작성하기&nbsp;&nbsp;&nbsp;</a></td>
							</tr> 
						</table>	
					</form>
				</div>

		<footer id="colorlib-footer" role="contentinfo">
			<div class="container">
				<div class="row row-pb-md">
					<div class="col-md-3 colorlib-widget">
						<h4>About Store</h4>
						<p>Facilis ipsum reprehenderit nemo molestias. Aut cum mollitia reprehenderit. Eos cumque dicta adipisci architecto culpa amet.</p>
						<p>
							<ul class="colorlib-social-icons">
								<li><a href="#"><i class="icon-twitter"></i></a></li>
								<li><a href="#"><i class="icon-facebook"></i></a></li>
								<li><a href="#"><i class="icon-linkedin"></i></a></li>
								<li><a href="#"><i class="icon-dribbble"></i></a></li>
							</ul>
						</p>
					</div>
					<div class="col-md-2 colorlib-widget">
						<h4>Customer Care</h4>
						<p>
							<ul class="colorlib-footer-links">
								<li><a href="#">Contact</a></li>
								<li><a href="#">Returns/Exchange</a></li>
								<li><a href="#">Gift Voucher</a></li>
								<li><a href="#">Wishlist</a></li>
								<li><a href="#">Special</a></li>
								<li><a href="#">Customer Services</a></li>
								<li><a href="#">Site maps</a></li>
							</ul>
						</p>
					</div>
					<div class="col-md-2 colorlib-widget">
						<h4>Information</h4>
						<p>
							<ul class="colorlib-footer-links">
								<li><a href="#">About us</a></li>
								<li><a href="#">Delivery Information</a></li>
								<li><a href="#">Privacy Policy</a></li>
								<li><a href="#">Support</a></li>
								<li><a href="#">Order Tracking</a></li>
							</ul>
						</p>
					</div>

					<div class="col-md-2">
						<h4>News</h4>
						<ul class="colorlib-footer-links">
							<li><a href="blog.html">Blog</a></li>
							<li><a href="#">Press</a></li>
							<li><a href="#">Exhibitions</a></li>
						</ul>
					</div>

					<div class="col-md-3">
						<h4>Contact Information</h4>
						<ul class="colorlib-footer-links">
							<li>291 South 21th Street, <br> Suite 721 New York NY 10016</li>
							<li><a href="tel://1234567920">+ 1235 2355 98</a></li>
							<li><a href="mailto:info@yoursite.com">info@yoursite.com</a></li>
							<li><a href="#">yoursite.com</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="copy">
				<div class="row">
					<div class="col-md-12 text-center">
						<p>
							
							<span class="block"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart2" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></span> 
							<span class="block">Demo Images: <a href="http://unsplash.co/" target="_blank">Unsplash</a> , <a href="http://pexels.com/" target="_blank">Pexels.com</a></span>
						</p>
					</div>
				</div>
			</div>
		</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up2"></i></a>
	</div>
	<!-- --------------------------------절대 수정하지 말것.  -->
	<!-- jQuery -->
	<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
	<!-- jQuery Easing -->
	<script src="<c:url value="/resources/js/jquery.easing.1.3.js" />"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<script src="<c:url value="/resources/js/jquery.easing.1.3.js" />"></script>
	<!-- Waypoints -->
	<script src="<c:url value="/resources/js/jquery.waypoints.min.js" />"></script>
	<!-- Flexslider -->
	<script src="<c:url value="/resources/js/jquery.flexslider-min.js" />"></script>
	<!-- Owl carousel -->
	<script src="<c:url value="/resources/js/owl.carousel.min.js" />"></script>
	<!-- Magnific Popup -->
	<script src="<c:url value="/resources/js/jquery.magnific-popup.min.js" />"></script>
	<script src="<c:url value="/resources/js/magnific-popup-options.js" />"></script>
	<!-- Date Picker -->
	<script src="<c:url value="/resources/js/bootstrap-datepicker.js" />"></script>
	<!-- Stellar Parallax -->
	<script src="<c:url value="/resources/js/jquery.stellar.min.js" />"></script>
	<!-- Main -->
	<script src="<c:url value="/resources/js/main.js" />"></script>
<!-- ----------------------------------절대 수정 하지 말것----------------------------------------------------------------------- -->
	</body>
</html>