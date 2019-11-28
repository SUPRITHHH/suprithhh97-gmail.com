package com.testyantra.lambda;

public class TestFactorial {

	public static void main(String[] args) {
		
		FactorialInertface f1 = (n) -> {
			
			int fact=1;
			for(int i=2;i<=n;i++) {
				fact = fact*i;			
			}
			return fact;
		};
		
		int factTotal = f1.factorial(5);
		System.out.println("Factorial is "+factTotal);
	}
}
