package com.vigalyn.pattern.chain;

import com.vigalyn.pattern.chain.filter.FilterChain;
import com.vigalyn.pattern.chain.filter.PutFilter;
import com.vigalyn.pattern.chain.filter.XssFilter;
import com.vigalyn.pattern.chain.strategy.ChainNode;
import com.vigalyn.pattern.chain.strategy.Customer;
import com.vigalyn.pattern.chain.strategy.Engineer;
import com.vigalyn.pattern.chain.strategy.Manager;
import com.vigalyn.pattern.chain.tempMethod.Handler;
import com.vigalyn.pattern.chain.tempMethod.OneHandler;
import com.vigalyn.pattern.chain.tempMethod.TwoHandler;

/**
 * 责任链模式
 * 场景：一个请求需要被多个对象进行处理时，可以将这些对象连成一条链，请求沿着链传递并被处理；
 * 遵循的设计原则：单一职责原则、
 * @author zengwj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Handler handler1 = new OneHandler();
    	Handler handler2 = new TwoHandler();
    	handler1.setNextHandler(handler2);
    	
    	handler1.execute();
    	
    	FilterChain chain = new FilterChain();
    	chain.addFilter(new PutFilter());
    	chain.addFilter(new XssFilter());
    	chain.doFilter("过滤器责任链");
    	
    	
    }
}
