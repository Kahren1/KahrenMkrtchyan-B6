package com.noorteck.java.hw11;

public class MonkeyStatus {

	boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean result = false;

		if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {
		boolean areWeinTrouble;

		MonkeyStatus obj = new MonkeyStatus();

		// testing
		areWeinTrouble = obj.monkeyTrouble(true, true);
		System.out.println(areWeinTrouble);
		areWeinTrouble = obj.monkeyTrouble(true, false);
		System.out.println(areWeinTrouble);
		areWeinTrouble = obj.monkeyTrouble(false, false);
		System.out.println(areWeinTrouble);


	}

}
