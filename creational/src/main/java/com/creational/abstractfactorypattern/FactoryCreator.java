package com.creational.abstractfactorypattern;

public class FactoryCreator {

	public static AbstractFactory getFactory(String name) {
		if("bank".equals(name)) {
			return new BankFactory();
		}
		if("loan".equals(name)) {
			return new LoanFactory();
		}
		return null;
	}
}
