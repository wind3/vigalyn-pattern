package com.vigalyn.pattern.chain.filter;

public interface Filter {

	void doFilter(String param, FilterChain chain);
}
