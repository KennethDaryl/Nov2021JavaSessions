package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i += 1;
		}
		System.out.println("-------------");
//		while(true) {
//			System.out.println("Welcome to our family");
//		}
//		System.out.println();
		boolean flag = true;
		int num = 1;
		while (flag) {
			System.out.println("Welcome to our family Kenneth"); // num =1,num =2
			num++;// num=2, num =3
			if (num == 3) {
				break;
			}
		}
	}

}
