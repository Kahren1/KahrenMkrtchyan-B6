package broken.abstraction2;

public interface Healthy {
	// interface variables must be set when they are declared
	// because they are FINAL
	
	// int amount;
	
	// vars in interfaces can only be PUBLIC STATIC FINAL
	// no var can be abstract
	
	// vars in interfaces can only be initialized on the line of declaration.
	
	// String name;

	// There could be no constructors in interface
//	public Healthy(int calorie) {
//		System.out.println("Calorie: " + calorie );
//	}
	// no place for constructors in interface!
//	public Healthy(int calorie, int amount) {
//		System.out.println("Amount: " + amount);
//		System.out.println("Calorie:" + calorie);
//	}
	// method with the method body can't be abstract
	public default void getCalories(String type) {
		System.out.println("Organic");
	}

	public abstract void setCalories();
}