package javasessions;

public class Student {
	/**
	 * method concept method name: get student marks input parameter: name (String)
	 * return: marks (int)
	 */
	public int getStudentMarks(String Studentname) {
		System.out.println("Getting marks for Student: " + Studentname);
		if (Studentname.equals("Kenneth")) {
			return 100;
		} else if (Studentname.equals("Keith")) {
			return 99;
		} else if (Studentname.equals("Supriya")) {
			return 92;
		} else {
			System.out.println("Please pass the correct student name");
			return -1;
		}
	}

	public static void main(String[] args) {
		Student st = new Student();
		int marks = st.getStudentMarks("Kenneth");
		System.out.println(marks);
		marks = st.getStudentMarks("Sai");
		if (marks == -1) {
			System.out.println("Don't generate the marks report");
		}
	}

}
