package broken.abstraction2;

public class DoorDashDemo {

	// to run the program, needs the main method
	public static void main(String[] args) {

		// DoorDash and Healthy, interfaces
		// have no constructor,
		// can't create a DoorDash object
		// DoorDash obj1 = new DoorDash("John", 123);
		// Healthy obj2 = new Healthy();

		// Subway constructor takes 2 parameters
		// will add
		Subway obj3 = new Subway("SW param 1", 5);
		// setPrice method will not be accessible with
		// DoorDash reference, will change the reference
		// to Subway type
		obj3.setPrice(22.22);

		// Chipotle and Subway are siblings,
		// an object can be reference by its own type,
		// its supertype, on implemented interface
		// Subway obj4 = new Chipotle();
		// fee is implemented in both Subway and Chipotle

		Subway obj4 = new Subway("Subway2", 6);
		obj4.fee();
		Chipotle chipObj4 = new Chipotle();
		chipObj4.fee();
//obj4 reference datatype was defined already as of Subway type
	
		//MyChoice object can only have a reference of its own type,
		//a supertype or an implemented interface
		//Chipotle is unrelated type
		//will change the type to Subway
		 Subway subway = new MyChoice("MyChoice", 10);
		 //setPrice takes one argument
		subway.setPrice(10.0);

		//Subway has 2 arg constructor
		Subway obj5 = new Subway("Subway5", 10);

		//to set the field, need to declare it
	   //amount and name were declared in interface where they would be final
		obj5.amount = 22;
		obj5.name = "MD";

		System.out.println(obj5.amount);
		System.out.println(obj5.name);
	}

}
