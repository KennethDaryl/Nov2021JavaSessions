package javasessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysListConcept2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kenneth");
		names.add("Daryl");
		names.add("Mendonsa");
		//System.out.println(names.get(2));
		System.out.println(names);
		// sort and reverse order
		Collections.sort(names);
		System.out.println(names);
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);
		System.out.println(names.size());
		for (int i = names.size() - 1; i >= 0; i--) {
			System.out.println(names.get(i));
		}
	}

}
