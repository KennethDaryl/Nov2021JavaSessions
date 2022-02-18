package javasessions;

public class LoopsConceptDoWhile {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		do {
			if (a % 2 == 0) {
				System.out.println(a);
			}
			a++;
		} while (a <= 10);

		System.out.println("-------------");
		do {
			b++;
			System.out.println(b);
			// b++;
		} while (b <= 10);
	}

}
