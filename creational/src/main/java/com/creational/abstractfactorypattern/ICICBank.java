package com.creational.abstractfactorypattern;

public class ICICBank implements Bank {

	private final String BNAME;
	
	public ICICBank(){
		BNAME="ICICI bank";
	}
	@Override
	public String getBankName() {
		return BNAME;
	}

}
