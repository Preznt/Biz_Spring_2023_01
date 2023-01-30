package com.bjw.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjw.contact.dao.BookDao;
import com.bjw.contact.models.Book;

@RestController
@RequestMapping(value = "/book")
public class BookController {
	
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping(value = {"/",""})
	public List<Book> list() {
		return bookDao.selectAll();
	}

}
