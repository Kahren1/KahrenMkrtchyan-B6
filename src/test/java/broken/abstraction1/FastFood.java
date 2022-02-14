package broken.abstraction1;
//Restaurant is a class, can't be implemented 
//but needs to be extended
public  class FastFood extends Restaurant {
	
	public FastFood(String name, int luckyNumber, int waitTime) {
		super(name, luckyNumber, waitTime);
		
	}

	//parent location() is public
	//child needs to be at least as assessible
	public void location() {
		System.out.println("Reston VA");
	}
	
	@Override
	public void setOperationTime() {
		System.out.println("24/7");
	}
	
	@Override
	//overriding method must have matching signature
	//visibility should be no less that of parent method
	public void lunchMenu() {
		System.out.println("Time: ");
	}
	//visibility should be no less that of parent method
	//signature must be the same - will spell the breakfastMenu
	//the same way
	//return should be the same or covariant - change to void
	@Override
	public void breakfastMenu() {
		System.out.println("Not serving...");
	}
	//signature should be the same - change the spelling
	//of the child method
	//include same return type
	@Override 
	public void dinnerMenu() {
		System.out.println("7PM-10PM");
	}
	
	public void display() {
		//parent var discount is final, can't be reassigned
		//DISCOUNT = 30.00;
		
		//luckyNumber is an int, will comment out
		//luckyNumber = 22.22;
		
		//waittime is an int, will comment out
		//waitTime = "NONE";
		
		
		//println can't print void
		//System.out.println(rating());
		rating();
	}
	
	//get info have method body, remove abstract modifier
	public void getInfo() {
		System.out.println("This is info");
	}
	
	//setInfo has no child class to implement the method
	//class in not marked abstract
	//will remove abstract, write method body
	public void setInfo() {
		System.out.println("setInfo method called");
	}
	
	public void rating() {
		System.out.println("forcing implementation on child");
	}
	
	public void specialMenu() {
		System.out.println("forcing specialMenu implementation");
	}

}
