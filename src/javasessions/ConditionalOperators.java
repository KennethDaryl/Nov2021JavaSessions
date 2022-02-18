package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// System.out.println(a==b);
		// boolean flag = false;
		if (a == b) {
			System.out.println("a is eq to b");
		} else {
			System.out.println("a is not eq to b");
		}
		String s = "Hello";
		String t = "heLLo";
		if (s.equalsIgnoreCase(t)) {
			System.out.println("s equals t");
		} else {
			System.out.println("s does not eq t");
		}
		int total = 90;
		if (total < 100) {
			if (total < 90) {
				System.out.println("no is below 80");
			} else {
				System.out.println("no is more than 80");
			}
		}
		String browser = "chrome ";
		if ((browser.trim().equalsIgnoreCase("Chrome"))) {
			System.out.println("Launch Chrome");
		} else if (browser.equals("ff")) {
			System.out.println("Launch ff");
		} else {
			System.out.println("Launch the right browser");
		}
		String browser1 = "Ch ROme ";
		switch (browser1.toUpperCase().replace(" ", "")) {
		case "CHROME":
			System.out.println("launch chrome");
			break;
		case "ff":
			System.out.println("launch ff");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		default:
			System.out.println("lauch right browser");
			break;
		}

	}

}
