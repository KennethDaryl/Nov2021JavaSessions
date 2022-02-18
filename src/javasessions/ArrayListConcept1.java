package javasessions;

import java.util.ArrayList;

public class ArrayListConcept1 {
	public static void main(String args[]) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(42);
		marks.add(45);
		marks.add(90);
		System.out.println(marks.size());
		marks.add(92);
		System.out.println(marks.size());
		marks.add(0, 90);
		marks.add(1, 90);
		marks.add(3, 90);
//		marks.set(4, 50);
		System.out.println(marks);
		System.out.println(marks.size());
		System.out.println("----------");
		marks.remove(2);
		System.out.println(marks);
		marks.remove(4);
//		System.out.println(marks.size());
//		for(int i=0;i<marks.size();i++) {
//			System.out.println(marks.get(i));
//		}
		System.out.println(marks);
		System.out.println("-----------");
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Kenneth");
		empData.add(28);
		empData.add('M');
		empData.add(true);
		empData.add(2.444444f);
		for(int i=0;i<empData.size();i++) {
			System.out.println(empData.get(i));
		}
		System.out.println("------");
		for(Object e:empData) {
			System.out.println(e);
			if(e.equals(true)) {
				System.out.println("It means active");
			}
		}
		System.out.println("-------------");
		System.out.println(empData);
	}
}
