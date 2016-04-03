package com.fly.base.bean;

import java.io.Serializable;
/**
 * 
 * 
 * <p> Title: ResultBean.java</p>
 * 
 * <p> Description: </p>
 * 
 * @author wangx
 * 
 * @date 2016-02-01 21:03:40 +0800
 *
 */
public class ResultBean implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 877201555890118963L;

    private int flag;
    
    private String returnMessage;
    
    public ResultBean(){
        
    }
    
    public ResultBean(int flag,String returnMessage){
        this.flag = flag;
        this.returnMessage = returnMessage;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }
    
}
