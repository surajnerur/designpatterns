package com.creational.factorypattern;

public abstract class Plan {

	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units){
		//rate = this.getRate();
		System.out.println(units*rate);
	}
}
