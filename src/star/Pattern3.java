package star;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("---Printing the pattern---");
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
