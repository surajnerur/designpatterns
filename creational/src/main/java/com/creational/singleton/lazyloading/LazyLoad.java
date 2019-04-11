package com.creational.singleton.lazyloading;

public class LazyLoad {

	private static LazyLoad LAZY_LOAD;
	
	public static LazyLoad getInstance() {
		if(LAZY_LOAD==null) {
			LAZY_LOAD=new LazyLoad();
		}
		return LAZY_LOAD;
	}
}
