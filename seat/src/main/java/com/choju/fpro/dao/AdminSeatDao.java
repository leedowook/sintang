package com.choju.fpro.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choju.fpro.vo.ConsertVO;
import com.choju.fpro.vo.HallVO;
import com.choju.fpro.vo.LineVO;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
@Repository
public class AdminSeatDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	public ConsertVO QuickLoad(ConsertVO consert) {
		consert=sqlSession.selectOne("AdminConsertMain.ConsertSelect",consert);
		return consert;
	}
	public void QuickUpdate(ConsertVO consert) {
		System.out.println("이미 있는 공연장이기에 업데이트로 접어듬");
		sqlSession.update("AdminConsertMain.ModConsert",consert);
		for(int i=0;i<consert.getHallinfo().size();i++) {
			HallVO Hallvo=new HallVO();
			Hallvo=consert.getHallinfo().get(i);
			System.out.println("AdminSeatDao name검사:"+Hallvo.getC_hall_name());
			if(Hallvo.getC_hall_num()==null) {//홀이 이미 있을경우
				Hallvo.setC_num(consert.getC_num());
				String Hallnum=sqlSession.selectOne("AdminConsertHall.CountHallid",Hallvo);
				if(Hallnum==null) {
					System.out.println("홀이름이 존재 없음");
					Hallvo.setC_hall_num("ha00");
				}else {
					System.out.println("홀이름 존재");
					Hallvo.setC_hall_num(consert.numbering(Hallnum)); 
				}
			
				sqlSession.insert("AdminConsertHall.AddHall",Hallvo);
			}
			else {
				
				sqlSession.update("AdminConsertHall.ModHall",Hallvo);
			}
			for(int j=0;j<consert.getLineList().size();j++) {//같은 홀이름을 가진 라인 찾기
				LineVO Linevo=new LineVO();
				Linevo=consert.getLineList().get(j);
				if(consert.getHallinfo().get(i).getC_hall_name().equals(consert.getLineList().get(j).getC_hall_name())) {
					System.out.println("test2"+consert.getLineList().get(j).getC_col_priority());
					Linevo.setC_num(consert.getC_num());
					Linevo.setC_hall_num(Hallvo.getC_hall_num());
					if(Linevo.getC_col_num()==null) {//라인 최초입력일경우
					
					System.out.println("test AdminSeatDao"+Linevo.getC_num()+Linevo.getC_hall_num());
					String Linenum=sqlSession.selectOne("AdminConsertLine.CountLineid",Linevo);
					if(Linenum==null) {
						System.out.println("라인 이름이 존재없음");
						Linevo.setC_col_num("la00");
					}else {
						System.out.println("라인이름존재");
						Linevo.setC_col_num(consert.numbering(Linenum));
					}
				
					sqlSession.insert("AdminConsertLine.AddLine",Linevo);}
					else {//라인 이미 존재할경우
						System.out.println("AdminSeatDaoLineUpdate");
						sqlSession.update("AdminConsertLine.ModLine",Linevo);
						}
				}
			}
		}
		sqlSession.delete("AdminConsertLine.DelAllLine");
	}
	public void DeleteConsert(String C_num,HttpServletResponse response) throws IOException {
		int success=sqlSession.delete("AdminConsertMain.ConsertDelete",C_num);
		System.out.println("삭제 쿼리결과"+success);
		if(success>0) {
			response.getWriter().print("1");
			
		}else {
			response.getWriter().print("0");
			
		}
		
	}
	public void QuickSave(ConsertVO consert) {
		String num=sqlSession.selectOne("AdminConsertMain.CountConsertid");
		System.out.println("없을경우:"+num);
		if(num==null) {
			System.out.println("없을경우 if문이 실행됨");
			consert.setC_num("ca00");
		}else {
			System.out.println("있을경우 if문이 실행됨");
			consert.setC_num(consert.numbering(num));
		}
		sqlSession.insert("AdminConsertMain.AddConsert", consert);
		for(int i=0;i<consert.getHallinfo().size();i++) {
			HallVO Hallvo=new HallVO();
			Hallvo=consert.getHallinfo().get(i);
			Hallvo.setC_num(consert.getC_num());
			String Hallnum=sqlSession.selectOne("AdminConsertHall.CountHallid",Hallvo);
			if(Hallnum==null) {
				System.out.println("홀이름이 존재 없음");
				Hallvo.setC_hall_num("ha00");
			}else {
				System.out.println("홀이름 존재");
				Hallvo.setC_hall_num(consert.numbering(Hallnum)); 
			}
			sqlSession.insert("AdminConsertHall.AddHall",Hallvo);
			
			for(int j=0;j<consert.getLineList().size();j++) {
				if(consert.getHallinfo().get(i).getC_hall_name().equals(consert.getLineList().get(j).getC_hall_name())) {
				System.out.println("test2"+consert.getLineList().get(j).getC_col_priority());
				LineVO Linevo=new LineVO();
				Linevo=consert.getLineList().get(j);
				Linevo.setC_num(consert.getC_num());
				Linevo.setC_hall_num(Hallvo.getC_hall_num());
				System.out.println("test AdminSeatDao"+Linevo.getC_num()+Linevo.getC_hall_num());
				String Linenum=sqlSession.selectOne("AdminConsertLine.CountLineid",Linevo);
				if(Linenum==null) {
					System.out.println("라인 이름이 존재없음");
					Linevo.setC_col_num("la00");
				}else {
					System.out.println("라인이름존재");
					Linevo.setC_col_num(consert.numbering(Linenum));
				}
				System.out.println("점검 adminseatdao c_num"+Linevo.getC_num()+" C_hall_num"+Linevo.getC_hall_num());
				sqlSession.insert("AdminConsertLine.AddLine",Linevo);}}
		}
	}
	
	public  void ConsertOverlap(String ID, String Consertname,HttpServletResponse response) throws IOException {
		  HashMap map = new HashMap();//파라미터값을 여러개 ㅈ넘겨주기위해 map을 선언 
	      map.put("ID", ID);
	      map.put("C_name", Consertname);
	     ConsertVO ConsertVO=sqlSession.selectOne("AdminConsertMain.ConsertnameOverlap",map);
	        if(ConsertVO== null) {
	        	response.getWriter().print("1");
	        } else {
	        	response.getWriter().print("0");
	        }
	}
	
	public	List<ConsertVO> SelectConsertList(String ID) {
		List<ConsertVO> consertVO=sqlSession.selectList("AdminConsertMain.SelectConsertList",ID);
		return consertVO;
	}
	
	public ConsertVO SelectConsert(String ID, String num) {
		HashMap<String,String> map = new HashMap<String,String>();//파라미터값을 여러개 ㅈ넘겨주기위해 map을 선언 
         map.put("ID", ID);
         map.put("C_num", num);
		ConsertVO consertVO=sqlSession.selectOne("AdminConsertMain.SelectConsertMain",map);
		List<LineVO> LineList=sqlSession.selectList("AdminConsertLine.SelectConsertLine",num);
		List<HallVO> Hallinfo=sqlSession.selectList("AdminConsertHall.SelectConsertHall", num);
		consertVO.setHallinfo(Hallinfo);
		consertVO.setLineList(LineList);
		return consertVO;
	}
	public ConsertVO SelectConsertInfo(String num){
		ConsertVO consertVO=sqlSession.selectOne("AdminConsertMain.SelectConsertMain2",num);
		List<LineVO> LineList=sqlSession.selectList("AdminConsertLine.SelectConsertLine",num);
		List<HallVO> Hallinfo=sqlSession.selectList("AdminConsertHall.SelectConsertHall", num);
		consertVO.setHallinfo(Hallinfo);
		consertVO.setLineList(LineList);
		return consertVO;
		}
	}
	