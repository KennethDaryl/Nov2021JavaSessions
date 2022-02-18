package javasessions;

import java.util.Arrays;

public class ArraysConceptDifDataTypes {

	public static void main(String[] args) {
		double d[] = new double[2];
		d[0] = 12.3333;
		// d[1] = 34.222;
		for (int c = 0; c < d.length; c++) {
			System.out.println(d[c]);
		}
		System.out.println("---------");
		for (double c : d) {
			System.out.println(c);
		}
		System.out.println("---------");
		System.out.println(Arrays.toString(d));
		System.out.println("-----------");
		char h[] = new char[3];
		h[0] = 'w';
		h[1] = 'Z';
		// h[2] = '3';
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i]);
		}
		System.out.println("--------");
		System.out.println(h[1] + h[2]);
		System.out.println("--------");
		for (char r : h) {
			System.out.println(r);
		}
		System.out.println("--------");
		System.out.println(Arrays.toString(h));
		System.out.println("--------");

		String emp[] = new String[3];
		// emp[0] = "Ken";
		emp[1] = "Suup";
		emp[2] = "Kei";
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
		System.out.println("--------");
		for (String f : emp) {
			System.out.println(f);
		}
		System.out.println("--------");
		System.out.println(Arrays.toString(emp));
		System.out.println("--------");
		Object st[] = new Object[3];
		st[0] = "Kenneth";
		st[1] = true;
		st[2] = 28;
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		System.out.println("--------");
		for (Object tt : st) {
			System.out.println(tt);
		}
		System.out.println("--------");
		System.out.println(Arrays.toString(st));
	}

}
