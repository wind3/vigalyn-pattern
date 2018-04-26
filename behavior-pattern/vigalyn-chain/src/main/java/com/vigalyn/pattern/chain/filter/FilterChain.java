package com.vigalyn.pattern.chain.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	
	private int cursor ;
	private List<Filter> filters = new ArrayList<Filter>();
	
	public void addFilter(Filter filter) {
		filters.add(filter);
	}
	
	public void doFilter(String param ) {
		if (cursor < filters.size()) {
			filters.get(cursor++).doFilter(param, this);
		}else {
			System.out.println("责任链结束");
		}
	}
}
