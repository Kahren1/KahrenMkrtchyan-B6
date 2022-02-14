package broken.abstraction1;

public abstract class Restaurant {
	public final double DISCOUNT = 20.00;
	public int luckyNumber= 12;
	public  int waitTime= 20;
	public String name;
	
	public Restaurant(String name, int luckyNumber, int waitTime) {
		this.name = name;
		this.luckyNumber = luckyNumber;
		this.waitTime = waitTime;
		
		System.out.println(this.name);
		System.out.println(this.waitTime);
		System.out.println(this.luckyNumber);
	}
	
	
	//static method can't be overridden - remove static keyword
	public abstract void location();
	
	//can't override static, will remove the keyword
	public void setOperationTime() {
		System.out.println("Monday-Friday");
	}
	
	//needs to be abstract - no method body. 
	//can't be final - needs to be overridden (implemented)
	public abstract void specialMenu();
	
	
	abstract void rating();
	//have method body - remove abstract keyword
	public void breakfastMenu() {
		System.out.println("9AM-11AM");
	}
	
	public abstract void lunchMenu();

	public abstract void dinnerMenu();
}
