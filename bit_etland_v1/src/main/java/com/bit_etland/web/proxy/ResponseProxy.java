package com.bit_etland.web.proxy;

import javax.servlet.http.HttpServletResponse;



public class ResponseProxy implements Proxy{
	private HttpServletResponse response;

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void carryOut(Object o) {
		System.out.println("----4----");
		if((HttpServletResponse)o != null) {
			System.out.println("o가 널 아님");
			setResponse((HttpServletResponse)o);
		}else {
			System.out.println("o가 널");
		}
		
	}
}
