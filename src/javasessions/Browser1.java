package javasessions;

public class Browser1 {
	/**
	 * MethodConcept1 Launch a browser input parameter: name(String):chrome/FF/SF/IE
	 * return: type boolean just to check whether browser is launching
	 */
	public boolean launchBrowser(String name) {
		System.out.println("browser name is: " + name);
		if (name.equalsIgnoreCase("Chrome")) {
			System.out.println("Launch Chrome");
			return true;
		} else if (name.equalsIgnoreCase("Firefox")) {
			System.out.println("Launch Firefox");
			return true;
		} else if (name.equalsIgnoreCase("Safari")) {
			System.out.println("Launch Safari");
			return true;
		} else if (name.equalsIgnoreCase("IE")) {
			System.out.println("Launch IE");
			return true;
		} else {
			System.out.println("Launch the right browser");
			return false;
		}
	}

	public static void main(String[] args) {
		Browser1 br = new Browser1();
		if(br.launchBrowser("SAFARI")) {
			System.out.println("browser is launching..");
		}
		else {
			System.out.println("browser is not launching..");
		}

	}

}
