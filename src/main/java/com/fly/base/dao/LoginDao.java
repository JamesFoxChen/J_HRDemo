package com.fly.base.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {
	
	protected static Logger logger = LoggerFactory.getLogger(LoginDao.class);
	
	public void helloMvc()
	{
		logger.info("helloMvc-Repository");
	} 
}
