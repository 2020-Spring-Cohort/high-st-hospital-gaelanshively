package main;

public class HospitalPatient {
    private String patientName;
    private int patientHealth;
    private int patientBlood;


    public HospitalPatient(String patientName, int patientHealth, int patientBlood) {
        this.patientName = patientName;
        this.patientHealth = patientHealth;
        this.patientBlood = patientBlood;
    }

    public String getPatientName() {
        return patientName;
    }

    @Override
    public String toString() {
        return patientName + ": \n"
                + "     Patient Health: " + patientHealth
                + "\n     Blood Level: " + patientBlood;
    }
}
