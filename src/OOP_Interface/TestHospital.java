package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.entServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.pediaServices();
		fh.physioServices();
		fh.oncologyServices();
		fh.radiologyServices();
		fh.medicalFunds(3500);
		fh.covidTest();
		fh.healthGuidelines();

		// Top-casting: USMEdical to FortisHospital
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.physioServices();
		us.oncologyServices();
		us.emergencyServices();
		us.medicalFunds(50);
		us.vaccination();
		
		// Top-casting: IndianMedical to FortisHospital
		IndianMedical in = new FortisHospital();
		in.dentalServices();
		in.emergencyServices();
		in.pediaServices();
		in.medicalFunds(2500);
		in.covidTest();
		
		// Top-casting: IndianMedical to FortisHospital
		UKMedical uk = new FortisHospital();
		uk.medicalFunds(444000);
		uk.vaccination();
		uk.covidReport("2.0");
		
		
	}

}
