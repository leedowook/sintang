<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<script type="text/javascript">
	function popupOpen() {
		url = "alertMemberView.jsp";
		name = "회원 정보";
		spece = "width=200,height=200,top=200,left=100,toolbar=no,menubar=no,scrollbars=no,resizable=yes";
		window.open(url, name, space);
		return false;
	}
	function memberDelete() {
	    var email = <%=session.getAttribute("email")%>; // serialize() : 입력된 모든Element(을)를 문자열의 데이터에 serialize 한다.
	    jQuery.ajax({
	        url: 'memberDelete',
	        type: 'POST',
	        data: email,
	        dataType: 'text',
	        success: function (xh) {
	        	window.close();
	        }
	    });
	}
</script>
<div class="container">
	<div class="row">
		<div class="white-box">
			<h3 class="box-title m-b-0">${viewMember.name}님의정보</h3>
			<p class="text-muted m-b-30 font-13">상세 정보</p>
			<div class="row">
				<div class="col-md-12">
					<table style="clear: both"
						class="table table-bordered table-striped" id="user">
						<tbody>
							<tr>
								<td width="35%">이름</td>
								<td width="65%">${viewMember.name}</td>
							</tr>
							<tr>
								<td>아이디</td>
								<td>${viewMember.email}</td>
							</tr>
							<tr>
								<td>비밀번호</td>
								<td>${viewMember.password}</td>
							</tr>
							<tr>
								<td>성별</td>
								<td>${viewMember.gender}</td>
							</tr>
							<tr>
								<td>나이</td>
								<td>${viewMember.age}</td>
							</tr>
							<tr>
								<td>인증 코드</td>
								<td>${viewMember.sha256}</td>
							</tr>
							<tr>
								<td>권한</td>
								<td>${viewMember.cheked}</td>
							</tr>
						</tbody>
					</table>
					<div>
						<a href="alertMemberView?email=${viewMember.email}"
							onclick="window.open(this.href,'회원 정보','width=1000, height=500');return false"><button
								class="btn btn-primary center-block">수정</button></a> <a
							href="memberDelete?email=${viewMember.email}">
							<input type="text" class ="btn btn-primary center-block" onclick="memberdleate()" value="회원삭제"/>
						</a>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>