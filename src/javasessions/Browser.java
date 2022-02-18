package javasessions;

public class Browser {
	/**
	 * MethodConcept1 Launch a browser input parameter: name(String):chrome/FF/SF/IE
	 * return: void
	 */
	public void launchBrowser(String name) {
		System.out.println("browser name is: " + name);
		if (name.equalsIgnoreCase("Chrome")) {
			System.out.println("Launch Chrome");
		} else if (name.equalsIgnoreCase("Firefox")) {
			System.out.println("Launch Firefox");
		} else if (name.equalsIgnoreCase("Safari")) {
			System.out.println("Launch Safari");
		} else if (name.equalsIgnoreCase("IE")) {
			System.out.println("Launch IE");
		} else {
			System.out.println("Launch the right browser");
		}
	}

	public static void main(String[] args) {
		Browser br = new Browser();
		br.launchBrowser("ie");

	}

}
