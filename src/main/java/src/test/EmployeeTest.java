package test;

import main.Hospital;
import main.HospitalEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private HospitalEmployee employeeInstance;
    private Hospital hospitalInstance;


    @BeforeEach
    void setUp() {
        employeeInstance = new HospitalEmployee("Name", 450.00, 80085, "Unemployed");
        hospitalInstance = new Hospital();
        hospitalInstance.addEmployeeToHospitalMap(employeeInstance);
    }

    @Test
    public void shouldHaveEmployeeNames() {
        HashMap<String, HospitalEmployee> employeeHashMap = hospitalInstance.getMapOfEmployees();

        for (HospitalEmployee employeeInstance : employeeHashMap.values()) {
            assertEquals("Name", employeeInstance.getEmployeeName());
        }

    }

    @Test
    public void shouldHaveEmployeeSalary() {
        HashMap<String, HospitalEmployee> employeeHashMap = hospitalInstance.getMapOfEmployees();

        for (HospitalEmployee employeeInstance : employeeHashMap.values()) {
            assertEquals(450.00, employeeInstance.getEmployeeSalary());
            assertEquals(employeeHashMap.size(), 1);
        }
    }

    @Test
    public void shouldHaveEmployeeID() {
        HashMap<String, HospitalEmployee> employeeHashMap = hospitalInstance.getMapOfEmployees();

        for (HospitalEmployee employeeInstance : employeeHashMap.values()) {
            assertEquals(80085, employeeInstance.getEmployeeIDNumber());
        }
    }

    @Test
    public void employeeShouldHaveJobTitles() {
        HashMap<String, HospitalEmployee> employeeHashMap = hospitalInstance.getMapOfEmployees();

        for (HospitalEmployee employeeInstance : employeeHashMap.values()) {
            assertEquals("Unemployed", employeeInstance.getEmployeePosition());
            System.out.println("Job title: " + employeeInstance.getEmployeePosition());
        }
    }

}
