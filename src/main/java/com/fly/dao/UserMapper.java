package com.fly.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.fly.domain.OperateLog;
import java.util.List;

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
	
	public OperateLog get(@Param("id")int id);
	
	public List<OperateLog> getList(OperateLog log);
	
	public int add(OperateLog log);
	
	public int update(OperateLog log);
	
	public int delete(int id);
	
	public int deletebatch(List<Integer> ids);
}
