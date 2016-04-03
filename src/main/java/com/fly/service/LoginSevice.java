package com.fly.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fly.dao.LoginDao;
import com.fly.domain.OperateLog;

@Service
public class LoginSevice {
	protected static Logger logger = LoggerFactory.getLogger(LoginSevice.class);
	
	//@Autowired
	//private LoginDao loginDao;

	public OperateLog getOperateLog() {
		//return this.loginDao.getOperateLog();
		return null;
	}
	
	
/*	public void helloMvc() {
		//logger.info("helloMvc-Service");
		this.loginDao.helloMvc();
	}*/
}
