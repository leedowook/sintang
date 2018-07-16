package action;

import java.io.*;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import been.actionforward;

public class boardfiledownaction implements action{

	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String fileName=request.getParameter("file");
		String savepath="boardupload";//업로드 경로
		ServletContext context=request.getServletContext();
		//서버상 실제경로를 가져오는 부분
		String sDownloadPath=context.getRealPath(savepath);
		//다운로드 할 파일의 전체 경로값을 지정하는 부분
		String sFilePath=sDownloadPath+"\\"+fileName;
		//한번에 읽고 출력할 사이즈 지정
		byte b[]=new byte[4096];
		FileInputStream in=new 	FileInputStream(sFilePath);
		String smietype=request.getServletContext().getMimeType(sFilePath);
		System.out.println("smietype>>"+smietype);
		
		if(smietype==null) {
			smietype="appplication/octet-stream";}
			response.setContentType(smietype);
			String agent=request.getHeader("User-Agent");
			
		//브라우저의 종류가 explorer인지 판단하는 부분
		boolean ieBrowser=(agent.indexOf("MSIE")>-1)||(agent.indexOf("Trident")>-1);
		
		if(ieBrowser){
			fileName=URLEncoder.encode(fileName,"UTF-8").replaceAll("\\+","%20");
		
			
		}else{
			fileName=new String(fileName.getBytes("UTF-8"),"iso-8859-1");
		}
		response.setHeader("Content-Disposition","attachment; filename="+fileName);
		ServletOutputStream out2=response.getOutputStream();
		int numRead;
		while((numRead=in.read(b,0,b.length))!=-1){
			out2.write(b,0,numRead);
			
			
		}
		out2.flush();
		out2.close();
		in.close();
			
		
		return null;
	}
	
}
