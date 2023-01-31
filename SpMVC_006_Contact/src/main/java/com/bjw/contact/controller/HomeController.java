package com.bjw.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjw.contact.models.UserDto;
import com.bjw.contact.service.UserService;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/")
	public List<UserDto> selectAll(){
		return userService.selectAll();
	}
}