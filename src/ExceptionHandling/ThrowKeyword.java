package ExceptionHandling;

public class ThrowKeyword {

	public static void getData() {
		String data = null;
		if (data == null) {
			System.out.println("data is null");
			try {
			throw new Exception();
		}
			catch (Exception e) {
				System.out.println("Exception is coming");
				e.printStackTrace();
			}

	}
	}

	public static void main(String[] args) {
		ThrowKeyword.getData();

	}

}
