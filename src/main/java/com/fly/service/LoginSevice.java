package com.fly.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fly.base.controller.BaseController;
import com.fly.base.dao.LoginDao;

@Service
public class LoginSevice {
	protected static Logger logger = LoggerFactory.getLogger(LoginSevice.class);
	
	@Autowired
	private LoginDao loginDao;

	public void helloMvc() {
		logger.info("helloMvc-Service");
		this.loginDao.helloMvc();
	}
}
