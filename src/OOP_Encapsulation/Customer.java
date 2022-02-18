package OOP_Encapsulation;

public class Customer {
	private String name;
	private int age;
	private String city;

	public Customer(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}
	
	public void getInfo(String name, int age, String city) {
		System.out.println("Enter name :"+this.name);
		System.out.println("Enter age :"+age);
		System.out.println("Enter city :"+city);
	}

	public static void main(String[] args) {

	}

}
