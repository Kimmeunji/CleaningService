package com.kh.kej;

public class CleaningRun {
	public static void main(String [] args) {
		CleaningFunction sFunc = new CleaningFunction();
		EXIT :
		
		while(true) {
			int choice = sFunc.printMenu();
			switch(choice) {
			case 1 : 
				sFunc.inputCustomer();
				break;
			case 2 : 
				sFunc.inputCleaningOne();
				break;
			case 3 : 
				sFunc.inputCleaningTwo();
				break;
			case 4 : 
				sFunc.printResult();
				break;
			case 5 : 
				sFunc.endMsg();
				break EXIT;
				
			default : 
				sFunc.exceptionMsg();
				break;
			
			}
			
		}
	}
}
