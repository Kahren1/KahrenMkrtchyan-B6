package com.noorteck.java.hw9;

public class BrokenCodeTwo {

	public static void main(String[] args) {
		double tempOne=84.7;
		 double tempTwo =66;
		
		boolean result;
		
		if (tempOne <= 0 && tempTwo >= 100) {
			result = true;
		}  else if(tempOne >= 100 && tempTwo <=0) {
			result = true;
		} else {
			result= false;
		}
		
		System.out.println(result);
		
		String season = "Monday";

		switch (season) {
		case "fall":
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");			
			 
		case "s":
			System.out.println("Recovering from cold weather");			
			break;
		case "summer":
			System.out.println("Toooo hot");			
			 
		default:
			System.out.println("Season does not exist!");	
		}
		
		
		for(int i=0; i <10; i++){
			
			if (i == 5){
				System.out.println("I equals to 5");
			} else{
				System.out.println(i +" not equals");
			}
		}
	}

}
