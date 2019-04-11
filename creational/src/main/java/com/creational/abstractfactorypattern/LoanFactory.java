package com.creational.abstractfactorypattern;

public class LoanFactory extends AbstractFactory {

	@Override
	Bank getBank(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Loan getLoan(String loanType) {
		if(loanType==null) {
			return null;
		}
		if("Home".equals(loanType)) {
			return new HomeLoan();
		}
		if("Car".equals(loanType)) {
			return new CarLoan();
		}
		return null;
	}

}
