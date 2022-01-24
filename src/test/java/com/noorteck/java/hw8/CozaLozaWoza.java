package com.noorteck.java.hw8;

public class CozaLozaWoza {
	public static void main(String[] args) {
		/*
		 * Write a program called CozaLozaWoza (class Name) which prints the numbers 1
		 * to 36 The program shall print 
		 * 
		 * "Coza" in place of the numbers which are
		 * multiples of 3 ONLY, ( I % 3 ==0) 
		 * 
		 * "Loza" for multiples of 5 ONLY, ( I % 5 ==0) 
		 * "Woza" for multiples of 7 ONLY, ( I % 7 == 0) 
		 * "CozaLoza" for multiples of 3 and 5 
		 * 
		 * If the number is not divisible of the above condition, then print the
		 * number itself
		 *
		 * Example, the output should look like: 1, 2 , Coza, 4 , Loza, Coza, Woza, 8,
		 * Coza, Loza, CozaLoza
		 * 
		 */
		
		for (int i=1;i<=36; i++) {
			if(i%3==0)
				System.out.println("Coza");
			if(i%5==0)
				System.out.println("Loza");
			if(i%7==0)
				System.out.println("Woza");
			if(i%3==0&&i%5==0)
				System.out.println("CozaLoza");
			if(i%3!=0&&i%5!=0&&i%7!=0)
				System.out.println(i);
			
		}

	}

}
