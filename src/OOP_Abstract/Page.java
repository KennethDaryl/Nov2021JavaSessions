package OOP_Abstract;

public abstract class Page extends WebPage implements W3C {

	// constructor
	public Page() {
		System.out.println("Default constructor");
	}

	public abstract void title();

	public abstract void url();

	public void doLogin(String un, String pwd) {
		System.out.println("Page----username : password:- " + un + " " + pwd);
	}

	public static void logo() {
		System.out.println("Page----logo");
	}

	public final void calculatePrice() {
		System.out.println("Page---calculate Price");
	}
}
