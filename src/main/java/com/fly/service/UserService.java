package com.fly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fly.dao.UserMapper;
import com.fly.domain.OperateLog;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public int count() {
		return this.userMapper.count();
	}
	
	public OperateLog get(int id) {
		return this.userMapper.get(id);
	}
	
	public List<OperateLog> getList(OperateLog getList) {
		return this.userMapper.getList(getList);
	}

	public int add(OperateLog log) {
		return this.userMapper.add(log);
	}
	
	public int update(OperateLog log) {
		return this.userMapper.update(log);
	}
	
	public int delete(int id) {
		return this.userMapper.delete(id);
	}
	
	public int deletebatch(List<Integer> ids) {
		return this.userMapper.deletebatch(ids);
	}
}
