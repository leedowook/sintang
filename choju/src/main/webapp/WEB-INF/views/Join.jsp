<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>SZ store</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="author" content="" />

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<link
	href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700"
	rel="stylesheet">
<!-- ----------------------------------------------------------------------------------- 아래 구문 복사 해서 jsp 에 복사 (반드시 경로에 맞게 수정 할것!!) -->
<!-- Animate.css -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css">

<!-- Magnific Popup -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/magnific-popup.css">

<!-- Flexslider  -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/flexslider.css">

<!-- Owl Carousel -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/owl.carousel.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/owl.theme.default.min.css">

<!-- Date Picker -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap-datepicker.css">
<!-- Flaticons  -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/fonts/flaticon/font/flaticon.css">

<!-- Theme style  -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<!-- Modernizr JS -->
<script src="<c:url value="/resources/js/modernizr-2.6.2.min.js" />"></script>
<!-- -----------------------------------------------------------------------------------------------------------------------  -->
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
</head>
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
								<!-- li class="active" --><li><a href="ConsertView">Concert & Busking</a></li>
								<!-- <li class="has-dropdown">
									<a href="shop.html">Shop</a>
									<ul class="dropdown">
										<li><a href="product-detail.html">Product Detail</a></li>
										<li><a href="cart.html">Shipping Cart</a></li>
										<li><a href="checkout.html">Checkout</a></li>
										<li><a href="order-complete.html">Order Complete</a></li>
										<li><a href="addtowishlist">Wishlist</a></li>
									</ul>
								</li> -->
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
		<style>
body {
	padding: 60px 0;
}

#login-form>div {
	margin: 15px 0;
}
</style>
		<article class="container">
			<div class="page-header" allign="center">
				<h1>
					회원가입 <small></small>
				</h1>
			</div>
			<div class="col-md-6 col-md-offset-3">
				<form action="memberjoin" method="post" name="joinform" id="frm">
					<div class="form-group">
						<label for="username">이메일 </label>
						<div class="input-group">
							<input type="tel" class="form-control" id="email" name="email"
								placeholder="@포함"> <span class="input-group-btn">
								<button class="btn btn-success" type="button"
									onclick="idOverlap(); return false;">이메일 중복 확인</button>
							</span>
						</div>
						<div id="checkMsg"></div>
					</div>
					<div class="form-group">
						<label for="username">닉네임</label>
						<div class="input-group">
							<input type="tel" class="form-control" id="nickname"
								placeholder="한글로 입력해주세요" name="nickname"> <span
								class="input-group-btn">
								<button class="btn btn-success" type="button"
									onclick="nickNameOverlap(); return false;">닉네임 중복 확인</button>
							</span>
						</div>
						<div id="nickNameMsg"></div>
					</div>
					<div class="form-group">
						<label for="InputPassword1">비밀번호</label> <input type="password"
							class="form-control" id="password" placeholder="비밀번호"
							name="password">
					</div>
					<div class="form-group">
						<label for="InputPassword2">비밀번호 확인</label> <input type="password"
							class="form-control" id="password2" placeholder="비밀번호 확인"
							name="password2" onkeyup="checkPass(); return false;"> <span
							id="confirmMessage" class="confirmMessage"></span>
					</div>
					<div class="form-group">
						<label for="username">이름</label> <input type="text"
							class="form-control" id="name" placeholder="이름을 입력해 주세요"
							name="name">
					</div>
					<div class="form-group">
						<label for="username">성별</label><br> <input type="radio"
							name="gender" value="Man" id="gender" /> 남자 <input type="radio"
							name="gender" value="Woman" checked="checked" id="gender" />여성
					</div>
					<div class="form-group">
						<label for="username">나이</label> <input type="text"
							class="form-control" id="age" placeholder="나이" name="age">
					</div>
					<div class="form-group text-center">
						<button type="submit" class="btn btn-info">
							회원가입<i class="fa fa-check spaceLeft"></i>
						</button>
						<button type="submit" class="btn btn-warning">
							가입취소<i class="fa fa-times spaceLeft"></i>
						</button>
					</div>
					<script type="text/javascript">
						function checkPass() {
							var pass1 = document.getElementById('password');
							var pass2 = document.getElementById('password2');
							var message = document
									.getElementById('confirmMessage');
							var goodColor = "#66cc66";//성공 
							var badColor = "#ff6666";//실패
							if (pass1.value == pass2.value) {
								//비밀번호 일치
								pass1.style.backgroundColor = goodColor;
								message.style.color = goodColor;
								message.innerHTML = "비밀번호 일치"
							} else {
								//비밀번호가 서로 다름
								pass2.style.backgroundColor = badColor;
								message.style.color = badColor;
								message.innerHTML = "비밀번호가 서로 다릅니다."
							}
						}
						//이메일 중복확인
						function idOverlap() {
							var checkMsg = document.getElementById('checkMsg');
							var goodColor = "#66cc66";//성공 
							var badColor = "#ff6666";//실패
							$
									.ajax({
										type : "post",
										url : "idOverlap",
										data : {
											"email" : frm.email.value
										},
										dataType : "text",
										success : function(data) {
											if (data == "0") {
												checkMsg.style.color = badColor;
												checkMsg.innerHTML = "이 이메일은 사용 불가능합니다."
											} else {
												checkMsg.style.color = goodColor;
												checkMsg.innerHTML = "이 이메일은 사용  가능합니다."
											}
										},
										error : function(request, status, error) {
											checkMsg.style.color = badColor;
											checkMsg.innerHTML = "에러"
										}
									});
						}
						//닉네임 중복확인

						function nickNameOverlap() {
							var checkMsg = document
									.getElementById('nickNameMsg');
							var goodColor = "#66cc66";//성공 
							var badColor = "#ff6666";//실패
							$
									.ajax({
										type : "post",
										url : "nickNameOverlap",
										data : {
											"nickname" : frm.nickname.value
										},
										dataType : "text",
										success : function(data) {
											if (data == "0") {
												checkMsg.style.color = badColor;
												checkMsg.innerHTML = "이 닉네임은 사용 불가능합니다."
											} else {
												checkMsg.style.color = goodColor;
												checkMsg.innerHTML = "이 닉네임은 사용  가능합니다."
											}
										},
										error : function(request, status, error) {
											checkMsg.style.color = badColor;
											checkMsg.innerHTML = "에러"
										}
									});
						}
					</script>
				</form>
			</div>
		</article>
		<footer id="colorlib-footer" role="contentinfo">
			<div class="container">
				<div class="row row-pb-md">
					<div class="col-md-3 colorlib-widget">
						<h4>About Store</h4>
						<p>Facilis ipsum reprehenderit nemo molestias. Aut cum
							mollitia reprehenderit. Eos cumque dicta adipisci architecto
							culpa amet.</p>
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
							<li>291 South 21th Street, <br> Suite 721 New York NY
								10016
							</li>
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

							<span class="block"> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
								Copyright &copy;<script>
									document.write(new Date().getFullYear());
								</script> All rights reserved | This template is made with <i
								class="icon-heart2" aria-hidden="true"></i> by <a
								href="https://colorlib.com" target="_blank">Colorlib</a> Link
								back to Colorlib can't be removed. Template is licensed under CC
								BY 3.0.
							</span> <span class="block">Demo Images: <a
								href="http://unsplash.co/" target="_blank">Unsplash</a> , <a
								href="http://pexels.com/" target="_blank">Pexels.com</a></span>
						</p>
					</div>
				</div>
			</div>
		</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up2"></i></a>
	</div>
	<!-- ------------------------------------------------------------------------- 아래 구문 복사 해서 딴 jsp 파일에 복사  -->
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
	<script
		src="<c:url value="/resources/js/jquery.magnific-popup.min.js" />"></script>
	<script src="<c:url value="/resources/js/magnific-popup-options.js" />"></script>
	<!-- Date Picker -->
	<script src="<c:url value="/resources/js/bootstrap-datepicker.js" />"></script>
	<!-- Stellar Parallax -->
	<script src="<c:url value="/resources/js/jquery.stellar.min.js" />"></script>
	<!-- Main -->
	<script src="<c:url value="/resources/js/main.js" />"></script>
	<!-- --------------------------------------------------------------------------------------------------------- -->
</body>
</html>