package com.creational.abstractfactorypattern;

public class HomeLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate=rate;
	}

}
