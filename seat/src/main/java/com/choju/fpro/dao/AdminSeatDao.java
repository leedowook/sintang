package com.choju.fpro.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choju.fpro.vo.ConsertVO;
import com.choju.fpro.vo.HallVO;
import com.choju.fpro.vo.LineVO;

import org.mybatis.spring.SqlSessionTemplate;
@Repository
public class AdminSeatDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
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
				Linevo.setC_num(num);
				Linevo.setC_hall_num(Hallvo.getC_hall_num());
				String Linenum=sqlSession.selectOne("AdminConsertLine.CountLineid",Hallvo);
				if(Linenum==null) {
					System.out.println("라인 이름이 존재없음");
					Linevo.setC_col_num("la00");
				}else {
					System.out.println("라인이름존재");
					Linevo.setC_col_name(consert.numbering(Linenum));
				}
				sqlSession.insert("AdminConsertLine.AddLine",Linevo);}}
		}
	}
}
	