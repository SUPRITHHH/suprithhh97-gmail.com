package com.testyantra.exception.costumized.checkedexception;

public class TestAmount {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		ValidateAmount va = new ValidateAmount();
		try {
		va.checkAmount(50000);
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main Ended");
	}
}
