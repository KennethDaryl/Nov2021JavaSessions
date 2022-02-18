package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysConcept3 {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("David");
		name.add("Joseph");
		System.out.println(name);
		ArrayList<String> age = new ArrayList<String>();
		age.add("21");
		age.add("33");
		System.out.println(age);
		age.addAll(name);
		System.out.println(age);
		List<Integer> age1 = Arrays.asList(10, 20, 30, 40);
		System.out.println(age1.size());
		System.out.println(age1);
	}

}
