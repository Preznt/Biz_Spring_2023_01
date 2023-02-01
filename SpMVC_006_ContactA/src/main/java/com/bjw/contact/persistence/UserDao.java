package com.bjw.contact.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bjw.contact.models.UserDto;
import com.bjw.contact.service.GenericService;


public interface UserDao extends GenericService<UserDto, Long>{
//	@Select("SELECT * FROM tbl_contact")
//	public List<UserDto> selectAll();
	
	// 프로젝트가 시작될때 table 을 자동 생성하기 위한 method 정의
	public void create_contact_table();
	public void create_hobby_table();
	
}
