package com.fly.base.dao;

import java.util.List;

/**
 * 
 * 
 * <p>
 * Title: IBaseDao.java
 * </p>
 * 
 * <p>
 * Description: 父类dao
 * </p>
 * 
 * @author wangx
 * 
 * @date 2016-02-01 21:10:44 +0800
 * 
 */
public interface IBaseDao<T> {

    List<T> select(T t);

    List<T> selectPage(T t);

    Long selectCount(T t);

    void update(T t);

    void add(T t);

    void delete(T t);

    boolean exist(T t);
}
