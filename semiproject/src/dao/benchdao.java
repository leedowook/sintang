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
		String sql1="select * from where name=?";
		rs=null;
		pstmt=null;
		
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, spec);
			pstmt.setInt(2, g_num);
			rs=pstmt.executeQuery();
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
			
				
			}
			pstmt=con.prepareStatement(sql1);
			pstmt.setString(1,ecgs.getGamename());
			rs=pstmt.executeQuery();
			if(rs.next()) {
			ecgs.setGamekind(rs.getString("kind"));
			}
		}catch(Exception e) {
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
				"(select vga_num,(((sha/(?*?))+(tmu/(?*?))+(rop/(?*?))*2))/4 as bench from vga_spec_new)v2 where bench beetween 1 and 0.5";
		//밴치마킹 돌린거와 넘버 일치하는거
		String sel="select *from (select rownum as rnum,v2.*  from\r\n" + 
				"(select vga_info_m.*,vga_info_spec.price as price,vga_info_spec.vga_ram_mm as vga_ram_mm  from vga_info_m inner join vga_info_spec on\r\n" + 
				"vga_info_m.vga_num =vga_info_spec.vga_num\r\n" + 
				"where vga_info_m.vga_num in(?)  and vga_info_spec.ram_mm > ? and vga_chipmaker='nvidia' and \r\n" + 
				"order by vga_info_spec.price asc)v2)"; 
		
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
	public em_cpu cpuspec(em_cho_gamespec ecgs,String maker) {
		em_cpu cpu=new em_cpu();
		pstmt=null;
		rs=null;
		
		String sql1="select * from \r\n" + 
				"(select rownum as rown,v1.* from (select * from cpu_spec_new \r\n" + 
				"where  cpu_core>=? and cpu_ck>=? and cpu_td >=? and cpu_maker=?\r\n" + 
				"order by price asc)v1)\r\n" + 
				"where rown=1;";
		try {
			pstmt=con.prepareStatement(sql1);
			pstmt.setInt(1,ecgs.getCpu_core());
			pstmt.setDouble(2,ecgs.getCpu_ck());
			pstmt.setInt(3,ecgs.getCpu_td());
			pstmt.setString(4,maker);
			
			
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
	
	public em_ram ramspec(em_cho_gamespec ecgs,int slot) {
		em_ram ram=new em_ram();
		pstmt=null;
		int ram_count=0;
		rs=null;
		String ram_sel=null;
		
			//최저가 램  선택
		
		if(ecgs.getRam_mm()>=16&&slot<=2) {
		ram_count+=Math.ceil(ecgs.getRam_mm()/16);	
		ram_sel="select * from (select rownum rnum,* from ram_spec_new where ram_kind='ddr4' and mm=16 order by price asc) where rnum=1;";
		}
		else {
			ram_count+=Math.ceil(ecgs.getRam_mm()/8);	
			ram_sel="select * from (select rownum rnum,* from ram_spec_new where ram_kind='ddr4' and mm=8 order by price asc) where rnum=1;";
		}
		
		try {
			pstmt=con.prepareStatement(ram_sel);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				ram.setNum(rs.getString("ram_num"));
				ram.setCount(ram_count);
				ram.setCk(rs.getInt("ram_ck"));
				ram.setMm(rs.getInt("mm"));
				ram.setKind(rs.getString("ram_kind"));
				ram.setMaker(rs.getString("ram_maker"));
				ram.setPrice(rs.getInt("price"));
				}
			
		}catch(Exception e) {
			System.out.println("benchdao cpuspec오류"+e);
			e.printStackTrace();
			
		}finally {
			close(pstmt);
			close(rs);
			
		}
		return ram;
		}

	public em_mainboard mbspec(em_cho_gamespec ecgs,String size,int option) {
		String maker=null;
		if(option==1) {
			maker="asrock";
		}
		else if(option==2) {
			maker="msi,gigabyte";
		}
		else {
			maker="asus and name='rog'";
			
		}
		em_mainboard mainboardbean=new em_mainboard();
		
		pstmt=null;
		
		rs=null;
		String sql1="select * from (select rownum rnum,m.*,e.usb1gen,e.usb0gen,ps2 from mb_info_m m inner join mb_info_e e on m.mainboard_num=e.mainboard_num   where cpu_size=? and maker in(?)order by price asc) where rnum=1;";
		try {
		pstmt = con.prepareStatement(sql1);
		pstmt.setString(1,size);
		pstmt.setString(2,maker);
		rs=pstmt.executeQuery();
		if(rs.next()) {
			mainboardbean.setNum(rs.getString("num"));
			mainboardbean.setMaker(rs.getString("mainboard_maker"));
			mainboardbean.setName(rs.getString("mainboard_name"));
			mainboardbean.setBrand(rs.getString("mainboard_brand"));
			mainboardbean.setLan(rs.getInt("lan"));
			mainboardbean.setCpu_size(rs.getString(size));
			mainboardbean.setChip_group(rs.getString("chip_group"));
			mainboardbean.setChip_group_b(rs.getString("chip_group_b"));
			mainboardbean.setRam_kind(rs.getString("ram_kind"));
			mainboardbean.setPs2(rs.getString("ps2"));
			mainboardbean.setPowertype(rs.getInt("powertype"));
			mainboardbean.setPrice(rs.getInt("price"));
			mainboardbean.setSata3(rs.getInt("sata3"));
			mainboardbean.setSata2(rs.getInt("sata2"));
			mainboardbean.setPcieslot_n(rs.getInt("pcieslot_n"));
			mainboardbean.setPcie3x16_n(rs.getInt("pcie3x16_n"));
			mainboardbean.setPcie3x8_n(rs.getInt("pcie3x8_n"));
			mainboardbean.setPcie3x1_n(rs.getInt("pcie3x1_n"));
			mainboardbean.setPciex6_n(rs.getInt("pciex6_n"));
			mainboardbean.setPciex4_n(rs.getInt("pciex4_n"));
			mainboardbean.setPciex1_n(rs.getInt("pciex1_n"));
			mainboardbean.setRam_ck(rs.getInt("ram_ck"));
			mainboardbean.setRam_mm(rs.getInt("ram_mm"));
			mainboardbean.setRam_mnum(rs.getInt("ram_mnum"));
			mainboardbean.setRam_ch(rs.getInt("ram_ch"));
			mainboardbean.setM2_num(rs.getInt("m2_num"));
			mainboardbean.setUsb1gen(rs.getInt("usb1gen"));
			mainboardbean.setUsb2gen(rs.getInt("usb2gen"));
		}
		}catch(Exception e) {
			System.out.println("benchdao cpuspec오류"+e);
			e.printStackTrace();
			
		}finally {
			close(pstmt);
			close(rs);
			
		}
		
		return mainboardbean;
	}
	public em_hdd hddspec(em_cho_gamespec ecgs,int option) {
		em_hdd hdd=new em_hdd();
		int mm=0;
		if(option==1) {
			mm=1;
			
		}
		else if(option==2) {
			mm=2;
		}
		else if(option==3) {
			mm=4;
		}
		String sql1="select * from (select rownum as rnum,* from hdd_all where hdd_maker='wd' and hdd_memory=="+mm+" order by price asc) where rnum=1; ";
		try {
		pstmt = con.prepareStatement(sql1);
		rs=pstmt.executeQuery();
		if(rs.next()) {
			hdd.setName(rs.getString("name"));
			hdd.setMaker(rs.getString("hdd_maker"));
			hdd.setKind(rs.getString("hdd_kind"));
			hdd.setItf(rs.getString("hdd_interface"));
			hdd.setPlatter(rs.getInt("hdd_platter"));
			hdd.setDisk_num(rs.getInt("hdd_disk_num"));
			hdd.setBuffer_mm(rs.getInt("hdd_buffer_mm"));
			hdd.setSize(rs.getDouble("hdd_size"));
			hdd.setMemory(rs.getInt("hdd_memory"));
			hdd.setPrice(rs.getInt("hdd_price"));
				
		}}catch(Exception e) {
			System.out.println("benchdao cpuspec오류"+e);
			e.printStackTrace();
			
		}finally {
			close(pstmt);
			close(rs);
			
		}
		return hdd;
	}
	public em_ssd ssdspec(em_cho_gamespec ecgs) {
		em_ssd ssd=new em_ssd();
		
		String sql1="select * from (select rownum as rnum,* from ssd_all where ssd_maker in('삼성','wd') order by price asc) where rnum=1; ";
		try {
		pstmt = con.prepareStatement(sql1);
		rs=pstmt.executeQuery();
		if(rs.next()) {
			ssd.setName(rs.getString("name"));
			ssd.setMaker(rs.getString("ssd_maker"));
			ssd.setKind(rs.getString("ssd_kind"));
			ssd.setRead(rs.getInt("read"));
			ssd.setWrite(rs.getInt("write"));
			ssd.setRead_iops(rs.getInt("read_iops"));
			ssd.setWrite_iops(rs.getInt("write_iops"));
			ssd.setDram(rs.getInt("dram"));
			ssd.setMemory(rs.getInt("ssd_memory"));
			ssd.setPrice(rs.getInt("price"));	
		}}catch(Exception e) {
			System.out.println("benchdao cpuspec오류"+e);
			e.printStackTrace();
			
		}finally {
			close(pstmt);
			close(rs);
			
		}
		return ssd;
	}
	public em_power power(em_cho_gamespec ecgs,double wat) {
		em_power powerbean=new em_power();
		pstmt=null;
		rs=null;
	
		String sql1="select * from power_info_m where pow_power>?";
	
		try {
		pstmt = con.prepareStatement(sql1);
		pstmt.setDouble(1,wat);
		rs=pstmt.executeQuery();
		if(rs.next()) {
			
			powerbean.setNum(rs.getString("pow_num"));
			powerbean.setMaker(rs.getString("pow_maker"));
			powerbean.setKind(rs.getString("pow_kind"));
			powerbean.setEplus(rs.getString("pow_80plus"));
			powerbean.setPower(rs.getInt("pow_power"));
			powerbean.setFpinide_num(rs.getInt("pow_4pinide_num"));
			powerbean.setSata_num(rs.getInt("pow_sata_num"));
			powerbean.setPcie_num(rs.getInt("pow_pcie_num"));
			powerbean.setPrice(rs.getInt("price"));
		}
		
	
		
		
		}catch(Exception e) {
			System.out.println("찾기dao오류"+e);
			e.printStackTrace();
			
		}finally {
			close(pstmt);
			close(rs);
		}
		return powerbean;
	
		
		
		
		
	}
}
	


