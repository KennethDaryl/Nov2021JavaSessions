package Finalize;

public class Company {
	
	@Override
	public void finalize() {
		System.out.println("Company----finalize method");
	}

	public static void main(String[] args) {

	}

}
