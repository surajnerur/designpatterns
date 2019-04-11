package com.creational.factorypattern;

public class GetPlanFactory {

	public Plan getPlanType(String planName) {
		if(planName==null) {
			return null;
		}
		if("Domestic".equals(planName)){
			return new DomesticPlann();
		}
		
		if("Commercial".equals(planName)){
			return new CommercialPlan();
		}
		
		if("Instituational".equals(planName)){
			return new InstitutionalPlan();
		}
		
		return null;
	}
}
