package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		// Creating object of BMW
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoParking();
		b.engine();
		b.automobile_manufacture();
		b.engineerRoles();
		b.name = "Kenneth";
		System.out.println(b.name);
		System.out.println(Car.wheels);
		System.out.println(BMW.wheels);
		System.out.println();
		
		
		

		// Top Casting - Car - BMW
		Car c = new BMW();
		c.start();
		c.refuel();
		c.stop();
		Car.price();
		BMW.price();
		c.engine();
		c.automobile_manufacture();
		c.engineerRoles();
		b.name = "Keith";
		System.out.println(b.name);
		System.out.println(Car.wheels);
		System.out.println(BMW.wheels);
		// System s = new System();
		// BMW b1 = (BMW)new Car();

		// Top Casting - Vehicle - BMW
		Vehicle v = new BMW();
		v.engine();
		v.automobile_manufacture();
		v.engineerRoles();

		// Creating object of Audi
		Audi a = new Audi();
		a.theftSafety();
		a.name = "Keithhhh";
		System.out.println(a.name);
		System.out.println(Car.wheels);
		System.out.println(BMW.wheels);

		// Top Casting - Automobile - BMW
		Automobile aa = new BMW();
		aa.automobile_manufacture();
		aa.engineerRoles();

		// Top Casting - Engineering - BMW
		Engineering e = new BMW();
		e.engineerRoles();

	}

}
