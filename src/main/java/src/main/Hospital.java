package main;

import java.util.HashMap;

public class Hospital {

    private HashMap<String, HospitalEmployee> mapOfEmployees = new HashMap<>();

    public HashMap<String, HospitalEmployee> getMapOfEmployees() {
        return mapOfEmployees;
    }

    public void addEmployeeToHospitalMap(HospitalEmployee employee) {
        getMapOfEmployees().put(employee.getEmployeeName(), employee);
    }
}
