package broken.abstraction2;

//interface can be ONLY public or default
//abstract keyword ASSUMED
public interface DoorDash {

	// no constructors in interface, not a class!
	// removed a constructor
	public abstract void delivery();

	// regular methods ASSUMED, can only be abstract
	// each method prepended with abstract and public keywords
	public abstract void fee();

	// default keyword is for interface methods with a body
	// will make remove default keyword
	abstract void pickUp();

	// getLocation() return never get assigned, will change to void
	default void getLocation() {
		System.out.println("Rest Town Center");
	}

	public static void setLocation(String location) {
		location = "Reston";
		System.out.println(location);
		// return type is void, which is normal for a setter
		// return location;
	}
}