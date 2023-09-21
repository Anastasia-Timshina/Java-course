package homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient(1);
        /*Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);*/
        patient.assignDoctor();
        patient.receiveTreatment();
    }
}
