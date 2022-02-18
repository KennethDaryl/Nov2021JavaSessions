package javasessions;

public class MethodOverlaoding {
	public void test() {
		System.out.println("test method");
	}

	public void test(int i) {
		System.out.println("testing method with integer: " + i);
	}

	public void test(int i, int j) {
		System.out.println("Adding 2 integers: " + (i + j));
	}

	public void test(String j, int i) {
		System.out.println("testing method with name and value: " + (j + i));
	}

	public void test(int i, String j) {
		System.out.println("testing method with integer and name: " + (i + i + j));
	}

	public static void main(String[] args) {
		MethodOverlaoding callMethod = new MethodOverlaoding();
		callMethod.test();
		callMethod.test("Kenneth", 20);
		callMethod.test(2000);
		callMethod.test(250, 250);
		callMethod.test(25, "Suuuup");

	}

}
