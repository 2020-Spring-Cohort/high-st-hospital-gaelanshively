package main;

public class MedicalStaff extends HospitalEmployee {
    //sub class of employees able to perform medical tasks


    public MedicalStaff(String employeeName, double employeeSalary, int employeeIdentification, String employeePosition) {
        super(employeeName, employeeSalary, employeeIdentification, employeePosition);

    }

    public void drawBlood() {

    }
}
