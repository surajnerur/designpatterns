package com.creational.abstractfactorypattern;

public class BankFactory extends AbstractFactory{

	@Override
	Bank getBank(String bankName) {
		if(bankName==null){
			return null;
		}
		
		if("ICIC Bank".equals(bankName)) {
			return new ICICBank();
		}
		if("HDFC Bank".equals(bankName)) {
			return new HDFCBank();
		}
		if("SBI Bank".equals(bankName)) {
			return new SBIBank();
		}
		return null;
	}

	@Override
	Loan getLoan(String loanType) {
		// TODO Auto-generated method stub
		return null;
	}

}
