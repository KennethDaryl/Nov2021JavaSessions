package javasessions;

public class LoopsAssignment {

	public static void main(String[] args) {
		// 1 and 2. Print statement "I am Batman" 5 times using for/while/do while loop
		for (int i = 1; i <= 5; i++) {
			System.out.println("I am Batman");
		}
		System.out.println("--------");
		int i = 1;
		while (i <= 5) {
			System.out.println("I am Batman");
			i++;
		}
		System.out.println("-------");
		int j = 1;
		do {
			System.out.println("I am Batman");
			j++;
		} while (j <= 5);
		System.out.println("----------");
		for (int k = 1; k <= 9; k++) {
			System.out.println("I am Batman" + " " + k);
		}
		System.out.println("----------");
		// 3. WAP to print 10 to 1 using for, while and do-while loop
		for (int q = 10; q >= 1; q--) {
			System.out.println(q);
		}
		System.out.println("----------");
		int w = 10;
		while (w >= 1) {
			System.out.println(w);
			w--;
		}
		System.out.println("----------");
		int e = 10;
		do {
			System.out.println(e);
			e--;
		} while (e >= 1);
		System.out.println("----------");
		// 4. Write a program in Java to print "Hello World" ten times using while loop
		int r = 1;
		while (r <= 10) {
			System.out.println("Hello World");
			r++;
		}
		System.out.println("----------");
		// 5. Write a program in Java to print 1 to 100 using while loop but quit if
		// multiple of 7 is encountered
		int t = 1;
		while (t <= 100) {
			if (t % 7 != 0) {
				System.out.println(t);
			}
			t++;
		}

	}

}
