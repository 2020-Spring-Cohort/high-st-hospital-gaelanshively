package main;

public class Doctor extends MedicalStaff
        //implements MedicalStaff.drawBlood
{
    public Doctor(String employeeName, double employeeSalary, int employeeIdentification, String employeePosition) {
        super(employeeName, employeeSalary, employeeIdentification, employeePosition);
    }
}
