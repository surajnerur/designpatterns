package com.creational.abstractfactorypattern;

public abstract class AbstractFactory {

	 abstract Bank getBank(String bankName);
	 abstract Loan getLoan(String loanType);
}
