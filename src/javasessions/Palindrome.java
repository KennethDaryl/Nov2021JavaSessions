package javasessions;

public class Palindrome {

	public static void main(String[] args) {
		int num = 12321;
		int num1 = num;
		int rem;
		int rev = 0;
		while (num != 0) {
			rem = num % 10;// 1,2,3,2,1
			rev = (rev * 10) + rem;// 1,12,123,1232,12321
			num = num / 10;// 1232,123,12,1,0
		}
		if (num1 == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

}
