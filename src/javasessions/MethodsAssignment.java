package javasessions;

public class MethodsAssignment {
	// 1. Write a program to print the sum of two numbers entered by user by
	// defining your own method
	// 2. Define a method that returns the product of two numbers entered by user.
	// 3.Write a program to print the circumference and area of a circle of radius
	// entered by user by defining your own method.
	// 4. Define two methods to print the maximum and the minimum number
	// respectively among three numbers entered by user.
	// 5. Define a program to find out whether a given number is even or odd.
	// 7. Define a method to find out if number ﻿is prime or not.
	// 9. Write a program to print the factorial of a number by defining a method
	// named 'Factorial'
	public void add(int a, int b) {
		System.out.println("Adding 2 numbers: " + (a + b));
	}

	public int multipy(int a, int b) {
		System.out.print("Multiplying 2 numbers: ");
		int c = a * b;
		return c;
	}

	public void maxNumber(int d, int e, int f) {
		if (d > e && d > f) {
			System.out.println("Maximum no. is: " + d);
		} else if (e > d && e > f) {
			System.out.println("Maximum no. is: " + e);
		} else {
			System.out.println("Maximum no. is: " + f);
		}
	}

	public void minNumber(int g, int h, int i) {
		if (g < h && g < i) {
			System.out.println("Min no. is: " + g);
		} else if (h < g && h < i) {
			System.out.println("Min no. is: " + h);
		} else {
			System.out.println("Min no. is: " + i);
		}
	}

//	public void circleCalculation(int radius) {
//		System.out.println("Circumference of Circle: " + 2 * 3.14 * (radius));
//		System.out.println("Area of circle: " + 3.14 * (radius * radius));
//	}
//
//	public void evenOrOddnumber(int j) {
//		if (j % 2 == 0) {
//			System.out.println(j + " is a even number");
//		} else {
//			System.out.println(j + " is a odd number");
//		}
//	}
//
//	public void defineGradeForMarks(int k) {
//		if (k >= 91 && k <= 100) {
//			System.out.println("Grade is AA");
//		} else if (k >= 81 && k <= 90) {
//			System.out.println("Grade is AB");
//		} else if (k >= 71 && k <= 80) {
//			System.out.println("Grade is BB");
//		} else if (k >= 61 && k <= 70) {
//			System.out.println("Grade is BC");
//		} else if (k >= 51 && k <= 60) {
//			System.out.println("Grade is CD");
//		} else if (k >= 41 && k <= 50) {
//			System.out.println("Grade is DD");
//		} else {
//			System.out.println("Fail");
//		}
//	}
	public void checkPrimeNumber(int p) {
		int flag = 0;
		if (p == 0 || p == 1) {
			System.out.println(p + " is not prime number");
		} else {
			for (int i = 2; i <= p / 2; i++) {
				if (p % i == 0) {
					System.out.println(p + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(p + " is prime number");
			}
		}
	}
	public void factorial(int t) {
		int fact = 1;
		for(int i=1;i<=t;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of a given number is: " + fact);
	}

	public static void main(String[] args) {
		MethodsAssignment aa = new MethodsAssignment();
		aa.add(2, 4);
		int num = aa.multipy(2, 4);
		System.out.println(num);
		// aa.circleCalculation(8);
		aa.maxNumber(40, 70, 30);
		aa.minNumber(2, 3, 4);
		// aa.evenOrOddnumber(20);
		// aa.defineGradeForMarks(91);
		aa.checkPrimeNumber(18);
		aa.factorial(6);
	}

}
