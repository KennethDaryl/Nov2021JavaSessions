package javasessions;

public class Car {
	// static concept
	String name;
	int price;
	String color;
	static int wheels = 4;

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 60;
		c1.color = "Black";
		System.out.println(Car.wheels);
		System.out.println(c1.name + " " + c1.price + " " + c1.color);
		Car c2 = new Car();
		c2.name = "Mercedes Benz";
		c2.price = 80;
		c2.color = "Red";
		System.out.println(c2.name + " " + c1.price + " " + c2.color);
	}

}
