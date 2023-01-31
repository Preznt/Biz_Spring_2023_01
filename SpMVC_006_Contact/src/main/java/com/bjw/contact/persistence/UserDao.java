package com.bjw.contact.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bjw.contact.models.UserDto;


public interface UserDao {
	@Select("SELECT * FROM tbl_contact")
	public List<UserDto> selectAll();
}
