<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.choju.fpro.vo.MemberVO"%>
<%@ page import="java.util.*,java.text.*"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SZ Admin page</title>

<!-- Bootstrap core CSS-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/Admin/vendor/bootstrap/css/bootstrap.min.css">

<!-- Custom fonts for this template-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/Admin/vendor/fontawesome-free/css/all.min.css">
<!-- Page level plugin CSS-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/Admin/vendor/datatables/dataTables.bootstrap4.css">
<!-- Custom styles for this template-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/Admin/css/sb-admin.css">

</head>
<script type="text/javascript">
	function popupOpen() {
		url = "memberView.jsp";
		name = "회원 정보";
		spece = "width=200,height=200,top=200,left=100,toolbar=no,menubar=no,scrollbars=no,resizable=yes";
		window.open(url, name, space);
		return false;
	}
</script>
<body id="page-top">

	<nav class="navbar navbar-expand navbar-dark bg-dark static-top">

		<a class="navbar-brand mr-1" href="Admin">SZ Admin page</a>

		<button class="btn btn-link btn-sm text-white order-1 order-sm-0"
			id="sidebarToggle" href="#">
			<i class="fas fa-bars"></i>
		</button>

		<!-- Navbar Search -->
		<form
			class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
			<div class="input-group">
				<input type="text" class="form-control" placeholder="Search for..."
					aria-label="Search" aria-describedby="basic-addon2">
				<div class="input-group-append">
					<button class="btn btn-primary" type="button">
						<i class="fas fa-search"></i>
					</button>
				</div>
			</div>
		</form>

		<!-- Navbar -->
		<ul class="navbar-nav ml-auto ml-md-0">
			<li class="nav-item dropdown no-arrow mx-1"><a
				class="nav-link dropdown-toggle" href="#" id="alertsDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-bell fa-fw"></i> <span
					class="badge badge-danger">9+</span>
			</a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="alertsDropdown">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Something else here</a>
				</div></li>
			<li class="nav-item dropdown no-arrow mx-1"><a
				class="nav-link dropdown-toggle" href="#" id="messagesDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-envelope fa-fw"></i> <span
					class="badge badge-danger">7</span>
			</a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="messagesDropdown">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Something else here</a>
				</div></li>
			<li class="nav-item dropdown no-arrow"><a
				class="nav-link dropdown-toggle" href="#" id="userDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-user-circle fa-fw"></i>
			</a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="userDropdown">
					<a class="dropdown-item" href="#">Settings</a> <a
						class="dropdown-item" href="#">Activity Log</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#" data-toggle="modal"
						data-target="#logoutModal">Logout</a>
				</div></li>
		</ul>

	</nav>

	<div id="wrapper">

		<!-- Sidebar -->
		<ul class="sidebar navbar-nav">
			<li class="nav-item active"><a class="nav-link"
				href="index.html"> <i class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span>
			</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="pagesDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-fw fa-folder"></i> <span>Pages</span>
			</a>
				<div class="dropdown-menu" aria-labelledby="pagesDropdown">
					<h6 class="dropdown-header">Login Screens:</h6>
					<a class="dropdown-item" href="logout">Log out</a> <a
						class="dropdown-item" href="Join">Register</a> <a
						class="dropdown-item" href="forgot-password.html">Forgot
						Password</a>
					<div class="dropdown-divider"></div>
					<h6 class="dropdown-header">Other Pages:</h6>
					<a class="dropdown-item" href="404.html">404 Page</a> <a
						class="dropdown-item" href="blank.html">Blank Page</a>
				</div></li>
			<li class="nav-item"><a class="nav-link" href="charts"> <i
					class="fas fa-fw fa-chart-area"></i> <span>Charts</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="memberList">
					<i class="fas fa-fw fa-table"></i> <span>MemberList</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="allboard">
					<i class="fas fa-fw fa-table"></i> <span>All Board</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="AdminAddSeat">
					<i class="fas fa-fw fa-table"></i> <span>AddSeat</span>
			</a></li>
		</ul>

		<div id="content-wrapper">
			<div class="container-fluid">
				<!-- DataTables Example -->
				<div class="card mb-3">
					<div class="card-header">
						<i class="fas fa-table"></i>Youser 목록
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-bordered" id="dataTable" width="100%"
								cellspacing="0">
								<thead>
									<tr>
										<th>Eamil</th>
										<th>Name</th>
										<th>age</th>
										<th>Nickname</th>
										<th>Power</th>
									</tr>
								</thead>
								<tfoot>
									<tr>
										<th>Eamil</th>
										<th>Name</th>
										<th>age</th>
										<th>Nickname</th>
										<th>Power</th>
									</tr>
								</tfoot>
								<tbody>
									<c:forEach var="member" items="${memberList}">
										<tr align=center>
											<td><a href="memberView?email=${member.email}"
												onclick="window.open(this.href,'회원 정보','width=1000, height=500');return false">${member.email}</a></td>
											<td>${member.name}</td>
											<td>${member.age}</td>
											<td>${member.nickname}</td>
											<td>${member.cheked}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<div class="card-footer small text-muted">
						Update 시간 &nbsp&nbsp&nbsp<%
						java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy년MM월dd일HH시mm분");
						String today = formatter.format(new java.util.Date());
						out.println(today);
					%>
					</div>
				</div>

			</div>
			<!-- /.container-fluid -->

			<!-- Sticky Footer -->
			<footer class="sticky-footer">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright Â© Your Website 2018</span>
					</div>
				</div>
			</footer>

		</div>
		<!-- /.content-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">Ã</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login.html">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script
		src="<c:url value="/resources/Admin/vendor/jquery/jquery.min.js"/>"></script>
	<script
		src="<c:url value="/resources/Admin/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
	<!-- Core plugin JavaScript-->
	<script
		src="<c:url value="/resources/Admin/vendor/jquery-easing/jquery.easing.min.js"/>"></script>
	<!-- Page level plugin JavaScript-->
	<script
		src="<c:url value="/resources/Admin/vendor/chart.js/Chart.min.js"/>"></script>
	<script
		src="<c:url value="/resources/Admin/vendor/datatables/jquery.dataTables.js"/>"></script>
	<script
		src="<c:url value="/resources/Admin/vendor/datatables/dataTables.bootstrap4.js"/>"></script>

	<!-- Custom scripts for all pages-->
	<script src="<c:url value="/resources/Admin/js/sb-admin.min.js"/>"></script>

	<!-- Demo scripts for this page-->
	<script
		src="<c:url value="/resources/Admin/js/demo/datatables-demo.js"/>"></script>
	<script
		src="<c:url value="/resources/Admin/js/demo/chart-area-demo.js"/>"></script>

</body>

</html>
