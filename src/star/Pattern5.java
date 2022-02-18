package star;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("----Printing the pattern----");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=rows-1;i++) {
			for(int j=rows-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
			}
		sc.close();
	}

}
