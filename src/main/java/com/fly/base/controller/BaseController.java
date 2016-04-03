package com.fly.base.controller;

import javax.servlet.http.HttpServletRequest;

//import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
/**
 * 
 * 
 * <p> Title: BaseController.java</p>
 * 
 * <p> Description: 父类</p>
 * 
 * @author wangx
 * 
 * @date 2016-02-01 21:10:09 +0800
 *
 */
public class BaseController {
	protected static Logger logger = LoggerFactory.getLogger(BaseController.class);

 /*   protected static Gson gson = new GsonBuilder().setDateFormat(
        "yyyy-MM-dd").create();

    protected static ObjectMapper mapper = new ObjectMapper();*/

    // ③ 获取基于应用程序的url绝对路径
    public final String getAppbaseUrl(HttpServletRequest request, String url) {
        Assert.hasLength(url, "url不能为空");
        Assert.isTrue(url.startsWith("/"), "必须以/打头");
        return request.getContextPath() + url;
    }

    protected String getWebRootPath(HttpServletRequest request) {
        return request.getServletContext().getRealPath("");
    }

    protected String getWebRootUrl(HttpServletRequest request) {
        StringBuffer url = request.getRequestURL();  
        String tempContextUrl = url
            .delete(url.length() - request.getRequestURI().length(),
                url.length())
            .append(request.getServletContext().getContextPath()).append("/")
            .toString();
        return tempContextUrl;
    }
}
