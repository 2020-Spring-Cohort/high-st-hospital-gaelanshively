package main;

public class HospitalPatient {
    private String patientName;
    private int patientHealth;
    private int patientBlood;
    private byte patientBloodRecovery;


    public HospitalPatient(String patientName, int patientHealth, int patientBlood, byte patientBloodRecovery) {
        this.patientName = patientName;
        this.patientHealth = patientHealth;
        this.patientBlood = patientBlood;
        this.patientBloodRecovery = patientBloodRecovery;
    }

    public HospitalPatient() {
        this.patientBloodRecovery = 2;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getPatientHealth() {
        return patientHealth;
    }

    public int getPatientBlood() {
        return patientBlood;
    }

    @Override
    public String toString() {
        return patientName + ": \n"
                + "     Patient Health: " + patientHealth
                + "\n     Blood Level: " + patientBlood;
    }

    public void tickPatient() {
        decreasePatientHealth();
        checkBloodLevels();
        determinePatientStatus();
    }

    private void checkBloodLevels() {
        if (patientBloodRecovery = 0) {
            patientBlood++;
        }
    }

    private void decreasePatientHealth() {
        patientHealth -= 5;
        if (patientHealth < 0) {
            killPatient();
        } else if (patientHealth > 100) {
            releasePatientFromHospital();
        }
    }
}
