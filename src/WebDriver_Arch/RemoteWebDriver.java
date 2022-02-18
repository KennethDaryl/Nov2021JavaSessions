package WebDriver_Arch;

public class RemoteWebDriver implements WebDriver{

	@Override
	public void findElement() {
		System.out.println("findElement");
	}

	@Override
	public void findElements() {
		System.out.println("findElements");
		
	}

	@Override
	public void get(String url) {
		System.out.println("Enter url: " + url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("title");
		return "some title";
	}

	@Override
	public String getUrl() {
		System.out.println("www.abc.com");
		return "www.abc.com";
	}

	@Override
	public void click() {
		System.out.println("click on element");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Enter value: " + value);
		
	}

	@Override
	public void close() {
		System.out.println("close browser");
		
	}

}
