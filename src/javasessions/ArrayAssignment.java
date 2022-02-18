package javasessions;

public class ArrayAssignment {

	public static void main(String[] args) {
		// 1: Write a program to print the following pattern using for loop:
		int a[] = { 00, 01, 02, 03, 04, 05, 06, 07, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int b[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		int c[] = { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 };
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		int d[] = { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 };
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.println();
		System.out.println("-----------");
		// Write a program to create a static Array, having following cricket data:
		Object player1[] = { "Ken", 28, "India", "9/8/1993", 'M', 50.00, true };
		for (int i = 0; i < player1.length; i++) {
			System.out.print(player1[i] + " ");
		}
		System.out.println();
		Object player2[] = { "Keith", 28, "Australia", "9/8/1993", 'M', 230.00, true };
		for (int i = 0; i < player2.length; i++) {
			System.out.print(player2[i] + " ");
		}
		System.out.println();
		System.out.println("----------");
		int i = 0;
		while (i < player1.length) {
			System.out.print(player1[i] + " ");
			i++;
		}
		System.out.println();
		int j = 0;
		while (j < player2.length) {
			System.out.print(player2[j] + " ");
			j++;
		}
		System.out.println();
		System.out.println("----------");
		for (Object t : player1) {
			System.out.print(t + " ");
		}
		System.out.println();
		for (Object y : player2) {
			System.out.print(y + " ");
		}
		System.out.println();
		System.out.println("----------");
		// 3: Try to print the following pattern on the console:
		int q[] = { 4, 3, 2, 1, 0 };
		for (int m : q) {
			System.out.println("n = " + m);
		}
	}

}
