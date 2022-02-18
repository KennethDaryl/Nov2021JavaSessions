package star;

import java.util.Scanner;

public class Pattern6 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("----Printing the pattern----");
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=rows;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=rows-1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=rows-1;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
