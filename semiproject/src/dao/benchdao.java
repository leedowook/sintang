package dao;

import static db.jdbc.close;

import java.sql.*;
import java.util.*;

import been.*;
import methodcode.*;

public class benchdao {
	private static benchdao benchdao;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	public static benchdao getInstance() {
		if(benchdao==null) {
			benchdao=new benchdao();
		}
		return benchdao;
	}
	public void setConnection(Connection con) {
		this.con=con;}
	public em_cho_gamespec gamespec(int g_num,int spec) {
		em_cho_gamespec ecgs=new em_cho_gamespec();
		String sql="select * from where specnum=? and g_num=? ";
		rs=null;
		pstmt=null;
		
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, spec);
			pstmt.setInt(2, g_num);
			if(rs.next()) {
			ecgs.setGamename(rs.getString("name"));
			ecgs.setSpec(rs.getInt("specnum"));
			ecgs.setVga_shaders(rs.getInt("vga_shaders"));
			ecgs.setVga_tmus(rs.getInt("vga_tmus"));
			ecgs.setVga_rops(rs.getInt("vga_rops"));
			ecgs.setVga_ram(rs.getInt("vga_ram"));
			ecgs.setCpu_core(rs.getInt("cpu_core"));
			ecgs.setCpu_ck(rs.getInt("cpu_ck"));
			ecgs.setCpu_td(rs.getInt("cpu_td"));
			ecgs.setRam_ck(rs.getInt("ram_ck"));
			ecgs.setRam_mm(rs.getInt("ram_mm"));
			ecgs.setVga_ck(rs.getInt("vga_ck"));
				
			}}catch(Exception e) {
			System.out.println("benchdao오류"+e);
			e.printStackTrace();
			
		}finally {
			
			close(pstmt);
			close(rs);
			
		}
			
		
		
		return ecgs;
	}
	
	public em_vga vgaspec(em_cho_gamespec ecgs) {
		em_vga vga=new em_vga();
		System.out.println("해당 사양과 비슷한 그래픽찾기");
		
		String v_num=null;
		
		
		
		//밴치마킹돌린거
		String sql="select vga_num from\r\n" + 
				"(select vga_num,((sha/(?*?))*100%+(tmu/(?*?))*100%+(rop/(?*?))*200%) as bench from vga_spec_new)v2 where bench beetween 1 and 0.5";
		//밴치마킹 돌린거와 넘버 일치하는거
		String sel="select *from (select rownum as rnum,v2.*  from\r\n" + 
				"(select vga_info_m.*,vga_info_spec.price as price,vga_info_spec.vga_ram_mm as vga_ram_mm  from vga_info_m inner join vga_info_spec on\r\n" + 
				"vga_info_m.vga_num =vga_info_spec.vga_num\r\n" + 
				"where vga_info_m.vga_num in(?)  and vga_info_spec.ram_mm > ? order by vga_info_spec.price asc)v2) where rnum=1;"; 
		
		pstmt= null;
		rs=null;
		ArrayList<String> vga_numar=new ArrayList<>();
		
		try {
			
			
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,ecgs.getVga_shaders());
			pstmt.setInt(2,ecgs.getVga_ck());
			pstmt.setInt(1,ecgs.getVga_tmus());
			pstmt.setInt(2,ecgs.getVga_ck());
			pstmt.setInt(1,ecgs.getVga_rops());
			pstmt.setInt(2,ecgs.getVga_ck());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				do {
					vga_numar.add(rs.getString("vganum"));	
				}while(rs.next());	
			}
			v_num=vga_numar.get(0);
			for(int i=1;i<vga_numar.size();i++) {
				v_num=v_num+","+vga_numar.get(i);
				
			}
			pstmt=con.prepareStatement(sel);
			pstmt.setString(1,v_num);
			pstmt.setInt(2,ecgs.getVga_ram());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				
				vga.setNum(rs.getString("vga_num"));
				vga.setRam_mm(rs.getInt("vga_ram_mm"));
				vga.setMaker(rs.getString("vga_maker"));
				vga.setChip(rs.getString("vga_chip"));
				vga.setChipmaker(rs.getString("vga_chipmaker"));
				vga.setChipgroup(rs.getString("vga_chipgroup"));
				vga.setName(rs.getString("vga_name"));
			}
		}catch(Exception e) {
			System.out.println("benchdao vgaspec오류"+e);
			e.printStackTrace();
			
		}finally {
			
			close(pstmt);
			close(rs);
			
		}
		
		
		return vga;
	}
	public em_cpu cpuspec(em_cho_gamespec ecgs) {
		em_cpu cpu=new em_cpu();
		pstmt=null;
		rs=null;
		
		String sql1="select * from \r\n" + 
				"(select rownum as rown,v1.* from (select * from cpu_spec_new \r\n" + 
				"where  cpu_core>? and cpu_ck>? and cpu_td >? \r\n" + 
				"order by price asc)v1)\r\n" + 
				"where rown=1;";
		try {
			pstmt=con.prepareStatement(sql1);
			pstmt.setInt(1,ecgs.getCpu_core());
			pstmt.setDouble(2,ecgs.getCpu_ck());
			pstmt.setInt(3,ecgs.getCpu_td());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				cpu.setNum(rs.getString("cpu_num"));
				cpu.setCore(rs.getInt("cpu_core"));
				cpu.setCk(rs.getInt("cpu_ck"));
				cpu.setTd(rs.getInt("cpu_td"));
				cpu.setMaker(rs.getString("maker"));
				cpu.setCodename(rs.getString("code"));
				cpu.setBrand(rs.getString("brand"));
				cpu.setName(rs.getString("name"));
				cpu.setSize(rs.getString("cpu_size"));
				cpu.setNum(rs.getString("price"));
				
			}
			
		}catch(Exception e) {
			System.out.println("benchdao cpuspec오류"+e);
			e.printStackTrace();
			
		}finally {
			close(pstmt);
			close(rs);
			
		}
		return cpu;
	}
	
	public em_ram ramspec(em_cho_gamespec ecgs) {
		em_ram ram=new em_ram();
		pstmt=null;
		rs=null;
		if(ecgs.getRam_mm()>8) {
		String ram_sel="select * from ram_spec_new where  ";
		
		
		}
	
		return ram;
	}
	public em_mainboard mbspec(em_cho_gamespec ecgs) {
		em_mainboard mb=new em_mainboard();
		return mb;
	}
	public em_ssd ssdspec(em_cho_gamespec ecgs) {
		em_ssd ssd=new em_ssd();
		return ssd;
	}
	public em_power power(em_cho_gamespec ecgs) {
		
		return null;
	}


}

