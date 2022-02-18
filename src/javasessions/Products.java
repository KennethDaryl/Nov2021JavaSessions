package javasessions;

import java.util.ArrayList;

public class Products {
	/*
	 * Method concept Method name: getProductList of array list with return type
	 */
	public ArrayList<String> getProductList(String compName) {
		System.out.println("Company name: " + compName);
		ArrayList<String> prodlist = new ArrayList<String>();
		switch (compName) {
		case "Flipkart":
			prodlist.add("Macbook");
			prodlist.add("Earphones");
			prodlist.add("iPhone");
			break;
		case "Amazon":
			prodlist.add("nike");
			prodlist.add("Reebok");
			break;
		case "Walmart":
			prodlist.add("Tommy Hilfiger");
			prodlist.add("Calvin Klein");
			prodlist.add("Gucci");
			prodlist.add("Prada");
			prodlist.add("Louis Vittion");
			break;
		default:
			System.out.println("Company name not found: " + compName);
			break;
		}
		return prodlist;
	}

	public static void main(String[] args) {
		Products pr = new Products();
		ArrayList<String> productlist = pr.getProductList("Walmart");
		// System.out.println(productlist);
//		for (int i = 0; i < productlist.size(); i++) {
//			System.out.println(productlist.get(i));
//		}
		for(Object e:productlist) {
			System.out.println(e);
		}
		System.out.println(productlist.size());
	}

}
