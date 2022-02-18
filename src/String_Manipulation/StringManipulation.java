package String_Manipulation;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "Hello this is my Java codE in thin";
		System.out.println(str.charAt(25));
		System.out.println(str.length());
		System.out.println(str.indexOf('i'));// 1st occurence of 'i'
		// System.out.println(str.indexOf('i', 9));
		System.out.println(str.indexOf('i', str.indexOf('i') + 1));// 2nd occurence of 'i'
		int i = str.indexOf('i', str.indexOf('i') + 1);
		System.out.println(str.indexOf('i', i + 1));
		i = str.indexOf('i', i + 1);
		System.out.println(str.indexOf('i', i + 1));
		System.out.println(str.indexOf("codE"));
		System.out.println(str.indexOf("qwer"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		String t1 = "hello world";
		String t2 = "Hello World ";
		System.out.println(t1.equalsIgnoreCase(t2.trim()));
		String t3 = "  H E ll o K E i th ";
		System.out.println(t3.trim());
		System.out.println(t3.replace(" ", ""));
		System.out.println(str.contains("this"));
		String s4 = "Java;Python;JS;C++";
		String s[] = s4.split(";");
		System.out.println(s.length);
		System.out.println(s[1]);
		for (String e : s) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(s));
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j]);
		}
		System.out.println();
		String s11 = "Selenium";
		for (int m = s11.length() - 1; m >= 0; m--) {
			System.out.print(s11.charAt(m));
		}
	}

}
