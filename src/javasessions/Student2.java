package javasessions;

public class Student2 {
	/**
	 * method concept method name: get student marks input parameter: name (String)
	 * return: marks (int) avoiding multiple return types
	 */

	public int getStudentMarks(String Studentname) {
		System.out.println("Getting marks for Student: " + Studentname);
		int marks;
		switch (Studentname) {
		case "Kenneth":
			System.out.print(Studentname + " marks is ");
			marks = 100;
			break;
		case "Keith":
			System.out.print(Studentname + " marks is ");
			marks = 95;
			break;
		default:
			System.out.println("Please select the student from the database");
			marks = -1;
			break;
		}
		return marks;
	}

	public static void main(String[] args) {
		Student2 st = new Student2();
		int marks = st.getStudentMarks("Keith");
		System.out.println(marks);
		marks = st.getStudentMarks("Sai");
		if (marks == -1) {
			System.out.println("Don't generate the marks report");
		}
	}
}
