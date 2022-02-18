package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Kenneth");
		e1.setAge(28);
		e1.setSal(6.44);
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSal());
		e1.setAge(29);
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSal());

	}

}
