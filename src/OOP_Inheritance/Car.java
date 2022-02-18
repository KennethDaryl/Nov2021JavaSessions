package OOP_Inheritance;

public class Car extends Vehicle {

	String name;
	static int wheels = 4;
	public void start() {
		System.out.println("Car----start");
	}

	public void stop() {
		System.out.println("Car----stop");
	}

	public void refuel() {
		System.out.println("Car----refuel");
	}

	public static void price() {
		System.out.println("Car---price");
	}

	public static void main(String[] args) {

	}

}
