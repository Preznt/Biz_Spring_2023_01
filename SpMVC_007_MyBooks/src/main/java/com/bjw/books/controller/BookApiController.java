package com.bjw.books.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bjw.books.models.BookDto;
import com.bjw.books.service.MyBookService;

@RestController
@RequestMapping(value="/api")
public class BookApiController {
	private final MyBookService myBookService;

	public BookApiController(MyBookService myBookService) {
		this.myBookService = myBookService;
	}
	
	@RequestMapping(value= "/list", method=RequestMethod.GET)
	public List<BookDto> selectAll(){
		return myBookService.selectAll();
	}
}
