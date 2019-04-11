package com.creational.singleton.earlyloading;

public class EarlyLoad {

	private static EarlyLoad EARLY_LOAD = new EarlyLoad();
	
	public static EarlyLoad getInstance() {
		return EARLY_LOAD;
	}
}
