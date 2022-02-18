package javasessions;

public class Employee {
	String name;
	int age;
	double sal;

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Sup";
		e1.age = 27;
		e1.sal = 7.22;

		Employee e2 = new Employee();
		e2.name = "Ken";
		e2.age = 28;
		e2.sal = 6.44;

		Employee e3 = new Employee();
		e3.name = "Keith";
		e3.age = 28;
		e3.sal = 12.44;
		e2=e1;
		e3=e2;
		System.out.println(e1.name + " " + e1.age + " " + e1.sal);
		System.out.println(e2.name + " " + e2.age + " " + e2.sal);
		System.out.println(e3.name + " " + e3.age + " " + e3.sal);
	}

}
