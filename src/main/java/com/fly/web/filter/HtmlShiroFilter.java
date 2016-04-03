package com.fly.web.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public class HtmlShiroFilter extends FormAuthenticationFilter {

	@Override
	protected boolean onAccessDenied(ServletRequest req, ServletResponse res, Object obj) throws Exception {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		String realPath = request.getSession().getServletContext().getRealPath("/");
		String contextPath = request.getContextPath();
		String servletPath = request.getServletPath();
		String pathInfo = request.getPathInfo();

		realPath = path(realPath);
		contextPath = path(contextPath);
		servletPath = path(servletPath);
		pathInfo = path(pathInfo);

		request.setAttribute("path", servletPath.substring(0, servletPath.lastIndexOf(".")));
		request.getRequestDispatcher("/html/get").forward(request, response);

		return false;
	}

	private String path(String path) {
		if (path == null || "".equals(path) || "/".equals(path)) {
			return "";
		} else if (!path.startsWith("/")) {
			return "/" + path;
		} else {
			return path;
		}
	}
}
