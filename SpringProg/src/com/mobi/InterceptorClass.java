package com.mobi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * This class act as the filter in servlet.
 * we need the extends the HandlerInterceptorAdapter and 
 * makes the entery of this class in the dispatcher servlet**/
public class InterceptorClass extends HandlerInterceptorAdapter {
	
	/**This is method is hit before all the method.
	 * if it return the true then its hits other the conteroller else not**/
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		System.out.println("This is preHandle method stmt...");
		
		/** if we does not access the other controller, then return the false with msg(optional)**/
		/*if (true)
		{
			response.getWriter().write("this is site can not reached this time...");
			return false;
		}*/
		
		return true;
	}
	
	/**This method is hit after controller and before the view hits.**/
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception
	{
		System.out.println("This is the post Handle method...");
	}
	
	/**This method is hit after controller and view.**/
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) throws Exception
	{
		System.out.println("This is the afterCompletion method...");
	}
}
