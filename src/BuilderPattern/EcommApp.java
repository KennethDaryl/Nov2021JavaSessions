package BuilderPattern;

public class EcommApp {
	
	private int orderId = 222222;

	public EcommApp login(String un, String pwd) {
		System.out.println("Login to app: " + un + " : " + pwd);
		return this;
	}

	public EcommApp search(String productName) {
		System.out.println("Searching the product: " + productName);
		return this;
	}

	public EcommApp search(String productName, int price) {
		System.out.println("Searching the product: " + productName + ": " + price);
		return this;
	}

	public EcommApp clickOnProduct(String productName) {
		System.out.println("Click on the product :" + productName);
		return this;
	}

	public EcommApp addToCart(String productName) {
		System.out.println("Add to Cart: " + productName);
		return this;
	}

	public EcommApp doPayment(String cc, int cvv) {
		System.out.println("Do payment: " + cc + ":" + cvv);
		return this;
	}

	public int generateOrder() {
		System.out.println("Order Id is: " + this.orderId);
		return this.orderId;
	}

	public EcommApp sendOrderViaEmail() {
		System.out.println("Send order via email: " + 12345);
		return this;
	}

	public static void main(String[] args) {

	}

}
