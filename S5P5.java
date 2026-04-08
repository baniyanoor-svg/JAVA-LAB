
class Patient {

    private int patientId;
    protected String disease;

    public Patient(int p, String d) {
        patientId = p;
        disease = d;

    }

    public int getPatientId() {
        return patientId;
    }

    public void getDetails() {
        System.out.println("pateintid:" + patientId);
        System.out.println("disease:" + disease);

    }

}

class DoctorAccess extends Patient {
    public DoctorAccess(int p, String d) {
        super(p, d);

    }

    public void showAccess() {
        System.out.println("disease(accessible):" + disease);
        System.out.println("patientid(via method):" + getPatientId());

    }
}

public class S5P5 {
    public static void main(String[] args) {
        DoctorAccess doc = new DoctorAccess(23, "thyroid");
        doc.getDetails();
        doc.showAccess();
    }

}
