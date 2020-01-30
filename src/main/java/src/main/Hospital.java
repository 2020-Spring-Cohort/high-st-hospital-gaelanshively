package main;

import java.util.HashMap;

public class Hospital {

    private HashMap<String, HospitalEmployee> mapOfEmployees = new HashMap<>();

    public HashMap<String, HospitalEmployee> getMapOfEmployees() {
        return mapOfEmployees;
    }

    private HashMap<String, HospitalPatient> mapOfPatients = new HashMap<>();

    public HashMap<String, HospitalPatient> getMapOfPatients() {
        return mapOfPatients;
    }

    public void addEmployeeToHospitalMap(HospitalEmployee employee) {
        getMapOfEmployees().put(employee.getEmployeeName(), employee);
    }

    public void addPatientToHospitalMap(HospitalPatient patient) {
        getMapOfPatients().put(patient.getPatientName(), patient);
    }
}
