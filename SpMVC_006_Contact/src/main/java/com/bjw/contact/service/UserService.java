package com.bjw.contact.service;

import java.util.List;

import com.bjw.contact.models.UserDto;


public interface UserService {
	public List<UserDto> selectAll();
	public UserDto findByUuid(String uid);
}
