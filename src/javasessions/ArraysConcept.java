package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 8 };
//		int a[] = new int[4];
		int len = a.length;
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 12;
//		a[3] = 101;
		for (int i = 0; i <= len - 1; i++) {
			System.out.println(a[i]);
		}
		System.out.println("-------");
		for (int s : a) {
			System.out.println(s);
		}
		System.out.println("-------");
		System.out.println(Arrays.toString(a));
		System.out.println("-------");
		int b = 0;
		while (b<a.length) {
			System.out.println(a[b]);
			b++;
		}

	}
}
