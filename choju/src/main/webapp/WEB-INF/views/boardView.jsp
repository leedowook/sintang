<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.choju.fpro.vo.*"%>
<%@ page import="java.util.*"%>
<%
					request.setCharacterEncoding("UTF-8");
					session = request.getSession(true);
					String id = request.getParameter("id");
					request.getSession().setAttribute("id",id);
				%>

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
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
	
	<style>
	.youtubeWrap {
        position: relative;
        width:  900px;
        height: 400px;
        padding-bottom: 56.25%;
      }
      .youtubeWrap iframe {
        position: absolute;
        width: 100%;
        height: 100%;
      }
	</style>
	
	
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
		<aside id="colorlib-hero">
			<div class="flexslider">
				<ul class="slides">
				<!-- ì´ë¯¸ì§ í¸ì¶ ìë ì  backgrount-size:100%; êµ¬ë¬¸ ì¶ê°  -->
			   	<li style="background-image: url(./resources/images/SZ.jpg);background-size:30%;">
		</aside>
		
		<div id="colorlib-featured-product">
			<div align="center"> <!-- class="container" -->
				<div>
					<form action="boardmodify" name="modify" method="post">
						<input type="hidden" name="board_Num" value="${boardview.board_Num }">
						<table id=freeboard border=1 style="cellpadding:0;cellspacing:0;border-top:2px solid red;border-bottom:2px solid red;
							border-left:1px solid black;border-right:1px solid black;" >
							<tr style="height:30px;text-align:center;border-bottom:black;" bgcolor="#d6d6d6">
								<td style="width:75px">글번호</td>
								<td style="width:75px">글유형</td>
								<td style="width:500px">글제목</td>
								<td style="width:100px">작성자</td>
								<td style="width:50px">조회수</td>
								<td style="width:100px">작성일자</td>
							</tr>
							
							<tr style="text-align:center;border-bottom:black;">
								<td>${boardview.board_Num }</td>
								<td>${boardview.board_Type }</td>
								<td style="text-align:left;">&nbsp;&nbsp;&nbsp;${boardview.board_Title}</td>
								<td>${boardview.board_Nickname}</td>
								<td>${boardview.board_Hit }</td>
								<td>${boardview.board_Date }</td>
							</tr>
							
							<tr style="border-bottom:black;">
								<td colspan="6"><br><br><br>&nbsp;&nbsp;&nbsp;${boardview.board_Videourl }
												<br><br><br>&nbsp;&nbsp;&nbsp;${boardview.board_Content }<br><br><br>
								</td>
								<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
   								
   								<script>
      							jQuery( document ).ready( function( $ ) {
        						$( 'iframe[src^="https://www.youtube.com/"]' ).wrap( '<div class="youtubeWrap"></div>' );
     							} );
   								</script>
   								 
							</tr>
							
							<tr style="border-bottom:black;">
								<td bgcolor="#d6d6d6">&nbsp;&nbsp;&nbsp;파일명</td>
								<td colspan="5"><a href="boardFileDown?board_FileName=${boardview.board_FileName }">&nbsp;&nbsp;&nbsp;${boardview.board_FileName}</a></td>
							</tr>
										
							<tr>
								<td colspan="6" style="text-align:right;height:30px;">
									<c:if test="${sessionScope.session_Nickname == boardview.board_Nickname}">
									<a href="boardmodify?board_Num=${boardview.board_Num }">수정</a> &nbsp;&nbsp;
									<a href="freeboardForm">목록보기</a> &nbsp;&nbsp;
									<a href="boarddelete?board_Num=${boardview.board_Num }">삭제</a> &nbsp;&nbsp;
									</c:if>
									<c:if test="${sessionScope.session_Nickname != boardview.board_Nickname}">
									<a href="freeboardForm">목록보기</a> &nbsp;&nbsp;
									</c:if>
								</td>
							</tr>
						</table>
					</form>
				</div>
				
				<br>
				<br>
				
				
				
				<!-- <h3>댓글이지렁</h3> -->
				
				<form action="boardreply" name="reply" method ="post" >
					<table border=1 style="cellpadding:0;cellspacing:0;border-top:2px solid red;border-bottom:2px solid red;
							border-left:1px solid black;border-right:1px solid black;" >
					<tbody>
					<div style="font-size:15px;text-align:center;">댓글</div>
						<tr style="height:30px;text-align:center;border-bottom:black;" >
							<td style="width:200px" bgcolor="#d6d6d6">글 작성자</td>
							<td style="width:700px;text-align:left;">
							<%if(session.getAttribute("session_Nickname")==null) {%>
							&nbsp;&nbsp;&nbsp;로그인이 필요합니다<%} %>
							<%if(session.getAttribute("session_Nickname")!=null) { %>
							&nbsp;&nbsp;&nbsp;<%=session.getAttribute("session_Nickname")%><%} %>
							</td>
							<!-- <input type="text" name="Comment_Writer" required="required" style="width:700px; height:30px;" > -->
						</tr>
						<tr style="height:30px;text-align:center;border-bottom:black;">
							<input type="hidden" name="Board_Num" value="${boardview.board_Num }">
							<td style="width:200px" bgcolor="#d6d6d6">댓글 작성하기</td>
							<td style="width:700px"><input type="text" name="Comment_Content" required="required" style="width:700px; height:75px;"
								placeholder="건전한 커뮤니티 이용을 부탁드립니다."></td>
						</tr>
						
						<tr>
							<td colspan="2" style="text-align:right;height:30px;">
								<%if(session.getAttribute("session_Nickname")!=null) { %>
								<a href="javascript:reply.submit()" style="width:50px; height:30px;">등록&nbsp;&nbsp;&nbsp;</a>
								<%} %>
							</td> <!-- <a href="boardreply?board_Num=${boardview.board_Num }">등록</a>&nbsp;&nbsp;  -->  
						</tr>
					</tbody>
					</table>
				</form>
				
				<br>
				<br>
				<br>
		   
				
					<table border=1 style="cellpadding:0;cellspacing:0;border-top:2px solid red;border-bottom:2px solid red;
							border-left:1px solid black;border-right:1px solid black;" >
							<div style="font-size:15px;text-align:center;">댓글 리스트</div>
							<tbody>
							<c:forEach var="reply" items="${replyView}">
							<input type="hidden" name="Comment_Num" value="${reply.comment_Num}">
							<tr style="height:30px;text-align:center;border-bottom:black;">
								<td style="width:200px" bgcolor="#d6d6d6">댓글 작성자</td>
								<td style="width:250px;">${reply.comment_Nickname}</td>
								<td style="width:200px;" bgcolor="#d6d6d6">
									<a href="ReplyLike?Comment_Num=${reply.comment_Num}&board_Num=${boardview.board_Num }"><img src="./resources/images/like2.png"></a>
								</td>
								<td style="width:250px;">${reply.comment_Like}</td>
							</tr>
						
							<tr style="height:30px;text-align:center;border-bottom:black;">
								<td style="width:200px;" bgcolor="#d6d6d6">댓글 내용</td>
								<td style="width:700px;" colspan="3">${reply.comment_Content}</td>
							</tr>
							</c:forEach>
							</tbody>
					</table>
					
					<br>
					<br>
					<br>
					
					<div id="colorlib-featured-product" style="padding-bottom:30px;">
						<div align="center">
							<!-- class="container" -->
							<div>
								<table id=freeboard border=0
										style="cellpadding: 0; cellspacing: 0; border-top: 2px solid red; border-bottom: 2px solid red; border-left: none; border-right: none;">
										<!-- width="1000px" -->
										<div>freeboardForm</div>
										<tr style="height: 30px; text-align: center;" bgcolor="#d6d6d6">
											<td style="width: 75px">글번호</td>
											<td style="width: 75px">글유형</td>
											<td style="width: 600px">글제목</td>
											<td style="width: 50px">조회수</td>
											<td style="width: 100px">작성일자</td>
										</tr>
						 
										<c:forEach items="${boardviewInList}" var="boardviewInList">
											<!--  for(int i=0;i<boardList.size();i++){   -->
											<tr style="height: 30px; text-align: center;">
												<td>${boardviewInList.board_Num}</td> <!--boardList.get(i).getBoard_Num() -->
												<td>${boardviewInList.board_Type}</td> <!-- boardList.get(i).getBoard_Type() -->
												<td style="text-align:left;">
												<a href="boardview?board_Num=${boardviewInList.board_Num}">&nbsp;&nbsp;&nbsp;${boardviewInList.board_Title}</a></td> <!-- boardList.get(i).getBoard_Title() -->
												<td>${boardviewInList.board_Hit}</td> <!--   boardList.get(i).getBoard_Hit()-->  
												<td>${boardviewInList.board_Date}</td> <!-- boardList.get(i).getBoard_Date()  --> 
											</tr>
											<!-- 
											}    -->
										</c:forEach>
										<tr>
											<td colspan="8" style="text-align: right; height: 30px;"><a href="boardwriteForm">글쓰기&nbsp;&nbsp;&nbsp;</a></td>
										</tr>
									</table>
								</div>
							</div>
						</div>
				
				<!-- 페이지 정보 출력및 페이지 링크 -->
		<div style="padding:-50px;">
		<ul class="pageUL" style="text-align:center;list-style:none;">
			<c:if test="${pageMaker.prev }">
				<li><a href='freeboardForm?page=${pageMaker.start -1}'>이전</a></li>
			</c:if>
			
			<c:forEach begin="${pageMaker.start }" end="${pageMaker.end}" var="idx">
				<li class='<c:out value="${idx == pageMaker.page?'current':''}"/>' style="display:inline;font-size:15px;">
					<a href='freeboardForm?page=${idx}'>${idx}&nbsp;&nbsp;&nbsp;</a>
				</li>
			</c:forEach>
			
			<c:if test="${pageMaker.next }">
				<li><a href='freeboardForm?page=${pageMaker.end +1}'>다음</a></li>
			</c:if>
		</ul>
		</div>
		 
						
						

				
			
				<!-- <div class="row">
					<div class="col-md-6">
						<a href="shop.html" class="f-product-1" style="background-image: url(./resources/images/item-1.jpg);background-size:100%;">
							<div class="desc">
								<h2>Fahion <br>for <br>men</h2>
							</div>
						</a>
					</div>
					<div class="col-md-6">
						<div class="row">
							<div class="col-md-6">
								<a href="" class="f-product-2" style="background-image: url(./resources/images/item-2.jpg);background-size:100%;">
									<div class="desc">
										<h2>New <br>Arrival <br>Dress</h2>
									</div>
								</a>
							</div>
							<div class="col-md-6">
								<a href="" class="f-product-2" style="background-image:url(./resources/images/item-4.jpg);background-size:100%;">
									<div class="desc">
										<h2>Sale <br>20% <br>off</h2>
									</div>
								</a>
							</div>
							<div class="col-md-12">
								<a href="" class="f-product-2" style="background-image: url(./resources/images/item-3.jpg);background-size:100%;">
									<div class="desc">
										<h2>Shoes <br>for <br>men</h2>
									</div>
								</a>
							</div>
						</div>
					</div>
				</div> -->
			</div>
		</div>
		<!-- 
		<div class="colorlib-shop">
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-md-offset-3 text-center colorlib-heading">
						<h2><span>New Arrival</span></h2>
						<p>We love to tell our successful far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image: url(./resources/images/item-5.jpg);background-size:100%;">
								<p class="tag"><span class="new">New</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$300.00</span></p>
							</div>
						</div>
					</div>
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image: url(./resources/images/item-6.jpg);background-size:100%;">
								<p class="tag"><span class="new">New</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$300.00</span></p>
							</div>
						</div>
					</div>
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image: url(./resources/images/item-7.jpg);background-size:100%;">
								<p class="tag"><span class="new">New</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$300.00</span></p>
							</div>
						</div>
					</div>
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image: url(./resources/images/item-8.jpg);background-size:100%;">
								<p class="tag"><span class="new">New</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$300.00</span></p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="colorlib-intro" class="colorlib-intro" style="background-image: url(./resources/images/cover-img-1.jpg);background-size:100%;" data-stellar-background-ratio="0.5">
			<div class="overlay"></div>
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<div class="intro-desc">
							<div class="text-salebox">
								<div class="text-lefts">
									<div class="sale-box">
										<div class="sale-box-top">
											<h2 class="number">45</h2>
											<span class="sup-1">%</span>
											<span class="sup-2">Off</span>
										</div>
										<h2 class="text-sale">Sale</h2>
									</div>
								</div>
								<div class="text-rights">
									<h3 class="title">Just hurry up limited offer!</h3>
									<p>Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
									<p><a href="shop.html" class="btn btn-primary">Shop Now</a> <a href="#" class="btn btn-primary btn-outline">Read more</a></p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="colorlib-shop">
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-md-offset-3 text-center colorlib-heading">
						<h2><span>Our Products</span></h2>
						<p>We love to tell our successful far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image: url(./resources/images/item-9.jpg);background-size:100%;">
								<p class="tag"><span class="sale">Sale</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$199.00</span> <span class="sale">$300.00</span> </p>
							</div>
						</div>
					</div>
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image: url(./resources/images/item-10.jpg);background-size:100%;">
								<p class="tag"><span class="new">New</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$300.00</span></p>
							</div>
						</div>
					</div>
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image: url(./resources/images/item-11.jpg);background-size:100%;">
								<p class="tag"><span class="new">New</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$300.00</span></p>
							</div>
						</div>
					</div>
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image: url(./resources/images/item-12.jpg);background-size:100%;">
								<p class="tag"><span class="new">New</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$300.00</span></p>
							</div>
						</div>
					</div>
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image:url(./resources/images/item-13.jpg);background-size:100%;">
								<p class="tag"><span class="new">New</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$300.00</span></p>
							</div>
						</div>
					</div>
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image: url(./resources/images/item-14.jpg);background-size:100%;">
								<p class="tag"><span class="new">New</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$300.00</span></p>
							</div>
						</div>
					</div>
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image: url(./resources/images/item-15.jpg);background-size:100%;">
								<p class="tag"><span class="new">New</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$300.00</span></p>
							</div>
						</div>
					</div>
					<div class="col-md-3 text-center">
						<div class="product-entry">
							<div class="product-img" style="background-image: url(./resources/images/item-16.jpg);background-size:100%;">
								<p class="tag"><span class="new">New</span></p>
								<div class="cart">
									<p>
										<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
										<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
										<span><a href="#"><i class="icon-heart3"></i></a></span>
										<span><a href="add-to-wishlist.html"><i class="icon-bar-chart"></i></a></span>
									</p>
								</div>
							</div>
							<div class="desc">
								<h3><a href="shop.html">Floral Dress</a></h3>
								<p class="price"><span>$300.00</span></p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="colorlib-testimony" class="colorlib-light-grey">
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-md-offset-3 text-center colorlib-heading">
						<h2><span>Our Satisfied Customer says</span></h2>
					</div>
				</div>
				<div class="row">
					<div class="col-md-8 col-md-offset-2">						
						<div class="owl-carousel2">
							<div class="item">
								<div class="testimony text-center">
									<span class="img-user" style="background-image:url(./resources/images/person1.jpg);background-size:100%;"></span>
									<span class="user">Alysha Myers</span>
									<small>Miami Florida, USA</small>
									<blockquote>
										<p>" A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>
									</blockquote>
								</div>
							</div>
							<div class="item">
								<div class="testimony text-center">
									<span class="img-user" style="background-image: url(./resources/images/person2.jpg);background-size:100%;"></span>
									<span class="user">James Fisher</span>
									<small>New York, USA</small>
									<blockquote>
										<p>One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar.</p>
									</blockquote>
								</div>
							</div>
							<div class="item">
								<div class="testimony text-center">
									<span class="img-user" style="background-image:url(./resources/images/person3.jpg);background-size:100%;"></span>
									<span class="user">Jacob Webb</span>
									<small>Athens, Greece</small>
									<blockquote>
										<p>Alphabet Village and the subline of her own road, the Line Lane. Pityful a rethoric question ran over her cheek, then she continued her way.</p>
									</blockquote>
								</div>
							</div>
						</div>
					</div>
				</div>	
			</div>
		</div>

		<div class="colorlib-blog">
			<div class="container">
				<div class="row">
					<div class="col-md-8 col-md-offset-2 text-center colorlib-heading">
						<h2>Recent Blog</h2>
						<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<article class="article-entry">
							<a href="blog.html" class="blog-img" style="background-image: url(./resources/images/blog-1.jpg);background-size:100%;"></a>
							<div class="desc">
								<p class="meta"><span class="day">02</span><span class="month">Mar</span></p>
								<p class="admin"><span>Posted by:</span> <span>Noah Henderson</span></p>
								<h2><a href="blog.html">Openning Branches</a></h2>
								<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life</p>
							</div>
						</article>
					</div>
					<div class="col-md-4">
						<article class="article-entry">
							<a href="blog.html" class="blog-img" style="background-image: url(./resources/images/blog-2.jpg);background-size:100%;"></a>
							<div class="desc">
								<p class="meta"><span class="day">02</span><span class="month">Mar</span></p>
								<p class="admin"><span>Posted by:</span> <span>Noah Henderson</span></p>
								<h2><a href="blog.html">Openning Branches</a></h2>
								<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life</p>
							</div>
						</article>
					</div>
					<div class="col-md-4">
						<article class="article-entry">
							<a href="blog.html" class="blog-img" style="background-image:url(./resources/images/blog-3.jpg);background-size:100%;"></a>
							<div class="desc">
								<p class="meta"><span class="day">02</span><span class="month">Mar</span></p>
								<p class="admin"><span>Posted by:</span> <span>Noah Henderson</span></p>
								<h2><a href="blog.html">Openning Branches</a></h2>
								<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life</p>
							</div>
						</article>
					</div>
				</div>
			</div>
		</div>
		
		<div id="colorlib-subscribe">
			<div class="overlay"></div>
			<div class="container">
				<div class="row">
					<div class="col-md-8 col-md-offset-2">
						<div class="col-md-6 text-center">
							<h2><i class="icon-paperplane"></i>Sign Up for a Newsletter</h2>
						</div>
						<div class="col-md-6">
							<form class="form-inline qbstp-header-subscribe">
								<div class="row">
									<div class="col-md-12 col-md-offset-0">
										<div class="form-group">
											<input type="text" class="form-control" id="email" placeholder="Enter your email">
											<button type="submit" class="btn btn-primary">Subscribe</button>
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>  -->

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