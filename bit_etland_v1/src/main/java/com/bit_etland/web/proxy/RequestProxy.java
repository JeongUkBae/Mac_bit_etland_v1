package com.bit_etland.web.proxy;

import javax.servlet.http.HttpServletRequest;



public class RequestProxy implements Proxy{
	private HttpServletRequest request;

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void carryOut(Object o) {
		System.out.println("----3----");
		if((HttpServletRequest) o != null) {
			System.out.println("o가 널 아님");
			setRequest((HttpServletRequest)o);
			
		}else {
			System.out.println("o가 널 ");
		}
		
		
	}
}
