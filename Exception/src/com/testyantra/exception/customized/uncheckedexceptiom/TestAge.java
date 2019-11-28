package com.testyantra.exception.customized.uncheckedexceptiom;

public class TestAge {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		Validator v = new Validator();
		try {
		v.verify(12);
		}catch(InvalidAgeException age) {
			System.out.println(age.getMessage());
		}
		
//		v.verify(13);

		System.out.println("Main Ended");
	}
}
