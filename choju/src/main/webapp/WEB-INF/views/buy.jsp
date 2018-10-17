<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
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
<!-- ----------------------------------절대 수정 하지 말것. -->
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
<!-- -------------------------------------절대 수정 하지 말것.---------------------------------------------------  -->
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
							<div id="colorlib-logo">
								<a href="/fpro/">HOME</a>
							</div>
						</div>
						<div class="col-xs-10 text-right menu-1">
							<ul>
								<!-- li class="active" -->
								<li><a href="ConsertView">Concert & Busking</a></li>
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
								<%
									if ((String) session.getAttribute("session_Email") == null) {
								%>
								<li><a href="Login">Login</a></li>
								<!-- <i class="icon-shopping-cart"></i> -->
								<%
									} else if (session.getAttribute("session_Email").equals("Admin")) {
								%>
								<li><a href="logout">Logout</a></li>
								<li><a href="Admin">Admin</a></li>
								<%
									} else {
								%>
								<li><a href="logout">Logout</a></li>
								<li><a
									href="Mypage.go?id=<%=session.getAttribute("session_Email")%>">MyPage</a></li>
								<%
									}
								%>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</nav>

		<div class="colorlib-shop">
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-md-offset-3 text-center colorlib-heading">
						<h2>
							<span>Ticket Reservation</span>
						</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4 text-center col-md-offset-2">
						<div class="product-entry">
							<div class="product-img"
								style="background-image: url(./resources/images/item-9.jpg); background-size: 100%;">
							</div>
						</div>
					</div>
					<div class="col-md-3 text-center col-md-offset-1">
						<div>
							<h3>공연장1</h3>
							<p class="price">
								<span style="color: black">30%</span>&nbsp;&nbsp; <span
									class="sale"
									style="color: gray; text-decoration: line-through; font-weight: 300;">$300.00</span><br>
								<span
									style="color: #ae0000; font-size: 20px; line-height: 21px;">$199.00</span>
							</p>
						</div>
						<div style="border-top: 1px solid #3d3d3d">
							<table style="text-align: right;">
								<tr>
									<td rowspan=4 style="width: 100px; 
														 font-weight: bold;
														 linetext-align: center;">좌석
										가격</td>
									<td style="width: 70px; text-align: center;">R석</td>
									<td>100,000원</td>
								</tr>
								<tr>
									<td style="width: 70px; text-align: center;">S석</td>
									<td>80,000원</td>
								</tr>
								<tr>
									<td style="width: 70px; text-align: center;">A석</td>
									<td>60,000원</td>
								</tr>
								<tr>
									<td style="width: 70px; text-align: center;">B석</td>
									<td>40,000원</td>
								</tr>
							</table>
							<br>
								<a href="##" class="btn btn-primary center-block" id=""
								style="width: 100px; text-align: center;">결제하기&nbsp;&nbsp;&nbsp;</a>
						</div>
					</div>
				</div>
			</div>
			
			
			<div>
				
			
				<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
				<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
				<script>
				 
					var IMP = window.IMP; // 생략가능
					IMP.init('imp81723948'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
					
					IMP.request_pay({
					    pg : 'kakaopay',
					    pay_method : 'card',
					    merchant_uid : 'merchant_' + new Date().getTime(),
					    name : '상품명',
					    amount : 1000,	//가격
					    buyer_email : '회원이메일',
					    buyer_name : '회원아이디',
					    buyer_tel : '회원번호',
					    buyer_addr : '회원주소',
					    buyer_postcode : '123-456',
					    m_redirect_url : 'http://localhost:604/fpro/ConsertView' //결제 완료 후 이동하는 페이지 (수정이 필요함 / 안넘어감ㅎㅎ)
					}, function(rsp) {
					    if ( rsp.success ) {
					     //[1] 서버단에서 결제정보 조회를 위해 jQuery ajax로 imp_uid 전달하기
					     jQuery.ajax({
					      url: "/payments/complete", //cross-domain error가 발생하지 않도록 주의해주세요
					      type: 'POST',
					      dataType: 'json',
					      data: {
					       imp_uid : rsp.imp_uid
					       //기타 필요한 데이터가 있으면 추가 전달
					      }
					     }).done(function(data) {
					      //[2] 서버에서 REST API로 결제정보확인 및 서비스루틴이 정상적인 경우
					      if ( everythings_fine ) {
					       var msg = '결제가 완료되었습니다.';
			    			
					       alert(msg); //결제가 완료되었다고 alert창이 떠야하는데 이거도 안뜸 ㅎㅎ
					       
					      } else {
					       //[3] 아직 제대로 결제가 되지 않았습니다.
					       //[4] 결제된 금액이 요청한 금액과 달라 결제를 자동취소처리하였습니다.
					      }
					     });
					    } else {
					        var msg = '결제에 실패하였습니다.';
					        msg += '에러내용 : ' + rsp.error_msg;
					        alert(msg);
					    }
					});
				</script>
			</div>

			<div id="colorlib-subscribe">
				<div class="overlay"></div>
				<div class="container">
					<div class="row">
						<div class="col-md-8 col-md-offset-2">
							<div class="col-md-6 text-center">
								<h2>
									<i class="icon-paperplane"></i>Sign Up for a Newsletter
								</h2>
							</div>
							<div class="col-md-6">
								<form class="form-inline qbstp-header-subscribe">
									<div class="row">
										<div class="col-md-12 col-md-offset-0">
											<div class="form-group">
												<input type="text" class="form-control" id="email"
													placeholder="Enter your email">
												<button type="submit" class="btn btn-primary">Subscribe</button>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>

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
										document
												.write(new Date().getFullYear());
									</script> All rights reserved | This template is made with <i
									class="icon-heart2" aria-hidden="true"></i> by <a
									href="https://colorlib.com" target="_blank">Colorlib</a> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
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
		<script
			src="<c:url value="/resources/js/jquery.magnific-popup.min.js" />"></script>
		<script
			src="<c:url value="/resources/js/magnific-popup-options.js" />"></script>
		<!-- Date Picker -->
		<script src="<c:url value="/resources/js/bootstrap-datepicker.js" />"></script>
		<!-- Stellar Parallax -->
		<script src="<c:url value="/resources/js/jquery.stellar.min.js" />"></script>
		<!-- Main -->
		<script src="<c:url value="/resources/js/main.js" />"></script>
		<!-- ----------------------------------절대 수정 하지 말것----------------------------------------------------------------------- -->
</body>
</html>