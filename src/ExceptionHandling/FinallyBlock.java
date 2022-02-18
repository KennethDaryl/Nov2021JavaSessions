package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		try{
			int i = 9 / 0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
		}
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");

	}

}
