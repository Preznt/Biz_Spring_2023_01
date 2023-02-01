package com.bjw.contact.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.bjw.contact.models.UserDto;
import com.bjw.contact.persistence.UserDao;
import com.bjw.contact.service.UserService;

/**
 * spring project 에서 Bean에 대하여
 * 
 *	spring project 는 project 가 start 될때
 *	@Component(@Controller,@Service, @Bean) 들이 설정된 class 들을
 *	scan 하여 객체로 생성한 후 Container 에 보관을 한다
 *
 *	어디선가 @Autowired 로 설정된 코드가 발견되면
 *	해당 객체를 사용할수 있도록 주입(공급)해준다
 *	
 *	또는 
 *	private final 로 설정된 코드가 발견되면
 *	생성자를 통하여 해당 객체를 사용할수 있도록 주입(공급)해준다
 *
 *	Container 에 보관중인 객체를 필요한 곳에 주입을 하는데
 *	시점이 매우 중요하다.
 *
 *	1. private final 로 선언된 코드가 있냐?
 *		있으면 생성자를 통하여 주입한다
 *		없으면 생성자를 통한 주입을 포기한다
 *	
 *	2. @Autowired 로 선언된 코드가 있냐?
 *		있으면 (여기서는 service) 객체가 만들어졌냐?
 *		그러면 setter 를 통하여 주입한다
 *		
 *	아래 코드에서 생성자에서 userDao 를 참조하여 method 들을 사용하려면
 *	userDao 도 생성자에서 초기화가 되어야 한다.
 *
 *	autowired, memory 로 검색해보기
 *
 */

@Service
public class UserServiceImplV1 implements UserService {
	
	private String[] names;
	private List<UserDto> userList = new ArrayList<>();
	
	// UserDao 클래스를 사용하여 만들어진 객체를 사용하고 싶으니
	// 누군가 나에게 주입(공급)해줘!! 라는 외침
	private final UserDao userDao;
	public UserServiceImplV1(UserDao userDao) {
		super();
		this.userDao = userDao;
		userDao.create_contact_table();
		userDao.create_hobby_table();
		
		names = new String[] {"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		userList = new ArrayList<>();
	}
	
	
	@Override
	public List<UserDto> selectAll() {
		userList.removeAll(userList);
		Random rnd = new Random();
		
		for(int i= 0; i < 10; i++) {
			int rndIndex = rnd.nextInt(names.length);
			UserDto dto = new UserDto();
			dto.setC_uid(i+1L);
			dto.setC_name(names[rndIndex]);
			userList.add(dto);
		}
		
		return userList;
	}
	@Override
	public UserDto findById(Long uid) {
		// TODO Auto-generated method stub
		return userList.get((int)(long)(uid));
	}
	@Override
	public int insert(UserDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(UserDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(Long isbn) {
		// TODO Auto-generated method stub
		return 0;
	}
	


//	@Override
//	public List<UserDto> selectAll() {
//		return userDao.selectAll();
////		return null;
//	}
//
//	@Override
//	public UserDto findByUuid(String uuid) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
