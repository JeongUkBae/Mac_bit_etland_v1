package com.bit_etland.web.proxy;



public class PageProxy implements Proxy{
	private Pagination page;
	
	
	public Pagination getPage() {
		return page;
	}


	public void setPage(Pagination page) {
		this.page = page;
	}


	@Override
	public void carryOut(Object o) {
		setPage((Pagination)o);
			
	}
}

