package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		EcommApp e = new EcommApp();
		int id = e.login("ken@gmail.com", "ken123").search("Tommy Hilfiger shoes").search("Tommy Hilfiger", 4999)
				.clickOnProduct("Tommy Hilfiger shoes").addToCart("TH").doPayment("4222 1222 1222 2222", 909)
				.sendOrderViaEmail().generateOrder();

		System.out.println(id);

	}

}
