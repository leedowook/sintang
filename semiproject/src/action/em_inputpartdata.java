package action;

import java.io.PrintWriter;
import java.sql.Date;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import been.actionforward;
import been.em_cpu;
import been.em_vga;
import been.em_vga_spec;
import service.inputpartdatabase;
import been.*;
public class em_inputpartdata implements action {
	
	@SuppressWarnings("null")
	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		actionforward forward=null;
		System.out.println(request.getParameter("part"));
		inputpartdatabase ippdb;
		if("cpu".equals(request.getParameter("part"))) {
			ippdb=new inputpartdatabase();
			
			em_cpu cpubean=new em_cpu();
			
			System.out.println("cpu 입력 action");
			cpubean.setMaker((String)request.getParameter("maker"));
			cpubean.setCodename((String)request.getParameter("codename"));
			cpubean.setBrand((String)request.getParameter("brand"));
			cpubean.setName((String)request.getParameter("name"));
			cpubean.setOver((String)request.getParameter("over"));
			cpubean.setSize((String)request.getParameter("size"));
			cpubean.setPrice(Integer.parseInt(request.getParameter("price")));
			cpubean.setCore(Integer.parseInt(request.getParameter("core")));
			cpubean.setTd(Integer.parseInt(request.getParameter("td")));
			cpubean.setL2cashm(Integer.parseInt(request.getParameter("l2cashm")));
			cpubean.setL3cashm(Integer.parseInt(request.getParameter("l3cashm")));
			cpubean.setTdp(Integer.parseInt(request.getParameter("tdp")));
			cpubean.setCk(Double.parseDouble(request.getParameter("ck")));
			cpubean.setSysbus(Integer.parseInt(request.getParameter("sysbus")));
			cpubean.setMaxck(Double.parseDouble(request.getParameter("maxck")));
			
			cpubean.setGpu(Boolean.parseBoolean(request.getParameter("gpu")));
			
		
			boolean result=ippdb.inputcpudata(cpubean);
			if(result) {
				forward=new actionforward();
				forward.setRedirect(true);
				forward.setPath("cpu_inputdata.jsp");
			}
			else {
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter out=response.getWriter();
				out.println("<script>");
				out.println("alert('입력실패')");
				out.println("history.back()</script>");
			}
		}
		else if("vga".equals(request.getAttribute("part"))) {
			ippdb=new inputpartdatabase();
			
			em_vga vb=new em_vga();
			em_vga_spec vs=new em_vga_spec();
			System.out.println("vga 입력 action");
			vb.setMaker((String)request.getAttribute("maker"));
			vb.setName((String)request.getAttribute("codename"));
			vb.setItf((String)request.getAttribute("brand"));
			vb.setChip((String)request.getAttribute("Chip"));
			vb.setChipmaker((String)request.getAttribute("Chipmaker"));
			vb.setChipgroup((String)request.getAttribute("Chipgroup"));
			vb.setSupport((String)request.getAttribute("support"));
			vb.setShaders((int)request.getAttribute("core"));
			vb.setTmus((int)request.getAttribute("td"));
			vb.setRops((int)request.getAttribute("l2cashm"));
			vb.setKind((String)request.getAttribute("l3cashm"));
			vb.setHigh((int)request.getAttribute("tdp"));
			vb.setLength((int)request.getAttribute("core"));
			vb.setSize((int)request.getAttribute("core"));
			vb.setHdmi((String)request.getAttribute("core"));
			vb.setBirth((Date)request.getAttribute("Birth"));
			vb.setMaxck((double)request.getAttribute("maxck"));
			vs.setRam_ck((int)request.getAttribute("Ram_ck"));
			vs.setRam_bus((int)request.getAttribute("Ram_bus"));
			vs.setRam_mm((int)request.getAttribute("Ram_mm"));
			vs.setKind((int)request.getAttribute("kind"));
			vs.setTdp((int)request.getAttribute("tdp"));
			vs.setPrice((int)request.getAttribute("price"));
			boolean result=ippdb.inputvgadata(vb,vs);
			if(result) {
				forward=new actionforward();
				forward.setPath("vga_inputdata.jsp");
			}
			else {
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter out=response.getWriter();
				out.println("<script>");
				out.println("alert('입력실패')");
				out.println("history.back()</script>");
			}
		}
		else if("power".equals(request.getAttribute("part"))) {
			em_power powerbean=new em_power();
			
			ippdb=new inputpartdatabase();
			System.out.println("power입력");
			powerbean.setNum((String)request.getParameter("num"));
			powerbean.setMaker((String)request.getParameter("maker"));
			powerbean.setKind((String)request.getParameter("kind"));
			powerbean.setEplus((String)request.getParameter("eplus"));
			powerbean.setPower(Integer.parseInt(request.getParameter("power")));
			powerbean.setFpinide_num(Integer.parseInt(request.getParameter("fpinid_num")));
			powerbean.setSata_num(Integer.parseInt(request.getParameter("sata_num")));
			powerbean.setPcie_num(Integer.parseInt(request.getParameter("pcie_num")));
			powerbean.setPrice(Integer.parseInt(request.getParameter("price")));
			boolean result=ippdb.inputpowerdata(powerbean);
		
		}
		else if("mainboard".equals(request.getAttribute("part"))) {
			ippdb=new inputpartdatabase();
			System.out.println("메인보드입력");
			em_mainboard mainboardbean=new em_mainboard();
			mainboardbean.setMaker((String)request.getParameter("maker"));
			mainboardbean.setName((String)request.getParameter("name"));
			mainboardbean.setBrand((String)request.getParameter("brand"));
			mainboardbean.setLan(Integer.parseInt(request.getParameter("lan")));
			mainboardbean.setCpu_size((String)request.getParameter("cpu_size"));
			mainboardbean.setChip_group((String)request.getParameter("chip_group"));
			mainboardbean.setChip_group_b((String)request.getParameter("chip_group_b"));
			mainboardbean.setRam_kind((String)request.getParameter("ram_kind"));
			mainboardbean.setPs2((String)request.getParameter("ps2"));
			mainboardbean.setPowertype(Integer.parseInt(request.getParameter("powertype")));
			mainboardbean.setPrice(Integer.parseInt(request.getParameter("price")));
			mainboardbean.setSata3(Integer.parseInt(request.getParameter("sata3")));
			mainboardbean.setSata2(Integer.parseInt(request.getParameter("sata2")));
			mainboardbean.setPcieslot_n(Integer.parseInt(request.getParameter("pcieslot_n")));
			mainboardbean.setPcie3x16_n(Integer.parseInt(request.getParameter("pcies3x16_n")));
			mainboardbean.setPcie3x8_n(Integer.parseInt(request.getParameter("pcie3x8_n")));
			mainboardbean.setPcie3x1_n(Integer.parseInt(request.getParameter("pcie3x1_n")));
			mainboardbean.setPciex6_n(Integer.parseInt(request.getParameter("pciex6_n")));
			mainboardbean.setPciex4_n(Integer.parseInt(request.getParameter("pciex4_n")));
			mainboardbean.setPciex1_n(Integer.parseInt(request.getParameter("pciex1_n")));
			mainboardbean.setRam_ck(Integer.parseInt(request.getParameter("ram_ck")));
			mainboardbean.setRam_mm(Integer.parseInt(request.getParameter("ram_mm")));
			mainboardbean.setRam_mnum(Integer.parseInt(request.getParameter("ram_mnum")));
			mainboardbean.setRam_ch(Integer.parseInt(request.getParameter("ram_ch")));
			mainboardbean.setM2_num(Integer.parseInt(request.getParameter("m2_num")));
			mainboardbean.setUsb1gen(Integer.parseInt(request.getParameter("usb1gen")));
			mainboardbean.setUsb2gen(Integer.parseInt(request.getParameter("usb2gen")));
			boolean result=ippdb.inputmainboarddata(mainboardbean);
		}
		else if("ram".equals(request.getAttribute("part"))) {
			ippdb=new inputpartdatabase();
			System.out.println("램입력");
			em_ram rb=new em_ram();
			em_ram_mm rm=new em_ram_mm();
			rb.setMaker((String)request.getParameter("maker"));
			rb.setKind((String)request.getParameter("kind"));
			rb.setCk(Integer.parseInt(request.getParameter("maker")));
			rm.setMemory(Integer.parseInt(request.getParameter("memory")));
			rm.setPrice(Integer.parseInt(request.getParameter("price")));
			boolean result=ippdb.inputramdata(rb,rm);
		}
		else if("hdd".equals(request.getAttribute("part"))) {
			ippdb=new inputpartdatabase();
			System.out.println("하드입력");
			em_hdd hb=new em_hdd();
			em_hdd_memory hm=new em_hdd_memory();
			hb.setMaker((String)request.getParameter("maker"));
			hb.setKind((String)request.getParameter("kind"));
			hb.setItf((String)request.getParameter("interface"));
			hb.setPlatter(Integer.parseInt(request.getParameter("platter")));
			hb.setDisk_num(Integer.parseInt(request.getParameter("disk_num")));
			hb.setBuffer_mm(Integer.parseInt(request.getParameter("buffer_mm")));
			hb.setSize(Double.parseDouble(request.getParameter("size")));
			hm.setMemory(Integer.parseInt(request.getParameter("memory")));
			hm.setPrice(Integer.parseInt(request.getParameter("price")));
			boolean result=ippdb.inputhdddata(hb,hm);
		}
		else if("ssd".equals(request.getAttribute("part"))) {
			ippdb=new inputpartdatabase();
			System.out.println("ssd입력");
			em_ssd sb=new em_ssd();
			em_ssd_memory sm=new em_ssd_memory();
			sb.setMaker((String)request.getParameter("maker"));
			sb.setKind((String)request.getParameter("kind"));
			sb.setRead(Integer.parseInt(request.getParameter("read")));
			sb.setWrite(Integer.parseInt(request.getParameter("write")));
			sb.setRead_iops(Integer.parseInt(request.getParameter("read_iops")));
			sb.setWrite_iops(Integer.parseInt(request.getParameter("write_iops")));
			sb.setDram(Integer.parseInt(request.getParameter("dram")));
			sm.setMemory(Integer.parseInt(request.getParameter("memory")));
			sm.setPrice(Integer.parseInt(request.getParameter("price")));
			boolean result=ippdb.inputssddata(sb,sm);
		}
		
	
		return forward;
	}
	}
