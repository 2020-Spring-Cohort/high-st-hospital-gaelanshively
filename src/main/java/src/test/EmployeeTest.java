package test;

import main.Hospital;
import main.HospitalEmployee;
import main.HospitalPatient;
import main.MedicalStaff;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class EmployeeTest {
    private HospitalEmployee employeeInstance;
    private Hospital hospitalInstance = new Hospital();
    private MedicalStaff medicalStaffInstance;
    private HospitalPatient patientInstance;


    @BeforeEach
    void setUp() {
        employeeInstance = new HospitalEmployee("Name", 450.00, 80085, "Unemployed");
        hospitalInstance.addEmployeeToHospitalMap(employeeInstance);
        medicalStaffInstance = new MedicalStaff("Carlos", 900.00, 8008135, "Pig Farmer");
        hospitalInstance.addEmployeeToHospitalMap(medicalStaffInstance);
        patientInstance = new HospitalPatient("Frankfurt", 1, 25);
        hospitalInstance.addPatientToHospitalMap(patientInstance);

    }

    @Test
    public void shouldHaveEmployeeNames() {
        HashMap<String, HospitalEmployee> employeeHashMap = hospitalInstance.getMapOfEmployees();


        Assertions.assertEquals("Name", employeeInstance.getEmployeeName());


    }

    @Test
    public void shouldHaveEmployeeSalary() {
        HashMap<String, HospitalEmployee> employeeHashMap = hospitalInstance.getMapOfEmployees();

        Assertions.assertEquals(450.00, employeeInstance.getEmployeeSalary());


    }

    @Test
    public void shouldHaveEmployeeID() {
        HashMap<String, HospitalEmployee> employeeHashMap = hospitalInstance.getMapOfEmployees();
        Assertions.assertEquals(80085, employeeInstance.getEmployeeIDNumber());
    }

    @Test
    public void employeeShouldHaveJobTitles() {
        HashMap<String, HospitalEmployee> employeeHashMap = hospitalInstance.getMapOfEmployees();


        Assertions.assertEquals("Unemployed", employeeInstance.getEmployeePosition());
        System.out.println("Job title: " + employeeInstance.getEmployeePosition());

    }

    @Test
    public void medStaffShouldHaveNames() {
        HashMap<String, HospitalEmployee> employeeHashMap = hospitalInstance.getMapOfEmployees();

        Assertions.assertEquals("Carlos", medicalStaffInstance.getEmployeeName());
        System.out.println(medicalStaffInstance.getEmployeeName());
        System.out.println(employeeInstance.getEmployeeName());
    }

    @Test
    public void patientsShouldHaveNames() {
        HashMap<String, HospitalPatient> patientHashMap = hospitalInstance.getMapOfPatients();

        Assertions.assertEquals("Frankfurt", patientInstance.getPatientName());
    }

    @Test
    public void askingForDutyRosterShouldShowStaff() {
        hospitalInstance.showDutyRoster();
    }

    @Test
    public void askingForPatientListShouldShowAllPatients() {
        hospitalInstance.showAllPatients();
    }

    @Test
    public void getPatientBloodShouldGetMeSomeBlood() {
        Assertions.assertEquals(25, patientInstance.getPatientBlood());
    }
}


