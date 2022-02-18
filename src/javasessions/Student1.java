package javasessions;

public class Student1 {
	/**
	 * method concept method name: get student marks input parameter: name (String)
	 * return: marks (int) avoiding multiple return types
	 */

	public int getStudentMarks(String Studentname) {
		System.out.println("Getting marks for Student: " + Studentname);
		int marks;
		if (Studentname.equals("Kenneth")) {
			marks = 100;
		} else if (Studentname.equals("Keith")) {
			marks = 99;
		} else if (Studentname.equals("Supriya")) {
			marks = 92;
		} else {
			System.out.println("Please pass the correct student name");
			marks = -1;
		}
		return marks;
	}

	public static void main(String[] args) {
		Student1 st = new Student1();
		int marks = st.getStudentMarks("Kenneth");
		System.out.println(marks);
		marks = st.getStudentMarks("Sai");
		if (marks == -1) {
			System.out.println("Don't generate the marks report");
		}
	}
}
