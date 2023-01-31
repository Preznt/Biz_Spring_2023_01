package com.bjw.contact.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjw.contact.models.UserDto;
import com.bjw.contact.persistence.UserDao;
import com.bjw.contact.service.UserService;

@Service
public class UserServiceImplV1 implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<UserDto> selectAll() {
		return userDao.selectAll();
//		return null;
	}

	@Override
	public UserDto findByUuid(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

}
