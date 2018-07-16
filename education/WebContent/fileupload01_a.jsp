<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.util.*" %> 
<%@page import="java.io.*" %>
<%
	//서버 상의 업로드 경로 지정
	String uploadPath=request.getRealPath("/upload");
//파일사이즈 지정을 위한 정수형 변수 선언
int size=10*1024*1024;   //10*10^3*10^3 10메가바이트
String name="";
String subject="";
String filename1="";
String filename2="";
String origfilename1="";
String origfilename2="";
try{
	MultipartRequest multi= new MultipartRequest(//멀티 파츠 리퀘스트 설정할떄 내용은 이런식
				request,//업로드 받은내용(클라이언트의 요청 내용들)
				uploadPath,//어디다 업로드를 할것이냐
				size,//파일 사이즈
				"UTF-8",//한글 처리 인코딩 방식
				new DefaultFileRenamePolicy()//파일이 중복되서 올라왔을떄 처리방법 4번쨰줄꺼
			);
	//클라이언트가 올린사람에 입력한 값 가져오기
	name=multi.getParameter("name");
	//클라이언트가 제목에 입력한 값 가져오기
	subject=multi.getParameter("subject");
	//클라이언트가 입력한 파일들의 이름 가져오기
	Enumeration files=multi.getFileNames();
	//첫번쨰 파일의 이름 가져오기
	String file1=(String)files.nextElement();
	//첫번째 파일의 서버 상에 있는 파일명 가져오기
	filename1=multi.getFilesystemName(file1);
	
	//첫번쨰 파일의 클라이언트가 업로드 한 원본 파일명 가져오기
	origfilename1=multi.getOriginalFileName(file1);
	
	//두번쨰 파일의 서버 상에 있는 파일명 가져오기
	String file2=(String)files.nextElement();
	//두번째 파일의 서버 상에 있는 파일명 가져오기
	filename2=multi.getFilesystemName(file2);
	
	//두번째 파일의 클라이언트가 업로드 한 원본 파일명 가져오기
	origfilename2=multi.getOriginalFileName(file2);
}	catch(Exception e){
	e.printStackTrace();
}
System.out.print(filename1+"FDSG");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="filecheck" action="filedownload.jsp" method="post">
<input type="hidden" name="name" value="<%=name %>">
<input type="hidden" name="subject" value="<%=subject%>">
<input type="hidden" name="filename1" value="<%=filename1%>">
<input type="hidden" name="filename2" value="<%=filename2 %>">
<input type="hidden" name="origfilename1" value="<%=origfilename1%>">
<input type="hidden" name="origfilename2" value="<%=origfilename2%>">

</form>
<a href="#" onclick="javascript:filecheck.submit()">
업로드 확인 및 다운로드페이지이동</a>
</body>
</html>