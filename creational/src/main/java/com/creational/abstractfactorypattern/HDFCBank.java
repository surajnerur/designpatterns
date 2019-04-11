package com.creational.abstractfactorypattern;

public class HDFCBank implements Bank {

	private final String BNAME;
	
	public HDFCBank() {
		BNAME="HDFC Bank";
	}
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}

}
