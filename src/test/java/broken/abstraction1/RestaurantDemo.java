package broken.abstraction1;

public class RestaurantDemo {
	//String is non-primiteve class - capitalize S
	//pesky semicolon
	public static void main(String[] args) {
		//Datatype misspelled
	//Restaurant is an abstract class
		//can't call Restaurant constructor directly
		Restaurant obj1 = new FastFood("Jake", 1,2);
		obj1.location();
		System.out.println(obj1.DISCOUNT);
		
		//add params to caller
		FastFood obj2 = new FastFood("John", 8,5 );
		//getInfo, setInfo are child methods
		//not present withing parent class
		//reference datatype determines which vars and methods
		//are accessible
		//to get access, will switch the reference to the same type 
		//as the object
		//one-param getInfo method is not available,
		//will call no param getInfo instead
		obj2.getInfo();
		obj2.setInfo();
		
		//call to constructor must have matching params
		//constructor name must match - Java is case sensitive
		FastFood obj3 = new FastFood("John Cena", 12, 5);
		
		//final field can't be reassigned
		//obj3.DISCOUNT = 44.44;
		
		//both menus return void - should be called directrly
		//not passed as arguments
//		System.out.println(obj3.dinnerMenu());
//		System.out.println(obj3.lunchMenu());
		obj3.dinnerMenu();
		obj3.lunchMenu();
		
		
	}
 

}