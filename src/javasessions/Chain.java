package javasessions;

public class Chain {
	// Method chaining concept
	public void m1() {
		System.out.println("m1");
		m2();
		Chain.t1();
	}

	public void m2() {
		System.out.println("m2");
		m3();
	}

	public void m3() {
		System.out.println("m3");
	}

	public static void t1() {
		System.out.println("t1");
		Chain.t2();
	}

	public static void t2() {
		System.out.println("t2");
	}

	public static void main(String[] args) {
		Chain.t1();
		Chain c = new Chain();
		c.m1();

	}

}
