package com.noorteck.java.hw11;

public class Substraction {

	int difference21(int number) {
		int result = (number - 21) * 2;
		if (number <= 21) {
			result = number - 21;
		}

		return result;
	}

	public static void main(String[] args) {

		Substraction obj = new Substraction();


		// testing
		System.out.println(obj.difference21(19));
		System.out.println(obj.difference21(10));
		// There is an error in test result data provided to us.
		// If we pass value 30 the method should return 18, not 22.
		System.out.println(obj.difference21(30));
		System.out.println(obj.difference21(21));
	}

}
