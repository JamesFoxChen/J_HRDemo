package com.fly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fly.dao.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public int count() {
		return this.userMapper.count();
	}
}
