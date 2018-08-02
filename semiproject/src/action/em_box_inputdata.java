package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import been.*;

public class em_box_inputdata implements action {
	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		actionforward forward=null;
		
		em_box_main main= new em_box_main();
		String cho=request.getParameter("cpu");
		em_hdd hdd=(em_hdd)request.getAttribute("hdd");
		em_mainboard mainboard=(em_mainboard)request.getAttribute(cho+"mainboard");
		em_ram ram=(em_ram)request.getAttribute(cho+"ram");
		em_cpu cpu=(em_cpu)request.getAttribute(cho+"cpu");
		em_vga vga=(em_vga)request.getAttribute("vga");
		em_power power=(em_power)request.getAttribute("power");
	
		if(request.getParameter("ramcount").equals("0")) {
			main.setRam(true);
			em_box_ram ram_box=new em_box_ram();
			ram_box.setRam_num(ram.getNum());
			ram_box.setNum(num);
		}
		return forward;
	}
	
}


