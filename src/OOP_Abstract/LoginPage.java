package OOP_Abstract;

public class LoginPage extends Page {
	// constructor
	public LoginPage() {
		System.out.println("Default LP constructor");
	}

	public LoginPage(int i) {
		System.out.println("1 parameter LP constructor" + i);
	}

	@Override
	public void title() {
		System.out.println("Login page----title");
	}

	@Override
	public void url() {
		System.out.println("Login page----url");
	}

	@Override
	public void doLogin(String un, String pwd) {
		System.out.println("Page----username : password:- " + un + " " + pwd);
	}

	public void forgotPassword() {
		System.out.println("Login page-----Forgot Password");
	}

	@Override
	public void javascriptloading() {
		System.out.println("LP----javascript loading");

	}
}
