package com.noorteck.java.hw8;

public class HomeworkQ4 {
	public static void main(String[] args) {
	
		int sumOdd = 0;
		int sumEven=0;
		
		for(int i=1; i<=20; i++){
			if(i%2==1) {
				sumOdd+=i;
			}else {
				sumEven+=i;
			}				
		}
		System.out.println("Sum of odd numbers: "+sumOdd);
		System.out.println("Sum of even numbers:"+sumEven);
		
		int sumOdd2=0;
		int sumEven2=0;
		int x=1;
		while(x<=20) {
			if(x%2==1) {
				sumOdd2+=x;
			}else {
				sumEven2+=x;
			}
			x++;
		}
		System.out.println("Sum of odd nums - while loop: "+sumOdd2);
		System.out.println("Sum of even nums - while loop: "+sumEven2);
		
		int sumOdd3=0;
		int sumEven3=0;
		int y=1;
		
		do {
			if(y%2==1) {
				sumOdd3+=y;
			}else {
				sumEven3+=y;
			}
			y++;
		}while(y<=20);
		
		System.out.println("Sum of odd nums - do while loop: "+sumOdd3);
		System.out.println("Sum of odd nums - do while loop: "+sumEven3);
		
		
		
				

	}

}
