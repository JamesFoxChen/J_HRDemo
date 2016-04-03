package com.fly.web.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HtmlMvcFilter implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String realPath=request.getSession().getServletContext().getRealPath("/");
		String contextPath=request.getContextPath();
		String servletPath=request.getServletPath();
		String pathInfo=request.getPathInfo();
		
		realPath=path(realPath);
		contextPath=path(contextPath);
		servletPath=path(servletPath);
		pathInfo=path(pathInfo);
		
		request.setAttribute("path", servletPath.substring(0, servletPath.lastIndexOf(".")));
		request.getRequestDispatcher("/html/get").forward(request, response);
		
//		OutputStream os=null;
//		InputStream is=null;
//		try{
//			File file=new File(realPath+"/WEB-INF/views"+servletPath+pathInfo);
//			
//			response.setContentType("text/html;charset=UTF-8");
//			response.setCharacterEncoding("UTF-8");
//			os=response.getOutputStream();
//			is=new FileInputStream(file);
//			byte[] buf=new byte[1024];
//			int len=-1;
//			while((len=is.read(buf))!=-1){
//				os.write(buf, 0, len);
//			}
//			os.flush();
//		} catch(Exception e){
//			
//		} finally{
//			try{
//				if(is!=null){
//					is.close();
//				}
//			} catch(IOException e){
//				
//			}
//		}
		
		return false;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}
	
	private String path(String path){
		if(path==null || "".equals(path) || "/".equals(path)){
			return "";
		}else if(!path.startsWith("/")){
			return "/"+path;
		}else{
			return path;
		}
	}
}
