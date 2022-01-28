package com.noorteck.java.hw11;

public class DoubleTotal {

	int sumDouble(int valueOne, int valueTwo) {
		int result;

		if (valueOne != valueTwo) {
			result = valueOne + valueTwo;
		} else {
			result = (valueOne + valueTwo) * 2;
		}

		return result;
	}

	public static void main(String[] args) {
		int myTotal;

		DoubleTotal obj = new DoubleTotal();

		// testing
		myTotal = obj.sumDouble(1, 2);
		System.out.println(myTotal);
		myTotal = obj.sumDouble(3, 2);
		System.out.println(myTotal);
		myTotal = obj.sumDouble(2, 2);
		System.out.println(myTotal);

	}

}
