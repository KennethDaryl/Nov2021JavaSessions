package star;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("---Printing the pyramid pattern---");
		for (int i = 1; i <= rows; i++) {
			// Print space in decreasing order
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			// Print star in increasing order
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
