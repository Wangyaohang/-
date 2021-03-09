package com.wyh.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wyh.utils.IpAddress;
@WebFilter(filterName="EnterFilter",urlPatterns="/*")
public class EnterFilter implements Filter{
	private static Logger log=LoggerFactory.getLogger(EnterFilter.class);
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response=(HttpServletResponse) res;
		log.info("访问用户: "+IpAddress.getClientIpAddress(request));
		log.info("请求接口: ".concat(request.getServletPath()));
		chain.doFilter(request, response);
	}

}
