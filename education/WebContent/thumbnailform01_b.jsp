<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.awt.image.BufferedImage" %>
 <%@ page import="javax.media.jai.JAI" %>
 <%@ page import="javax.media.jai.RenderedOp" %>
 <%@ page import="javax.imageio.ImageIO"%>
 <%@ page import="com.oreilly.servlet.MultipartRequest"%>
 <%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
 <%@ page import="java.util.*"%>
 <%@ page import="java.io.*"%>
 <%@ page import="java.awt.Graphics2D" %>
 <%@ page import="java.awt.image.renderable.ParameterBlock" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//이미지 어볼드 폴더경로 설정
ServletContext context=request.getServletContext();
String imagePath= context.getRealPath("image");

int size=1*1024*1024;
String filename="";

try{
	MultipartRequest multi=new MultipartRequest(request,
				imagePath,
				size,
				"UTF-8",
				new DefaultFileRenamePolicy()) ;
	Enumeration files=multi.getFileNames();
	
	String file=(String)files.nextElement();
	filename=multi.getFilesystemName(file);
	
	
	
}catch(Exception e){
e.printStackTrace();	
	
}
//업로드한 이미지 파일을 섬네일형태로 변경해주는 과정
ParameterBlock pb=new ParameterBlock();
pb.add(imagePath+"/"+filename);
RenderedOp rOp=JAI.create("fileload",pb);
BufferedImage bi=rOp.getAsBufferedImage();


//섬네일 이미지 사이즈를 100x100으로 설정
BufferedImage thumb=new BufferedImage(
		100,100,BufferedImage.TYPE_INT_RGB
		);

//원본 이미지를 섬네일 이미지로 그리는 작업 draw
Graphics2D g=thumb.createGraphics();
g.drawImage(bi,0,0,100,100,null);//사이즈 지정?

File file=new File(imagePath+"/sm_"+filename);
//지정한걸 sm붙여서 저장해줌
ImageIO.write(thumb,"jpg",file);//파일,확장자,위치이름
%>
원본이미지
<img src="image/<%=filename %>"><br>
섬네일 이미지
<img src="image/sm_<%=filename %>"><br>
</body>
</html>