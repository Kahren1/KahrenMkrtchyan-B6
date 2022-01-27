package com.noorteck.java.hw10;

public class HomeworkQ4 {
	public static void getDoWhileLoopResult(int minNum, int maxNum) {
		if (minNum > maxNum) {
			System.out.println("Error. First argument should be even or less than the second argument");
		} else {
			int x = minNum;
			do {
				System.out.println(x);
				x++;

			} while (x <= maxNum);
		}
	}

	public static void main(String[] args) {
		// testing
		getDoWhileLoopResult(5, 10);
		getDoWhileLoopResult(5, 5);
		getDoWhileLoopResult(10, 5);

	}

}
