package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import been.actionforward;
import been.*;
import been.em_box_userinfo;
import methodcode.selectpartdata;
import service.boxservice;

public class em_box_listdata implements action {
	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		System.out.println("견적함 리스트");
		HttpSession session=request.getSession();
		actionforward forward=new actionforward();
		selectpartdata spd=new selectpartdata();
		String id=(String)session.getAttribute("id");
		//모든 정보 조회를 위해 array list 2개 선언 1개는 작은 부분 나머지하나는 모두포함
		boxservice bsv=new boxservice();
		em_box_userinfo ebui;
		//서비스가 그런식으로 선언해놨고 처음부터 크게할경우 비효율적인부분도 생기며 메소드가 너무길어진다.
		ArrayList<em_box_main> eboxar=bsv.selectbox(id);
		ArrayList<em_box_userinfo> eboxall=new ArrayList<em_box_userinfo>();
		for(int i=0;i<eboxar.size();i++) {
			ebui=new em_box_userinfo();
			//각 작은 부분에대한 모든 파츠정보를 가져옴 
			System.out.println(eboxar.get(i).getId());
			ebui.setBox(eboxar.get(i));
			System.out.println("roop1"+ebui.getBox().getNum());
			eboxall.add(bsv.selectboxpartall(ebui));
			System.out.println("roop2"+eboxall.get(i).getMb().getMb_num());
		}
		System.out.println("roop3"+eboxall.get(0).getBox().getName());
		em_cpu cpu=null;
		em_ram ram=null;
		em_mainboard mainboard=null;
		em_vga vga=null;
		em_power pow=null;
		em_ssd ssd=null;
		em_hdd hdd=null;
		int i=0;
		for(i=0;i<eboxall.size();i++){
			System.out.println("check2:"+eboxall.get(i).getBox().isMb());
			System.out.println("check1:"+eboxall.get(i).getBox().getName());
		if(eboxall.get(i).getBox().isCpu()){ 
			
			cpu=new em_cpu();
			
			cpu=spd.selectcpu(eboxall.get(i).getCpu().getCpu_num());
	} 
	 if(eboxall.get(i).getBox().isRam()){
		ram=new em_ram();
		ram=spd.selectram(eboxall.get(i).getRam().getRam_num(),eboxall.get(i).getRam().getRam_mm());
	}
	 if(eboxall.get(i).getBox().isMb()){
		 mainboard=new em_mainboard();
		 System.out.println("roop4"+eboxall.get(i).getMb().getMb_num() );
		mainboard=spd.selectmainboard(eboxall.get(i).getMb().getMb_num());
	}
	 if(eboxall.get(i).getBox().isVga()){
		vga=new em_vga();
		vga=spd.selectvga(eboxall.get(i).getVga().getVga_num(),eboxall.get(i).getVga().getRam_mm());
	}
	if(eboxall.get(i).getBox().isPow()){
		pow=new em_power();
		pow=spd.selectpower(eboxall.get(i).getPow().getPower_num());
	}
	 if(eboxall.get(i).getBox().isSsd()){
		ssd=new em_ssd();
		ssd=spd.selectssd(eboxall.get(i).getSsd().getSsd_num(),eboxall.get(i).getSsd().getSsd_mm());
	}
	if(eboxall.get(i).getBox().isHdd()){
		hdd=new em_hdd();
		hdd=spd.selecthdd(eboxall.get(i).getHdd().getHdd_num(),eboxall.get(i).getHdd().getHdd_mm());
	}
		
		
		
		em_part_info epi=new em_part_info();
		epi.setCpu(cpu);
		epi.setMb(mainboard);
		epi.setPow(pow);
		epi.setHb(hdd);
		epi.setSb(ssd);
		epi.setRb(ram);
		epi.setVb(vga);
		
	
		request.setAttribute("part"+i,epi);
		i++;}
		
		request.setAttribute("arbox", eboxall);
		forward.setRedirect(false);
		forward.setPath("em_first_main/em_box_main.jsp");
		
		return forward;  
	}
	
}


