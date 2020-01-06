package com.ngo.service;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import com.ngo.dao.UserDao;


@Component
public class UserServiceImpl implements UserService{

	private UserDao uDao;
	
	@Override
	public void AddUser(User u) {
    
	uDao.AddUser(u);
	}

}
