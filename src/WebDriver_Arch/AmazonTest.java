package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {
		String browser = "Safari";
		WebDriver driver = null;
		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("Safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Pass the right browser");
		}
		driver.get("http://www.abc.com");
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		String url = driver.getUrl();
		System.out.println("Url is: " + url);
		driver.findElement();
		driver.findElements();
		driver.sendKeys("ken@gmail.com");
		driver.sendKeys("test123");
		driver.click();
		driver.close();
	}

}
