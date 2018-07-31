package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import been.*;

import service.benchservice;

public class emchoiceaction_main implements action{

	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("게임사양emchoiceaciton_main 에접속");
		actionforward forward=null;
		em_cho_gamespec ecgs;
		benchservice bsv=new benchservice();
		//받아야할값: 게임들에 대한 각각의 선택 
		//중간 처리에해야 할값: sql에 저장된 각 게임 사양에 살짝 상위의 값싼 스펙 정보 필요
		//cpu를 기준으로 맞는것을 찾아 골라내어 arraylist로 각각반환
		//게임 장르가 rpg 나 오픈월드 형식, 시뮬레이션 글자를 포함할경우 ssd 넘겨줘야하니깐
		//내보내야할값 :해당 받아온 것을 request 로 넘겨줌 arraylist 사용하는 이유는 해당에 대한 정보를 자세히 보고싶을때나 견적함에 추가하기 위해서
		System.out.println(request.getParameter("g1"));
		int max=10,k=1;
		String kind=" ";
		ArrayList<em_cho_gamespec> gamear=new ArrayList<>(); 
		for(int i=1;i<=max;i++) {
			
					
			System.out.println(request.getParameter("g"+i));
			String sayang=request.getParameter("g"+i);
			if(!(sayang.equals("no"))) {
				k++;
				ecgs=new em_cho_gamespec();
				if(sayang.equals("high")) {
					ecgs=bsv.benchsgame(i,3);
				}
				else if(sayang.equals("middle")) {
					ecgs=bsv.benchsgame(i,2);
				}
				else if(sayang.equals("low")) {
					ecgs=bsv.benchsgame(i,1);
				}
				kind+=ecgs.getGamekind();
				gamear.add(ecgs);
			}
			
		}
		ecgs=gamear.get(0);
		for(int i=1;i<k-1;i++) {
			if(ecgs.getCpu_ck()<gamear.get(i).getCpu_ck()) {
				ecgs.setCpu_ck(gamear.get(i).getCpu_ck());
			};
			if(ecgs.getCpu_core()<gamear.get(i).getCpu_core()) {
				ecgs.setCpu_core(gamear.get(i).getCpu_core());
			};
			if(ecgs.getCpu_td()<gamear.get(i).getCpu_td()) {
				ecgs.setCpu_td(gamear.get(i).getCpu_td());
			};
			if(ecgs.getVga_shaders()<gamear.get(i).getVga_shaders()) {
				ecgs.setVga_shaders(gamear.get(i).getVga_shaders());
			};
			if(ecgs.getVga_tmus()<gamear.get(i).getVga_tmus()) {
				ecgs.setVga_tmus(gamear.get(i).getVga_tmus());
			};
			if(ecgs.getVga_rops()<gamear.get(i).getVga_rops()) {
				ecgs.setVga_rops(gamear.get(i).getVga_rops());
			};
			if(ecgs.getVga_ram()<gamear.get(i).getVga_ram()) {
				ecgs.setVga_ram(gamear.get(i).getVga_ram());
			};
			if(ecgs.getVga_ck()<gamear.get(i).getVga_ck()) {
				ecgs.setVga_ck(gamear.get(i).getVga_ck());
			};
			if(ecgs.getRam_ck()<gamear.get(i).getRam_ck()) {
				ecgs.setRam_ck(gamear.get(i).getRam_ck());
			};
			if(ecgs.getRam_mm()<gamear.get(i).getRam_mm()) {
				ecgs.setRam_mm(gamear.get(i).getRam_mm());
			};
		}
		int option=Integer.parseInt(request.getParameter("mainboard"));
		int hardoption=Integer.parseInt(request.getParameter("hard"));
		
		ecgs.setGamename("all");
		ecgs.setSpec(4);
		ecgs.setG_num(0);
		String maker=null;
		String size=null;
		int slot=0;
		em_cpu cpulist;
		em_mainboard mblist;
		em_ram ram;
		em_vga vga=bsv.benchgamevga(ecgs);
		request.setAttribute("vga", vga);
		//cpu 인텔
		maker="intel";
		cpulist=new em_cpu();
		mblist=new em_mainboard();
		ram=new em_ram();
		cpulist=bsv.benchgamecpu(ecgs,maker);
		size=cpulist.getSize();
		//cpu사이즈와 맞는 메인보드 찾기
		mblist=bsv.benchgamemb(ecgs,size,option);
		//메인보드의 슬롯에따라 ram의 크기 결정 
		slot=mblist.getRam_mnum();
		ram=bsv.benchgameram(ecgs,slot);
		request.setAttribute("it_cpu",cpulist);
		request.setAttribute("it_mb",mblist);
		request.setAttribute("it_ram",ram);
		//cpu 암드
		maker="amd";
		
		cpulist=new em_cpu();
		mblist=new em_mainboard();
		cpulist=bsv.benchgamecpu(ecgs,maker);
		size=cpulist.getSize();
		mblist=bsv.benchgamemb(ecgs,size,option);
		slot=mblist.getRam_mnum();
		ram=bsv.benchgameram(ecgs,slot);
		request.setAttribute("am_cpu",cpulist);
		request.setAttribute("am_mb",mblist);
		request.setAttribute("am_ram",ram);
		//그래픽에 따른 전격사용량
		double wat=(int)vga.getTdp()*2.5+150;
		if(hardoption!=0) {
		em_hdd hdd=bsv.benchgamehdd(ecgs,hardoption);
		request.setAttribute("hdd",hdd);}
		else {
			request.setAttribute("hdd","no");}
		if(kind.contains("ssd")) {
		em_ssd ssd=bsv.benchgamessd(ecgs);
		request.setAttribute("ssd", ssd);
		}
		else {request.setAttribute("ssd","no");}
		em_power pow=bsv.benchgamepower(ecgs,wat);
		request.setAttribute("power", pow);
		forward.setPath("/em_cho.jsp");
		return forward;
	}

}
