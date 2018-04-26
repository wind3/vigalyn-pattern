package com.vigalyn.pattern.chain.filter;

public class PutFilter implements Filter {

	public void doFilter(String param, FilterChain chain) {
		System.out.println("PutFilter 执行一些业务逻辑");
		chain.doFilter(param);
	}

}
