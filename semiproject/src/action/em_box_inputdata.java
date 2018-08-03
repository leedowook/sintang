package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import been.*;

public class em_box_inputdata implements action {
	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		actionforward forward=null;
		
		em_box_main main= new em_box_main();
		String cpucho=request.getParameter("cpu");
		String partnum[]=request.getParameterValues(cpucho);
		int rammm=Integer.parseInt(request.getParameter(cpucho+"ram"));
		String partelse[]=request.getParameterValues("elsepart");
		int vgamm=Integer.parseInt(request.getParameter("elsepartvga"));
		int hddmm=Integer.parseInt(request.getParameter("elseparthdd"));
		int ssdmm=Integer.parseInt(request.getParameter("elsepartssd"));
		
		if(request.getParameter("ramcount").equals("0")) {
			main.setRam(true);
			em_box_ram ram_box=new em_box_ram();
			ram_box.setRam_num(ram.getNum());
			ram_box.setNum(num);
		}
		return forward;
	}
	
}


