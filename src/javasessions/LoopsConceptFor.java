package javasessions;

public class LoopsConceptFor {

	public static void main(String[] args) {

//		for(;;) {
//			System.out.println("Ken");
//		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("---------------");
//		for (double d=1.1;d<=10;d+=0.1) {
//			System.out.println(d);
//		}
//		for (char c='a';c<='z';c++) {
//			System.out.println(c+ ":" +(int)c);
//		}
//		for (char b='A';b<='Z';b++) {
//			System.out.println(b+ ":" +(int)b);
//		}
		for (int i = 1; i <= 11; i += 2) {
			System.out.println(i);
		}
		System.out.println("---------------");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("--------------");
		for (int a = 1; a <= 50; a++) {
			System.out.print(a);
			if (a % 5 == 0) {
				System.out.print("K");
			}
		}
	}

}
