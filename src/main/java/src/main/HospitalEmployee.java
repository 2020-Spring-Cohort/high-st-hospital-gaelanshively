package main;

public abstract class HospitalEmployee {
    // super class of all hospital employees


    private String employeeName;
    private double employeeSalary;
    private int employeeIdentification;
    private String employeePosition;

    public HospitalEmployee(String employeeName, double employeeSalary, int employeeIdentification, String employeePosition) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeIdentification = employeeIdentification;
        this.employeePosition = employeePosition;

    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    @Override
    public String toString() {
        return employeeName + ": \n"
                + "     Employee Position: " + employeePosition
                + "\n     Employee ID: " + employeeIdentification
                + "\n     Salary: " + employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeIDNumber() {
        return employeeIdentification;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }
}
