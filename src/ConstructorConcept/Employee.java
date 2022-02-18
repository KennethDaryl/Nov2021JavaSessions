package ConstructorConcept;

import java.util.ArrayList;

public class Employee {
	// Call cnstructor from Users class having ArrayList

	public static void main(String[] args) {
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("id card");
		empList.add("credentials");
		Users u1 = new Users("Kenneth", 200, empList);
		System.out.println(u1.name + " " + u1.empId + " " + u1.userList);

	}

}
