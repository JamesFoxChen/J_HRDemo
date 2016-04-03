package com.fly.base.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fly.base.dao.IBaseDao;

//@Repository
public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements IBaseDao<T> {

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public List<T> select(T t) {
		return getSqlSession().selectList(t.getClass().getSimpleName() + "Mapper.select", t);
	}

	// 查询分页
	public List<T> selectPage(T t) {
		return getSqlSession().selectList(t.getClass().getSimpleName() + "Mapper.selectPage", t);
	}

	// 查询分页总数
	public Long selectCount(T t) {
		return (Long) getSqlSession().selectOne(t.getClass().getSimpleName() + "Mapper.selectCount", t);
	}

	// 更新
	public void update(T t) {
		getSqlSession().update(t.getClass().getSimpleName() + "Mapper.update", t);
	}

	// 添加
	public void add(T t) {
		getSqlSession().insert(t.getClass().getSimpleName() + "Mapper.add", t);
	}

	// 删除
	public void delete(T t) {
		getSqlSession().delete(t.getClass().getSimpleName() + "Mapper.delete", t);
	}

	// 判断存在
	public boolean exist(T t) {
		Long count = (Long) getSqlSession().selectOne(t.getClass().getSimpleName() + "Mapper.exist", t);
		if (count != null && count > 0) {
			return true;
		} else {
			return false;
		}
	}
}
