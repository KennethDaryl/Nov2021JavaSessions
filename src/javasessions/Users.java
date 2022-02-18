package javasessions;

public class Users {
	// MethodsConcept
	public void test() {
		System.out.println("method");
	}

	public int getNumber() {
		System.out.println("Get number method");
		return 100;
	}

	public String getTrainersName() {
		System.out.println("Get Trainer's name");
		// return "Naveen";
		String name = "Naveen";
		return name;
	}

	public boolean isForgottenPasswordLink() {
		System.out.println("Checking Forgot Password link");
		return true;
	}

	public int add(int a, int b) {
		System.out.println("Adding 2 numbers");
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		Users me = new Users();
		me.test();
		int num = me.getNumber();
		System.out.println(num + 4);
		String name1 = me.getTrainersName();
		System.out.println(name1);
		boolean flag = me.isForgottenPasswordLink();
		if (flag) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		int add1 = me.add(10, 20);
		System.out.println(add1 + 30);// advantage of return is can do additional calculations
	}

}
