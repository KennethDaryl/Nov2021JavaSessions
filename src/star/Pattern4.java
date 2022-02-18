package star;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("---Printing the pattern---");
		for(int i=1;i<=rows;i++) {
			for(int k=1;k<i;k++) {
				if(i!=1) {
					System.out.print(" ");
				}
			}
			for(int j=rows;j>=i;j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		sc.close();
	}

}
