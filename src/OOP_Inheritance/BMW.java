package OOP_Inheritance;

public class BMW extends Car {
//	private BMW() {
//
//	}// Private Constructor

	@Override
	public void start() {
		System.out.println("BMW----start");
	}

	public void autoParking() {
		System.out.println("BMW----Auto Parking");
	}

	public static void price() {
		System.out.println("BMW---price");
	}

	public static void main(String[] args) {

	}

}
