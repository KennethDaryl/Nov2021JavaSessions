package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		String s = "Hello";
		String t = "World";
		int a = 10;
		int b = 20;
		int c = 2;
		int d = c++;
		char e = 'a';
		char f = 'b';
		char g = 'A';
		char h = '0';
		System.out.println(s + t);
		System.out.println(a + b + s + t + a + b);
		System.out.println(0.0 / 0);
		System.out.println(1.0 / 0);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(e + f);
		System.out.println((int) g);
		System.out.println((int) h);
	}

}
