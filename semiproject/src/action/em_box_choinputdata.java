package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import been.*;
import methodcode.*;
import service.boxservice;
import service.inputpartdatabase;
public class em_box_choinputdata implements action {
	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		actionforward forward=null;
		session.getAttribute("id");//정보를 입력하기위해 아이디값받아옴
		selectpartdata mc=new selectpartdata();
		boxservice bsv=new boxservice(); 
		em_box_userinfo main= new em_box_userinfo();  
		//amd를 선택했는지 intel을 선택했는지 확인
		String cpucho=request.getParameter("cpu");
		String partnum[]=request.getParameterValues(cpucho);
		//해당 나눠지는 파트 번호가져옴
		String partcount[]=request.getParameterValues("partnum");
		//파츠수 가져옴
		int rammm=Integer.parseInt(request.getParameter(cpucho+"ram"));
		//램의 메모리가져옴
		String partelse[]=request.getParameterValues("elsepart");
		String elsenum[]=request.getParameterValues("elsenum");
		int vgamm=Integer.parseInt(request.getParameter("elsepartvga"));
		int hddmm=Integer.parseInt(request.getParameter("elseparthdd"));
		int ssdmm=Integer.parseInt(request.getParameter("elsepartssd"));
		
		
		//해당을 각부품별로 분류 
		//각 부품 인덱스 번호를 같게두었음 
		
		for(int i=0;i<partnum.length;i++) {
			if(partnum[i].substring(0,1).equals("c")) {
				String cpunum=partnum[i];
				if(!(request.getParameter("partcount").equals("0"))) {
					main.getBox().setCpu(true);
					em_box_cpu cpu_box=new em_box_cpu();
					cpu_box.setCpu_num(cpunum);
					cpu_box.setCount(Integer.parseInt(partcount[i]));
					cpu_box.setPrice(cpu_box.getCount()*mc.selectcpu(partnum[i]).getPrice());
					main.setCpu(cpu_box);
				}
			}else if(partnum[i].substring(0,1).equals("m")) {
				String mainnum=partnum[i];
				if(!(request.getParameter("partcount").equals("0"))) {
					main.getBox().setMb(true);
					em_box_mainboard mb_box=new em_box_mainboard();
					mb_box.setMb_num(mainnum);
					mb_box.setCount(Integer.parseInt(partcount[i]));
					mb_box.setPrice(mb_box.getCount()*mc.selectmainboard(partnum[i]).getPrice());
					main.setMb(mb_box);
				}
			}else if(partnum[i].substring(0,1).equals("r")) {
				String ramnum=partnum[i];
				if(!(request.getParameter("ramcount").equals("0"))) {
					main.getBox().setRam(true);
					em_box_ram ram_box=new em_box_ram();
					
					ram_box.setRam_num(ramnum);
					ram_box.setCount(Integer.parseInt(partcount[i]));
					ram_box.setPrice(mc.selectram(ramnum, rammm).getPrice()*ram_box.getCount());
					ram_box.setRam_mm(rammm);
					main.setRam(ram_box);
				}}
			}
			
		for(int i=0;i<partelse.length;i++) {
			if(partelse[i].substring(0,1).equals("v")) {
			String vganum=partelse[i];
			if(!(request.getParameter("vgacount").equals("0"))) {
				main.getBox().setVga(true);
				em_box_vga vga_box=new em_box_vga();
				
				vga_box.setVga_num(vganum);
				vga_box.setCount(Integer.parseInt(elsenum[i]));
				vga_box.setPrice(mc.selectram(vganum, vgamm).getPrice()*vga_box.getCount());
				vga_box.setRam_mm(vgamm);
				main.setVga(vga_box);
			}}
			else if(partelse[i].substring(0,1).equals("h")) {
				String ramnum=partelse[i];
				if(!(request.getParameter("ramcount").equals("0"))) {
					main.getBox().setRam(true);
					em_box_ram ram_box=new em_box_ram();
					
					ram_box.setRam_num(ramnum);
					ram_box.setCount(Integer.parseInt(elsenum[i]));
					ram_box.setPrice(mc.selectram(ramnum, rammm).getPrice()*ram_box.getCount());
					ram_box.setRam_mm(rammm);
					main.setRam(ram_box);
				}}
			else if(partelse[i].substring(0,1).equals("s")) {
				String ramnum=partelse[i];
				if(!(request.getParameter("ramcount").equals("0"))) {
					main.getBox().setRam(true);
					em_box_ram ram_box=new em_box_ram();
					
					ram_box.setRam_num(ramnum);
					ram_box.setCount(Integer.parseInt(elsenum[i]));
					ram_box.setPrice(mc.selectram(ramnum, rammm).getPrice()*ram_box.getCount());
					ram_box.setRam_mm(rammm);
					main.setRam(ram_box);
				}}
			else if(partelse[i].substring(0,1).equals("p")) {
			String mainnum=partelse[i];
			if(!(request.getParameter("elsenum").equals("0"))) {
				main.getBox().setMb(true);
				em_box_mainboard mb_box=new em_box_mainboard();
				mb_box.setMb_num(mainnum);
				mb_box.setCount(Integer.parseInt(elsenum[i]));
				mb_box.setPrice(mb_box.getCount()*mc.selectmainboard(partelse[i]).getPrice());
				main.setMb(mb_box);
			}
			}}
		boolean result=bsv.updateboxpart(main);
		
		if(result) {
			System.out.println("추천 받은 견적에 있는 정보 입력 성공");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('견적함에 입력성공')");
			out.println("history.back()</script>");
			
		}
		else {
			System.out.println("추천받은 견적 입력 실패");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('입력실패')");
			out.println("history.back()</script>");
		}
		
		
			
			
		
		
		return forward;
	}
	
}


