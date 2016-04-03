package com.fly.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

	/*
	 * Integer create(User user); Integer delete(Integer id); Integer
	 * modify(User user);
	 * 
	 * User findById(Integer id); User findByUser(User user); List<User>
	 * findAll(); List<User> findAll(User user);
	 */

	Integer count();
}
