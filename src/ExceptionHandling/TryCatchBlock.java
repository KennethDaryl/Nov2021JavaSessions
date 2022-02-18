package ExceptionHandling;

public class TryCatchBlock {

	String name;

	public static void main(String[] args) {
		// Thread.sleep(48999);
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			// int i = 9 / 0;
			int k[] = new int[2];
			k[3] = 40;
		}

		catch (ArithmeticException e) {
			System.out.println("AE is coming..");
			e.printStackTrace();
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB is coming..");
			e.printStackTrace();
		}
		System.out.println("Bye");
		System.out.println("Bye");

		TryCatchBlock obj = new TryCatchBlock();
		obj = null;
		try {
			obj.name = "Ken";
		} catch (NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();
		}

	}
}
