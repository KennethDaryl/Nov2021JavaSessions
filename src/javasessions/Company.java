package javasessions;

import java.util.Arrays;

public class Company {
	/*
	 * Method concept: getCompInfo method parameter: compName (String) return type:
	 * comp name, city, 1000, package, person name - static array
	 */
	public Object[] getCompInfo(String compName) {
		System.out.println("Company name: " + compName);
		Object info[] = new Object[5];
		if (compName.equals("IBM")) {
			info[0] = "IBM";
			info[1] = "Bangalore";
			info[2] = 1000;
			info[3] = 5.5;
			info[4] = "Kenneth";
		} else if (compName.equals("Capgemini")) {
			info[0] = "Capgemini";
			info[1] = "Pune";
			info[2] = 2000;
			info[3] = 7.5;
			info[4] = "Supriya";
		} else {
			System.out.println("Company name not found");
		}
		return info;
	}

	public static void main(String[] args) {
		Company obj = new Company();
		Object comp[] = obj.getCompInfo("Capgemini");
		System.out.println(Arrays.toString(comp));
	}

}
