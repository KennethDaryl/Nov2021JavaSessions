package HashMap_Concept;

import java.util.HashMap;

public class Product {

	public static void main(String[] args) {
		HashMap<Integer, String> prod = new HashMap<Integer, String>();
		prod.put(8, "aaasss");
		prod.put(1, "Keith");
		prod.put(2, "Kenneth");
		prod.put(3, "kinski");
		prod.put(5, "abc");
		prod.put(7, "bcds");
		System.out.println(prod.size());
		prod.forEach((k, v) -> System.out.println(k + ":" + v));
	}

}
