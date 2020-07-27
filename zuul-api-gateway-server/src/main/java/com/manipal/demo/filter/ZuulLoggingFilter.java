package com.manipal.demo.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


@Component
public class ZuulLoggingFilter extends ZuulFilter {
Logger logger =LoggerFactory.getLogger(this.getClass()); 
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		logger.info("request is {} - request url - {}, ",request, request.getRequestURI());
		//System.out.println("=================================================================");
		//System.out.println("Request Method : " +request.getMethod()+ "\nRequest URL : "+request.getRequestURI());
		//System.out.println("=================================================================");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	
}