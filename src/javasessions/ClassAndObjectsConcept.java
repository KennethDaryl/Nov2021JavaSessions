package javasessions;

public class ClassAndObjectsConcept {
	String name;
	int age;
	String color;
	char gender;

	public static void main(String[] args) {
//		String name = "Kenneth";
//		System.out.println(name);
		ClassAndObjectsConcept c = new ClassAndObjectsConcept();
//		System.out.println(c.name);
//		System.out.println(c.age);
//		System.out.println(c.color);
//		System.out.println(c.see);
//		System.out.println("--");
		c.name = "Kenneth";
		c.age = 28;
		c.color = "brown";
		c.gender = 'M';
		System.out.println(c.name+" "+c.age+" "+c.color+" "+c.gender);
		ClassAndObjectsConcept c1 = new ClassAndObjectsConcept();
		c1.name = "Keith";
		c1.age = 22;
		c1.color = "brown";
		c1.gender = 'M';
		System.out.println(c1.name+" "+c1.age+" "+c1.color+" "+c1.gender);
	}

}
