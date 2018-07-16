<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String gid="sss";
String gpw="kkk";
String id=(String)request.getParameter("id");
String pw=(String)request.getParameter("pw");

if(id.equals("")||pw.equals("")){//비어있을떄

	{%><script>alert('거절')
		location.href("loginform.jsp");
		</script><%	}
}

else{
	if(id.equals(gid)){//아이디일치여부확인
		if(pw.equals(gpw)){//비밀번호 일치 여부 확인
			session.setAttribute("id",id);
			session.setAttribute("pw",pw);
			%><script>location.href("logmain.jsp");</script><%

			
		}
		else{
			{%><script>alert('거절')
		location.href("loginform.jsp");
		</script><%	}
		}
		}
	else{%><script>alert('거절')
		location.href("loginform.jsp");
		</script><%	}
	}
	
	


%>

</body>
</html>