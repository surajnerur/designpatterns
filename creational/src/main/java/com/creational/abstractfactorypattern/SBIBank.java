package com.creational.abstractfactorypattern;

public class SBIBank implements Bank {

	private final String BNAME;
	
	public SBIBank() {
		BNAME="SBI Bank";
	}
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}

}
