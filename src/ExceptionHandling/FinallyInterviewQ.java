package ExceptionHandling;

public class FinallyInterviewQ {
	public static int getMarks(String name) {
		int marks = 0;
		System.out.println("Enter student's name: " + name);
		if (name.equals("Ken")) {
			try {
				marks = 90 / 2;
				// System.exit(0);
			} catch (ArithmeticException e) {
				System.out.println("AE is coming...");
				return -2;
			}

			finally {
				System.out.println("finally block");
				return -3;
			}
		} else if (name.equals("Kei")) {
			marks = 95;
		} else {
			System.out.println("Pass a right student's name");
			return -1;
		}
		return marks;
	}

	public static void main(String[] args) {
		int m = FinallyInterviewQ.getMarks("Ken");
		System.out.println(m);

	}

}
