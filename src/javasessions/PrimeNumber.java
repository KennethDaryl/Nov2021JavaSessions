package javasessions;

public class PrimeNumber {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 50; i++) {
			int flag = 0;
			if (i == 0 || i == 1) {
				continue;
			} else {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					System.out.print(" " + i);
				}
			}

		}
	}
}
