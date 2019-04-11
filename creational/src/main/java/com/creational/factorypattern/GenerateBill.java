package com.creational.factorypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		GetPlanFactory getPlanFactory = new GetPlanFactory();
		 
	     System.out.print("Enter the name of plan for which the bill will be generated: ");  
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	     String planName=br.readLine();  
	     System.out.print("Enter the number of units for bill will be calculated: ");  
	     int units=Integer.parseInt(br.readLine());  	

	      Plan plan = getPlanFactory.getPlanType(planName);
	      System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
          plan.getRate();  // getRate() and calculateBill can be put together into another method or getRate() can be called from calculateBill() method for facade pattern 
          plan.calculateBill(units);  
           //}
	      //plan.calculateBill(units);
	}

}
