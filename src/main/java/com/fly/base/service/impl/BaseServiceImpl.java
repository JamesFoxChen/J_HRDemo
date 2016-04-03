package com.fly.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fly.base.service.IBaseService;

//import com.bigview.acm.base.bean.ResultBean;
//import com.bigview.acm.base.dao.IBaseDao;
//import com.bigview.acm.base.service.IBaseService;
//import com.bigview.acm.config.Config;
/**
 * 
 * 
 * <p> Title: BaseServiceImpl.java</p>
 * 
 * <p> Description: 父类service</p>
 * 
 * @author wangx
 * 
 * @date 2016-02-01 21:12:00 +0800
 *
 */
@Service("baseService")
public class BaseServiceImpl<T> implements IBaseService<T> {

    /*@Autowired
    private IBaseDao<T> baseDao;

    public ResultBean add(T t) throws Exception {
        baseDao.add(t);
        return new ResultBean(Config.SUCCESS, Config.SUCCESS_MSG);
    }

    public boolean exist(T t) throws Exception {
        return baseDao.exist(t);
    }

    public ResultBean update(T t) throws Exception {
        baseDao.update(t);
        return new ResultBean(Config.SUCCESS, Config.SUCCESS_MSG);
    }

    public ResultBean delete(T t) throws Exception {
        List<T> list = select(t);
        if (list.size() > 0) {
            baseDao.delete(t);
            return new ResultBean(Config.SUCCESS, Config.SUCCESS_MSG);
        } else {
            return new ResultBean(Config.FAILE, Config.ERROR_MSG);
        }

    }

    public List<T> select(T t) throws Exception {
        return baseDao.select(t);
    }*/

}
