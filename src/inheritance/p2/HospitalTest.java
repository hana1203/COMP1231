package inheritance.p2;

public class HospitalTest {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.work();
        Doctor doctor = new Doctor();
        doctor.work();
        Nurse nurse = new Nurse();
        nurse.work();
        Surgeon surgeon = new Surgeon();
        surgeon.work();
    }
}
