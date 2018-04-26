package com.vigalyn.pattern.chain.filter;

public class XssFilter implements Filter {

	public void doFilter(String param, FilterChain chain) {
		System.out.println("XssFilter 执行一些业务逻辑");
		chain.doFilter(param);
	}

}
