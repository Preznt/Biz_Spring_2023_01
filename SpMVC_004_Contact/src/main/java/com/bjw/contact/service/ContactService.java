package com.bjw.contact.service;

import java.util.List;

import com.bjw.contact.models.Contact;

public interface ContactService {
	
	public List<Contact> selectAll();
	public Contact findById(String id);
	
	public int insert(Contact contact);
	public int update(Contact contact); 
	public int delete(String id);
}
