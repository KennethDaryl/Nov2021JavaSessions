package ConstructorConcept;

import java.util.ArrayList;

public class Users {
	String name;
	int empId;
	boolean isPrime;
	String city;
	ArrayList<String> userList;

	public Users() {
		System.out.println("Default constructor");
	}

	public Users(String name) {
		this.name = name;
		System.out.println("1 parameter constructor: " + name);
	}

	public Users(String name, int empId, boolean isPrime, String city) {
//		this.name = name;
//		this.empId = empId;
//		this.isPrime = isPrime;
//		this.city = city;
	}
	
	public Users(String name, int empId, ArrayList<String> userList) {
		this.name = name;
		this.userList = userList;
	}

	public static void main(String[] args) {
		Users obj = new Users("Kenneth");
		System.out.println(obj.name);
		Users objj = new Users();
		Users st = new Users("Keith", 2047, true, "Mangalore");
		System.out.println(st.name+" "+st.empId+" "+st.isPrime+" "+st.city);
	}

}
