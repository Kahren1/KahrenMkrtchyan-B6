package broken.abstraction2;

//this class should inerhit DoorDash && Healthy
public class Chipotle implements DoorDash, Healthy{

	@Override
	public void setCalories() {
		System.out.println("Chipotle setCalories()");
		
	}

	@Override
	public void delivery() {
		System.out.println("Chipotle delivery()");
		
	}

	@Override
	public void fee() {
		System.out.println("Chipotle fee()");
		
	}

	@Override
	public void pickUp() {
		System.out.println("Chipotle pickUp");
		
	}
 
		
}