package broken.abstraction2;

//This class should inerhit Subway
//Subway is a class, can only be extended
public class MyChoice extends Subway {
	//need to add constructor with super() call
	//matching the parent two arg constructor
	
	public MyChoice(String name, int duration) {
		super(name, duration);

	}

	//overriding method should be at least as visible as 
	//the parent method - will change to public
	//parameter should be the same (Datatype, in this case)
	//name of the method needs to match, was misspelled
	@Override 
	public void setPrice(double price) {
		System.out.println("New : " + price);
	}

}