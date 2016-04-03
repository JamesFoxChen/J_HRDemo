package com.fly.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.runner.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fly.base.controller.BaseController;
import com.fly.common.Constant;
import com.fly.service.LoginSevice;
import com.fly.service.UserService;

/**
 * <br>
 * <b>类描述:</b>
 * 
 * <pre>
 *   景区登录控制器，处理登录验证、注销等操作
 * </pre>
 * 
 * @see
 * @since
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

	// protected static Logger logger =
	// LoggerFactory.getLogger(LoginController.class);

	/**
	 * 自动注入
	 */
	@Autowired
	private LoginSevice loginSevice;

	@Autowired
	private UserService userService;

	@RequestMapping("/demo")
	public String helloMvc(HttpSession httpSession) {

		// System.out.println("进入：HelloController-->helloMvc");

		// logger.info("helloMvc-Controller123ddf");
		// this.loginSevice.getOperateLog();
		// 视图渲染，/WEB-INF/views/home.jsp
		int count = this.userService.count();
	
		return "demo";
	}

	@RequestMapping("/userlogin")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		/*
		 * String userName = request.getParameter("userName"); String password =
		 * request.getParameter("password"); User user =
		 * userService.findUserByUserName(userName); if (user == null) {
		 * request.setAttribute("errorMsg", "用户名不存在"); return new
		 * ModelAndView("forward:/login.jsp"); } else if
		 * (!user.getPassword().equals(password)) {
		 * request.setAttribute("errorMsg", "用户密码不正确"); return new
		 * ModelAndView("forward:/login.jsp"); } else {
		 * user.setLastLoginIp(request.getLocalAddr());
		 * user.setLastLoginTime(new Date()); userService.saveLoginInfo(user);
		 * setSessionUser(request,user); return new ModelAndView("success"); }
		 */

		return null;
	}

	/**
	 * 登录注销
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/userlogout")
	public String logout(HttpSession session) {
		session.removeAttribute(Constant.USER_CONTEXT);
		return "forward:/index.jsp";
	}
}
