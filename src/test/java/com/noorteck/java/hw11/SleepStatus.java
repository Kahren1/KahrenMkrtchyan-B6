package com.noorteck.java.hw11;

public class SleepStatus {

	boolean sleepin(boolean isWeekday, boolean isVacation) {
		boolean result = false;

		if (isWeekday != true || isVacation == true) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {

		
		//testing
		boolean amIsleeping;
		amIsleeping = (new SleepStatus()).sleepin(false, false);
		System.out.println(amIsleeping);

	}

}
