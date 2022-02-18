package javasessions;

public class ConditionalOperatorsAssignment {

	public static void main(String[] args) {
		// 1. Take three numbers from the user and print the greatest number. 
		int a = 25;
		int b = 78;
		int c = 87;
		if (a > b) {
			if (a > c) {
				System.out.println("The greatest:" + a);
			} else {
				System.out.println("The greatest:" + c);
			}

		} else if (b > a) {
			if (b > c) {
				System.out.println("The greatest:" + b);
			} else {
				System.out.println("The greatest:" + c);
			}
		}
		System.out.println("------------");
		// 2. Write a Java program to test a number is positive or negative.
		int d = 35;
		int e = -11;
		if (d >= 0) {
			System.out.println(d + " is positive number");
		} else {
			System.out.println(d + " is negative number");
		}
		if (e >= 0) {
			System.out.println(e + " is positive number");
		} else {
			System.out.println(e + " is negative number");
		}
	}

}
