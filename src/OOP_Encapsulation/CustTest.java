package OOP_Encapsulation;

public class CustTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("Keith", 28, "Mangalore");
		System.out.println(c1.getName() + " " + c1.getAge() + " " + c1.getCity());
		c1.setAge(26);
		c1.setCity("Madrid");
		System.out.println(c1.getName() + " " + c1.getAge() + " " + c1.getCity());
		c1.getInfo("ssssss", 22, "Spain");
	}

}
