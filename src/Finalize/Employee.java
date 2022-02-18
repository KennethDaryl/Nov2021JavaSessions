package Finalize;

public class Employee {
	String name;

	@Override
	public void finalize() {
		System.out.println("Employee----finalize method");// hover on finalize method (keyword) to understand the concept
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e = null;
		Company c = new Company();
		c = null;
		System.gc();

	}

}
