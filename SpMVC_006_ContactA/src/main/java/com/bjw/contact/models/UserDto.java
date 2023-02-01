package com.bjw.contact.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private Long c_uid; // varchar()
	private String c_name; // varchar()
	private String c_email;
	private String c_tel; // varchar()
	private String c_addr; // varchar()
	private String c_hobby; // varchar()
	
}
