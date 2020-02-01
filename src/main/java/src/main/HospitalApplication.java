package main;

import java.util.Scanner;

public class HospitalApplication {
    Hospital hospital = new Hospital();


    public void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        String userCommand;
        printGreeting();
        printMainMenu();
        userCommand = scannerInput.nextLine();
        while (true) {


            switch (userCommand) {
                case "1":
                    //treat patient
                    treatPatient();
                    break;
                case "2":
                    //draw blood

                    break;
                case "3":
                    //pay employees?
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("I'm sorry, that is not a valid option.");
            }
            killDeadPatients();
        }


    }

    private void treatPatient() {
        System.out.println("Which patient would you like to treat?");
        for (HospitalPatient patient : hospital.getMapOfPatients().values()) {
            System.out.println(patient.getPatientName());
        }
    }

    private void printGreeting() {
        System.out.println("Welcome to the High St. Hospital!");
        System.out.println("You have just been hired as the new Hospital Administrator!");
        System.out.println("Let's get to work!");
    }

    private void killDeadPatients() {
        for (HospitalPatient patient : hospital.getMapOfPatients().values()) {
            if (patient.getPatientHealth() <= 0) {
                System.out.println(patient.getPatientName() + " has died.");
                System.out.println("You should have taken better care of them!");
                hospital.getMapOfPatients().remove(patient.getPatientName());
            } else if (patient.getPatientBlood() <= 0) {
                System.out.println(patient.getPatientName() + " has died.");
                System.out.println("You took way too much blood from them!");
                hospital.getMapOfPatients().remove(patient.getPatientName());
            } else if (patient.getPatientHealth() >= 50) {
                System.out.println(patient.getPatientName() + " is healthy!  They have been sent home.");
            }
        }
    }


    private void printMainMenu() {
        System.out.println("Select an option: /n" +
                "1: Treat Patients /n" +
                "2: Draw blood /n" +
                "3: Pay employees /n" +
                "4: Quit");

    }
}

