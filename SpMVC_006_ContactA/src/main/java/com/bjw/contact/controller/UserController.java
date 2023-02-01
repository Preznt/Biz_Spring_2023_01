package com.bjw.contact.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bjw.contact.models.UserDto;
import com.bjw.contact.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api")
public class UserController {
//	@Autowired
//	private UserService userService;
//	
//	@RequestMapping(value = {"/",""} )
//	public List<UserDto> selectAll(){
//		return userService.selectAll();
//	}
	
	private final UserService userService;
	
	public UserController(UserService userService) {
	super();
	this.userService = userService;
}

	@RequestMapping(value = "/list", method=RequestMethod.GET )
	public List<UserDto> list() {
		List<UserDto> userList = userService.selectAll();
		log.debug(userList.toString());
		return userList;
	}
	
	@RequestMapping(value = "/detail")
	public UserDto detail(String uid) {
		return userService.findById(Long.valueOf(uid) - 1);
	}
	
	
}