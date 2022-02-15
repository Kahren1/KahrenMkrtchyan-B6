package broken.abstraction2;

// this class should inerhit DoorDash && Healthy

//class implements an interface, not extends
//changed to implements
//interfaces should be listed with a comma
//DoorDash name misspelled in the name of interface
//will refactor
public class Subway implements DoorDash, Healthy {
	//created int amount and String name to be set and read
	//in DoorDasdDemo
	public int amount;
	public String name;

	// Subway extends Java.lang.Object, super call to Object
	// super() call has improper parameter list, meaningless
	public Subway(String name, int duration) {
		// super(name, duration);

		System.out.println("name:" + name);
		System.out.println("duration: " + duration);
	}

	public void setPrice(double price) {
		System.out.println("Price: " + price);
	}

//implementing methods
	@Override
	public void setCalories() {
		System.out.println("Subway setCalories()");
	}

	@Override
	public void delivery() {
		System.out.println("Subway delivery()");
	}

	@Override
	public void fee() {
		System.out.println("Subway fee()");

	}

	@Override
	public void pickUp() {
		System.out.println("Subway pickUp()");

	}

}