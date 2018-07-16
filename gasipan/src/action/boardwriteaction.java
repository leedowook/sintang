package action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import been.boardbean;
import service.boardwriteservice;
import been.actionforward;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.util.*;
import java.io.*;

public class boardwriteaction implements action {

	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String realpath="";
		String savepath="/boardupload";
		ServletContext context=request.getServletContext();
		realpath=context.getRealPath(savepath);
		
		
		actionforward forward=null;
		boardbean bb=new boardbean();
		boardwriteservice bs=new boardwriteservice();
		
		
		int size=100*1024*1024;
		
		try{
			MultipartRequest multi= new MultipartRequest(//멀티 파츠 리퀘스트 설정할떄 내용은 이런식
						request,//업로드 받은내용(클라이언트의 요청 내용들)
						realpath,//어디다 업로드를 할것이냐
						size,//파일 사이즈
						"UTF-8",//한글 처리 인코딩 방식
						new DefaultFileRenamePolicy()//파일이 중복되서 올라왔을떄 처리방법 4번쨰줄꺼
					);
			
			
		bb.setName(multi.getParameter("name"));
		bb.setPassword(multi.getParameter("password"));
		bb.setSubject(multi.getParameter("subject"));
		bb.setContent(multi.getParameter("content"));
		if(request.getParameter("property").equals("recoment")){
			//답글처리과정
			bb.setReref(Integer.parseInt(multi.getParameter("reref")));
			bb.setReseq(Integer.parseInt(multi.getParameter("reseq")));
			bb.setRelev(Integer.parseInt(multi.getParameter("relev")));
				
			}
		
		
		String file=(String)multi.getFileNames().nextElement();
		String orgfilename=multi.getOriginalFileName(file);
		bb.setFile(orgfilename);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		//일반 처리과정
		boolean writeresult =bs.registarticle(bb);
		if(writeresult) {
			forward=new actionforward();
			forward.setRedirect(true);
			forward.setPath("boardList.bo?page=1");
			
		}else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('회원가입실패')");
			out.println("history.back()</script>");
			
		}
		return forward;
	}
	

}
