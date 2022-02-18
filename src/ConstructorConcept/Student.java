package ConstructorConcept;

public class Student {
	String name;
	int age;
	boolean status;

	public Student() {
		System.out.println("Default constructor");
	}

	public Student(String name, int age) {
		System.out.println("constructor with 2 parameters");
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, boolean status) {
		this("Keith", 28);
		this.name = name;
		this.age = age;
		this.status = status;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Kenneth", 28, true);
		System.out.println(s2.name + " " + s2.age + " " + s2.status);

	}

}
