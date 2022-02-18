package OOP_Abstract;

public class LoginPageTest {

	public static void main(String[] args) {
		Page p = new LoginPage();
		p.calculatePrice();
		p.doLogin("admin", "admin123");
		p.title();
		p.url();
		Page.logo();
		p.loading();

		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.doLogin("admin", "admin1234");
		LoginPage.logo();
		lp.calculatePrice();
		lp.forgotPassword();
		lp.loading();
		lp.javascriptloading();

	}

}
