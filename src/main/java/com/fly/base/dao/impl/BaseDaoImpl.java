/*package com.fly.base.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.bigview.acm.base.dao.IBaseDao;

*//**
 * 
 * 
 * <p> Title: BaseDaoImpl.java</p>
 * 
 * <p> Description: 父类dao实现类</p>
 * 
 * @author wangx
 * 
 * @date 2016-02-01 21:11:01 +0800
 *
 *//*
@Repository("baseDao")
public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements IBaseDao<T> {
    *//**
     * 查询
     * 
     * @param T
     * @return
     *//*
    public List<T> select(T t) {
        return getSqlSession().selectList(
            t.getClass().getSimpleName() + "Mapper.select", t);
    }

    *//**
     * 查询分页
     * 
     * @param T
     * @return
     *//*
    public List<T> selectPage(T t) {
        return getSqlSession().selectList(
            t.getClass().getSimpleName() + "Mapper.selectPage", t);
    }
    
    *//**
     * 查询分页总数
     * 
     * @param T
     * @return
     *//*
    public Long selectCount(T t) {
        return getSqlSession().selectOne(
            t.getClass().getSimpleName() + "Mapper.selectCount", t);
    }
    
    
    *//**
     * 更新
     * 
     * @param T
     *//*
    public void update(T t) {
        getSqlSession().update(t.getClass().getSimpleName() + "Mapper.update",
            t);
    }

    *//**
     * 添加
     * 
     * @param T
     *//*
    public void add(T t) {
        getSqlSession().insert(t.getClass().getSimpleName() + "Mapper.add", t);
    }

    *//**
     * 删除
     * 
     * @param T
     *//*
    public void delete(T t) {
        getSqlSession().delete(t.getClass().getSimpleName() + "Mapper.delete",
            t);
    }

    *//**
     * 判断存在
     * 
     * @param name
     * @return
     *//*
    public boolean exist(T t) {
        Long count = getSqlSession().selectOne(
            t.getClass().getSimpleName() + "Mapper.exist", t);
        if (count != null && count > 0) {
            return true;
        } else {
            return false;
        }
    }
}
*/