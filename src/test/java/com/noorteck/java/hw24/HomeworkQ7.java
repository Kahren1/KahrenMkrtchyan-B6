package com.noorteck.java.hw24;

public class HomeworkQ7 {
	
	public static int getIndexNumber(int[]number, int elementValue) {
		int result=-1;
		
		for(int i=0;i<number.length;i++) {
			if (number[i]==elementValue) {
				result=i;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		//testing with Test Data
		int []array1 = {88,22,6,1,2,3,88,22,44,33};
		int[] array2 = {1,2,3,22,44,33};
		int[] array3 = {88,22,6, 1,8,0};
		int [] array4 = {2,3,88,22,44};
		
		System.out.println(getIndexNumber(array1, 3));
		System.out.println(getIndexNumber(array2, 12));
		System.out.println(getIndexNumber(array3, 22));
		System.out.println(getIndexNumber(array4, 44));
	}

}
