<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<
<script type="text/javascript">
<!-- 회원 정보 수정 ajax//-->
<!-- function formSubmit() {
    var params = jQuery("#dopost").serialize(); // serialize() : 입력된 모든Element(을)를 문자열의 데이터에 serialize 한다.
    jQuery.ajax({
        url: 'memberalert',
        type: 'POST',
        data:params,
        dataType: 'text',
        success: function (xh) {
        	alert("수정 완료");
        	window.close();
        }
    });
} -->
</script>
<div class="container">
	<div class="row">
		<div class="white-box">
			<h3 class="box-title m-b-0">${viewMember.name}님의정보</h3>
			<p class="text-muted m-b-30 font-13">상세 정보</p>
			<div class="row">
				<div class="col-md-12">
					<form method="post" action="memberalert" id="dopost" name="dopost">
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
									<td><input type="text" name="password"
										placeholder="${viewMember.password}" id="password"></td>
								</tr>
								<tr>
									<td>성별</td>
									<td>${viewMember.gender}</td>
								</tr>
								<tr>
									<td>나이</td>
									<td><input type="text" name="age"
										placeholder="${viewMember.age}" id="age"></td>
								</tr>
								<tr>
									<td>인증 코드</td>
									<td>${viewMember.sha256}</td>
								</tr>
								<tr>
									<td>권한</td>
									<td><input type="text" name="cheked"
										placeholder="${viewMember.cheked}" id="cheked"></td>
								</tr>

							</tbody>
						</table>
						<div>
							<input type="hidden" value="${viewMember.email}" name="email">
							<input type="submit" value="수정하기" class="btn btn-warning" />
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>