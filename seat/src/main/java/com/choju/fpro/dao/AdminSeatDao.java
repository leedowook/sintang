package com.choju.fpro.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choju.fpro.vo.ConsertVO;

import org.mybatis.spring.SqlSessionTemplate;
@Repository
public class AdminSeatDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	public void QuickSave(ConsertVO consert) {
		
		
	}

}
	