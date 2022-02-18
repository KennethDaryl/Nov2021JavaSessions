package OOP_Interface;

public class FortisHospital extends UHNG implements USMedical, UKMedical, IndianMedical {

	@Override
	public void physioServices() {
		System.out.println("FH----phsio");

	}

	@Override
	public void cardioServices() {
		System.out.println("FH----cardio");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH----oncology");
	}

	@Override
	public void radiologyServices() {
		System.out.println("FH----radiology");
	}

	@Override
	public void entServices() {
		System.out.println("FH----ent");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH----dental");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH----pedia");
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH----emergency");
	}

	public void medicalTraining() {
		System.out.println("FH----medicalTraining");
	}

	public void medicalInsurance() {
		System.out.println("FH----medicalInsurance");
	}

	@Override
	public void medicalFunds() {
		System.out.println("FH-----medical funds");

	}

	@Override
	public void medicalFunds(int fee) {
		System.out.println("FH-----medical funds: " + fee);
	}

	@Override
	public void covidTest() {
		System.out.println("FH---covidtest");
	}

	@Override
	public void vaccination() {
		System.out.println("FH---vaccination");

	}

	@Override
	public void covidReport(String version) {
		System.out.println("FH---covidReport: " + version);

	}
}
