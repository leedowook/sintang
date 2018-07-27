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
	public int inputcpu(em_cpu cb){
		System.out.println("dao cpu입력에 접속");
		me_number mn=new me_number();
		int result=0,result1=0,result2=0;
		String number=null;
		pstmt=null;
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
		String num="select max(vga_num) from vga_info_m";
		String sql1="insert into vga_info_m values(?,?,?,?,?,?,?,?)";
		String sql2="insert into vga_info_else values(?,?,?,?,?,?,?,?,?,?,?)";
		String sql3="insert into vga_info_spec values(?,?,?,?,?,?,?,?,?,?,?)";
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
			pstmt.setString(3,vb.getCodename());
			pstmt.setString(4,vb.getBrand());
			pstmt.setString(5,vb.getSize());
			pstmt.setInt(6,vb.getPrice());
			pstmt.setString(7,vb.getName());
			pstmt.setString(8,vb.getOver());
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
}
