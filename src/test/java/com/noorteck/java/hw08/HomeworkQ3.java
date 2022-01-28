package com.noorteck.java.hw08;

public class HomeworkQ3 {

	public static void main(String[] args) {

		// avg of numbers between 20 and 30

		// using for loop
		int sum = 0;
		int divisor = 0;
		for (int i = 20; i <= 30; i++) {
			sum += i;
			divisor++;
		}
		System.out.println(sum / divisor);

		int x = 20;
		int sum2 = 0;
		int divisor2 = 0;
		while (x <= 30) {
			sum2 += x;
			x++;
			divisor2++;
		}
		System.out.println(sum2 / divisor2);

		int y = 20;
		int sum3 = 0;
		int divisor3 = 0;

		do  {
			sum3 += y;
			y++;
			divisor3++;
		} while (y <= 30);

		System.out.println(sum3 / divisor3);

	}
}
