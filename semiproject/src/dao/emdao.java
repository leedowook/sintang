package dao;

import static db.jdbc.close;

import java.sql.*;
import java.util.*;

import been.*;
import methodcode.*;

public class emdao {
	private static emdao emdao;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	public static emdao getInstance() {
		if(emdao==null) {
			emdao=new emdao();
		}
		return emdao;
	}
	public void setConnection(Connection con) {
		this.con=con;
	}
	
	public int selectcpu(String num) {
		System.out.println("cpu 조회");
		rs=null;
		
		return 0;
	}
	public int inputcpu(em_cpu cb){
		System.out.println("dao cpu입력에 접속");
		me_number mn=new me_number();
		int result=0,result1=0,result2=0;
		String number=null;
		pstmt=null;
		rs=null;
		String num="select max(cpu_num) from cpu_info_m";
		String sql1="insert into cpu_info_m values(?,?,?,?,?,?,?,?)";
		String sql2="insert into cpu_info_e values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(num);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("rs정보있음");
				number=mn.number(rs.getString(1));
			}
			else {
				System.out.println("rs정보없음");
				number="ca00";
			}
			pstmt = con.prepareStatement(sql1); 
			
			pstmt.setString(1,number);
			pstmt.setString(2,cb.getMaker());
			pstmt.setString(3,cb.getCodename());
			pstmt.setString(4,cb.getBrand());
			pstmt.setString(5,cb.getSize());
			pstmt.setInt(6,cb.getPrice());
			pstmt.setString(7,cb.getName());
			pstmt.setString(8,cb.getOver());
			result1=pstmt.executeUpdate();
			pstmt = con. prepareStatement(sql2);
			int gpu=0;
			if(cb.isGpu()) {
				gpu=1;
			}
			pstmt.setString(1,number);
			pstmt.setInt(2,cb.getCore());
			pstmt.setInt(3,cb.getTd());
			pstmt.setDouble(4,cb.getCk());
			pstmt.setDouble(5,cb.getMaxck());
			pstmt.setInt(6,cb.getL2cashm());
			pstmt.setInt(7,cb.getL3cashm());
			pstmt.setInt(8,gpu);
			pstmt.setInt(9,cb.getTdp());
			pstmt.setDouble(10,cb.getTri());
			pstmt.setInt(11,cb.getSysbus());
			
			result2=pstmt.executeUpdate();
			result=result1+result2;
			
			}catch(Exception e) {
				System.out.println("emdao오류"+e);
				e.printStackTrace();

			}finally {	
					close(pstmt);
					close(rs);
			}
		return result;
		
	}
	public int inputvga(em_vga vb,em_vga_spec vs){
		System.out.println("dao vga입력에 접속");
		me_number mn=new me_number();
		int result=0,result1=0,result2=0,result3=0;
		String number=null;
		pstmt=null;
		rs=null;
		String num="select max(vga_num) from vga_info_m";
		String sql1="insert into vga_info_m values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String sql2="insert into vga_info_else values(?,?,?,?,?)";
		String sql3="insert into vga_info_spec values(?,?,?,?,?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(num);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("rs정보있음");
				number=mn.number(rs.getString(1));
			}
			else {
				System.out.println("rs정보없음");
				number="va00";
			}
			pstmt = con.prepareStatement(sql1); 
			
			pstmt.setString(1,number);
			pstmt.setString(2,vb.getMaker());
			pstmt.setString(3,vb.getName());
			pstmt.setDouble(4,vb.getCk());
			pstmt.setDouble(5,vb.getMaxck());
			pstmt.setString(6,vb.getItf());
			pstmt.setString(7,vb.getChip());
			pstmt.setString(8,vb.getChipmaker());
			pstmt.setString(9,vb.getChipgroup());
			pstmt.setDate(10,vb.getBirth());
			pstmt.setInt(11,vb.getShaders());
			pstmt.setInt(12,vb.getTmus());
			pstmt.setInt(13,vb.getRops());
			
			result1=pstmt.executeUpdate();
			pstmt = con. prepareStatement(sql2);
			
			
			pstmt.setString(1,number);
			pstmt.setInt(2,vb.getHigh());
			pstmt.setInt(3,vb.getLength());
			pstmt.setInt(4,vb.getSize());
			pstmt.setString(5,vb.getHdmi());
			
			result2=pstmt.executeUpdate();
			
			pstmt = con. prepareStatement(sql3);
			
			
			pstmt.setString(1,number);
			pstmt.setInt(2,vs.getKind());
			pstmt.setInt(3,vs.getRam_bus());
			pstmt.setInt(4,vs.getRam_ck());
			pstmt.setInt(5,vs.getTdp());
			pstmt.setString(6,vb.getSupport());
			pstmt.setInt(7,vs.getPrice());
			pstmt.setInt(8,vs.getStr());
			pstmt.setInt(9,vs.getRam_mm());
			result3=pstmt.executeUpdate();
			
			result=result1+result2+result3;
			
			}catch(Exception e) {
				System.out.println("vga emdao오류"+e);
				e.printStackTrace();

			}finally {	
					close(pstmt);
					close(rs);
			}
		return result;
		
	}
	public int inputpower(em_power power) {
		System.out.println("dao pow입력에 접속");
		me_number mn=new me_number();
		int result=0;
		rs=null;
		String number=null;
		
		pstmt=null;
		String num="select max(pow_num) from pow_info_m";
		String sql1="insert into power_info_m values(?,?,?,?,?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(num);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("rs정보있음");
				number=mn.number(rs.getString(1));
			}
			else {
				System.out.println("rs정보없음");
				number="pa00";
			}
		pstmt = con. prepareStatement(sql1);
		
		
		pstmt.setString(1,number);
		pstmt.setString(2,power.getMaker());
		pstmt.setString(3,power.getKind());
		pstmt.setInt(4,power.getPower());
		pstmt.setInt(5,power.getFpinide_num());
		pstmt.setInt(6,power.getSata_num());
		pstmt.setInt(7,power.getPcie_num());
		pstmt.setString(8,power.getEplus());
		pstmt.setInt(9,power.getPrice());
		result=pstmt.executeUpdate();}
		catch(Exception e) {
			System.out.println("pow emdao오류"+e);
			e.printStackTrace();

		}finally {	
				close(pstmt);
				close(rs);
		}
		return result;
	}
	public int inputmainboard(em_mainboard mb) {
		System.out.println("dao pow입력에 접속");
		me_number mn=new me_number();
		int result=0,result1=0;
		String number=null;
		rs=null;
		
		pstmt=null;
		String num="select max(mainboard_num) from mb_info_m";
		String sql1="insert into mb_info_m values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String sql2="insert into mb_info_e values(?,?,?,?)";
		try {
			pstmt=con.prepareStatement(num);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("rs정보있음");
				number=mn.number(rs.getString(1));
			}
			else {
				System.out.println("rs정보없음");
				number="ma00";
			}
		pstmt = con. prepareStatement(sql1);
		
		
		pstmt.setString(1,number);
		pstmt.setString(2,mb.getMaker());
		pstmt.setString(3,mb.getName());
		pstmt.setString(4,mb.getBrand());

		pstmt.setInt(5,mb.getPowertype());
		pstmt.setInt(6,mb.getPrice());
		pstmt.setInt(7,mb.getSata3());
		pstmt.setInt(8,mb.getSata2());
		pstmt.setInt(9,mb.getLan());
		
		pstmt.setString(10,mb.getChip_group());
		pstmt.setString(11,mb.getChip_group_b());
		pstmt.setString(12,mb.getCpu_size());
		
		pstmt.setInt(13,mb.getPcieslot_n());
		pstmt.setInt(14,mb.getPcie3x16_n());
		pstmt.setInt(15,mb.getPcie3x8_n());
		pstmt.setInt(16,mb.getPcie3x1_n());
		pstmt.setInt(17,mb.getPciex6_n());
		pstmt.setInt(18,mb.getPciex4_n());
		pstmt.setInt(19,mb.getPciex1_n());
		pstmt.setInt(20,mb.getRam_ck());
		pstmt.setInt(21,mb.getRam_mm());
		pstmt.setInt(22,mb.getRam_mnum());
		pstmt.setInt(23,mb.getRam_ch());
		
		pstmt.setString(24,mb.getRam_kind());
		result1=pstmt.executeUpdate();
		result=+result1;
		pstmt = con. prepareStatement(sql2);
		
		pstmt.setString(1,number);
		pstmt.setInt(2,mb.getUsb1gen());
		pstmt.setInt(3,mb.getUsb2gen());
		pstmt.setString(4,mb.getPs2());
		result1=pstmt.executeUpdate();
		result=+result1;
		}
		catch(Exception e) {
			System.out.println("메인보드 emdao오류"+e);
			e.printStackTrace();

		}finally {	
				close(pstmt);
				close(rs);
		}
		return result;
		
	}
	public int inputram(em_ram rb, em_ram_mm rs2) {
		System.out.println("ram입력에 접속");
		me_number mn=new me_number();
		int result=0,result1=0;
		String number=null;
		rs=null;
		pstmt=null;
		String num="select max(ram_num) from ram_info_m";
		String sql1="insert into ram_info_m values(?,?,?,?)";
		String sql2="insert into ram_info_e values(?,?,?)";
		try {
			pstmt=con.prepareStatement(num);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("rs정보있음");
				number=mn.number(rs.getString(1));
			}
			else {
				System.out.println("rs정보없음");
				number="ra00";
			}
		pstmt = con. prepareStatement(sql1);
		
		
		pstmt.setString(1,number);
		pstmt.setString(2,rb.getMaker());
		pstmt.setString(3,rb.getKind());
		pstmt.setInt(4,rb.getCk());

		
		result1=pstmt.executeUpdate();
		result=+result1;
		pstmt = con. prepareStatement(sql2);
		
		pstmt.setString(1,number);
		pstmt.setInt(2,rs2.getMemory());
		pstmt.setInt(3,rs2.getPrice());
		
		result1=pstmt.executeUpdate();
		result=+result1;
		}
		catch(Exception e) {
			System.out.println("램 emdao오류"+e);
			e.printStackTrace();

		}finally {	
				close(pstmt);
				close(rs);
		}
		return result;
	}
	public int inputhdd(em_hdd hd, em_hdd_memory hm) {
		System.out.println("ram입력에 접속");
		me_number mn=new me_number();
		int result=0,result1=0;
		String number=null;
		rs=null;
		pstmt=null;
		String num="select max(hdd_num) from hdd_info_m";
		String sql1="insert into hdd_info_m values(?,?,?,?,?,?,?,?)";
		String sql2="insert into hdd_info_e values(?,?,?)";
		try {
			pstmt=con.prepareStatement(num);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("rs정보있음");
				number=mn.number(rs.getString(1));
			}
			else {
				System.out.println("rs정보없음");
				number="ha00";
			}
		pstmt = con. prepareStatement(sql1);
		
		
		pstmt.setString(1,number);
		pstmt.setString(2,hd.getMaker());
		pstmt.setString(3,hd.getKind());
		pstmt.setString(4,hd.getItf());
		pstmt.setInt(5,hd.getPlatter());
		pstmt.setInt(6,hd.getDisk_num());
		pstmt.setDouble(7,hd.getSize());
		pstmt.setInt(8,hd.getBuffer_mm());

		
		result1=pstmt.executeUpdate();
		result=+result1;
		pstmt = con. prepareStatement(sql2);
		
		pstmt.setString(1,number);
		pstmt.setInt(2,hm.getMemory());
		pstmt.setInt(3,hm.getPrice());
		
		result1=pstmt.executeUpdate();
		result=+result1;
		}
		catch(Exception e) {
			System.out.println("하드emdao오류"+e);
			e.printStackTrace();

		}finally {	
				close(pstmt);
				close(rs);
		}
		return result;
	}
	public int inputssd(em_ssd sd, em_ssd_memory sm) {
		System.out.println("ssd입력에 접속");
		me_number mn=new me_number();
		int result=0,result1=0;
		String number=null;
		rs=null;
		pstmt=null;
		String num="select max(ssd_num) from ssd_info_m";
		String sql1="insert into ssd_info_m values(?,?,?,?,?,?,?,?,?)";
		String sql2="insert into ssd_info_e values(?,?,?)";
		try {
			pstmt=con.prepareStatement(num);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("rs정보있음");
				number=mn.number(rs.getString(1));
			}
			else {
				System.out.println("rs정보없음");
				number="sa00";
			}
		pstmt = con. prepareStatement(sql1);
		
		
		pstmt.setString(1,number);
		pstmt.setString(2,sd.getMaker());
		pstmt.setString(3,sd.getKind());
		
		pstmt.setInt(4,sd.getRead());
		pstmt.setInt(5,sd.getWrite());
		pstmt.setInt(6,sd.getRead_iops());
		pstmt.setInt(7,sd.getWrite_iops());
		pstmt.setInt(8,sd.getDram());
		pstmt.setInt(9,sd.getLife());

		
		result1=pstmt.executeUpdate();
		result=+result1;
		pstmt = con. prepareStatement(sql2);
		
		pstmt.setString(1,number);
		pstmt.setInt(2,sm.getMemory());
		pstmt.setInt(3,sm.getPrice());
		
		result1=pstmt.executeUpdate();
		result=+result1;
		}
		catch(Exception e) {
			System.out.println("ssd emdao오류"+e);
			e.printStackTrace();

		}finally {	
				close(pstmt);
				close(rs);
		}
		return result;
	}
}
