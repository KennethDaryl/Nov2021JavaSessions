package star;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("---Printing the reverse pyramid pattern---");
		for (int i = rows; i >= 1; i--) {
			// Print star in decreasing order
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
			// Print space in increasing order
			for (int j = rows; j >= i; j--) {
				System.out.print(" ");
			}

		}
		sc.close();
	}

}
