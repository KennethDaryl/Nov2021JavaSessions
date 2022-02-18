package javasessions;

import java.util.ArrayList;

public class ArraylistConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList(20);
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add("Kenneth");
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		System.out.println(ar.get(3));
		ar.add(4, 2000);
		ar.add(5, "Keith");
		ar.add(6, "Suup");
		ar.remove(5);
		//ar.add(9, 11111);
		System.out.println(ar.get(4));
		System.out.println("-------");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		//System.out.println(ar.get(-1));
		System.out.println(ar.size());
		//System.out.println(ar.get(6));
		ar.add(4, "Joel");
		System.out.println(ar.get(4));

	}

}
