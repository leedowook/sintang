package service;
import static db.jdbc.commit;
import static db.jdbc.getConnection;
import static db.jdbc.rollback;

import java.sql.Connection;

import been.*;
import dao.emdao;
public class inputpartdatabase {
	public boolean inputramdata() {
		boolean result=false;
		
		return result;
	}
	
	
	public boolean inputcpudata(em_cpu cpubean) {
		System.out.println("cpu 입력 서비스 접속");
		boolean result=false;
		emdao dao =emdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		int sqlresult=dao.inputcpu(cpubean);
		if(sqlresult>0) {
			System.out.println("dao성공후 service로 넘어옴");
			result=true;
			commit(con);
		}
		else {
			System.out.println("dao실패후 넘어옴");
			rollback(con);
		}
		return result;
	}
	public boolean inputvgadata(em_vga vb,em_vga_spec vs) {
		System.out.println("vga 입력 서비스 접속");
		boolean result=false;
		emdao dao =emdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		int sqlresult=dao.inputvga(vb,vs);
		if(sqlresult>0) {
			System.out.println("dao성공후 service로 넘어옴");
			result=true;
			commit(con);
		}
		else {
			System.out.println("dao실패후 넘어옴");
			rollback(con);
		}
		return result;
	}
	public boolean inputpowerdata(em_power power) {
		System.out.println("파워 입력 서비스 접속");
		boolean result=false;
		emdao dao =emdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		int sqlresult=dao.inputpower(power);
		if(sqlresult>0) {
			System.out.println("dao성공후 service로 넘어옴");
			result=true;
			commit(con);
		}
		else {
			System.out.println("dao실패후 넘어옴");
			rollback(con);
		}
		return result;
	}
	public boolean inputamainboarddata(em_mainboard mb) {
		System.out.println("메인보드 입력 서비스 접속");
		boolean result=false;
		emdao dao =emdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		int sqlresult=dao.inputmainboard(mb);
		if(sqlresult>0) {
			System.out.println("dao성공후 service로 넘어옴");
			result=true;
			commit(con);
		}
		else {
			System.out.println("dao실패후 넘어옴");
			rollback(con);
		}
		return result;
	}
	public boolean inputramdata(em_ram rb,em_ram_mm rs) {
		System.out.println("ram 입력 서비스 접속");
		boolean result=false;
		emdao dao =emdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		int sqlresult=dao.inputram(rb,rs);
		if(sqlresult>0) {
			System.out.println("dao성공후 service로 넘어옴");
			result=true;
			commit(con);
		}
		else {
			System.out.println("dao실패후 넘어옴");
			rollback(con);
		}
		return result;
	}
	public boolean inputhdddata(em_hdd hd,em_hdd_memory hm) {
		System.out.println("hdd 입력 서비스 접속");
		boolean result=false;
		emdao dao =emdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		int sqlresult=dao.inputhdd(hd,hm);
		if(sqlresult>0) {
			System.out.println("dao성공후 service로 넘어옴");
			result=true;
			commit(con);
		}
		else {
			System.out.println("dao실패후 넘어옴");
			rollback(con);
		}
		return result;
	}
	public boolean inputssddata(em_ssd sd,em_ssd_memory sm) {
		System.out.println("ssd 입력 서비스 접속");
		boolean result=false;
		emdao dao =emdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		int sqlresult=dao.inputssd(sd,sm);
		if(sqlresult>0) {
			System.out.println("dao성공후 service로 넘어옴");
			result=true;
			commit(con);
		}
		else {
			System.out.println("dao실패후 넘어옴");
			rollback(con);
		}
		return result;
	}

}
