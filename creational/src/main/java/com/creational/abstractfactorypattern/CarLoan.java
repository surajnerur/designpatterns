package com.creational.abstractfactorypattern;

public class CarLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate=rate;
	}

}
