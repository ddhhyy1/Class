package com.nangcho.test.dao;

import java.util.ArrayList;

import com.nangcho.test.dto.MemberDto;

public interface IDao {

	public void memberjoin(String mid,String mpw, String mname, String memail);
	public ArrayList<MemberDto> memberList();
	
}
