package com.noorteck.java.hw8;



public class Hurricane {
	public static void main(String[] args) {
	
		for (int i = 20; i <= 200; i++) {
			if (i >= 74 && i <= 95)
				System.out.println("Cat 1 hurricane, wind speed: " + i);
			else if (i >= 105 && i <= 110)
				System.out.println("Cat 2 hurricane, wind speed: "+i);
			else if(i>=120&&i<=130)
				System.out.println("Cat 3 hurricane, wind speed: "+i);
			else if(i>=140&&i<=155)
				System.out.println("Cat 4 hurricane, wind speed: "+i);
			else if(i>=165&&i<=194)
				System.out.println("Cat 5 hurricane, wind speed: "+i);
		}

	}
}
