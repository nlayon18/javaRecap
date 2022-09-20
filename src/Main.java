import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Accessing Patient.txt file...");

        Scanner file;
        Scanner keyboard = new Scanner(System.in);
        //Verifying if objects are working below.
        /**
         Patient p1 = new Patient("Mark Markus",23, "Dr. Peter Mitchell");
         System.out.println(p1);
         Patient p2 = new Patient("James Jenkins",40, "Dr. Maureen O'Mara");
         System.out.println(p2);
         Patient p3 = new Patient("Luke Wilson",12, "Dr. Michelle Hooper");
         System.out.println(p3);
         **/
        //Scanners will l8r represent patients.txt... will be done in try-catch method
        ArrayList<Patient> patientList = new ArrayList<>();

        try {
            file = new Scanner(new File("C:\\Users\\Naomi Layon\\IdeaProjects\\javaRecap\\sr" +
                    "c\\patients.txt"));
            //Scanner p2 = new Scanner();

        } catch (FileNotFoundException e) {
            System.out.println("Invalid File Path!");
            return;
        }
        //System.out.println(file);

        // UPDATE: Finished "Starting Main Method" ... Need to start back off on Step 3

        while (file.hasNextLine()) {

            String[] splitln = file.nextLine().split(",");
            int testAge;
            try {
                testAge = Integer.parseInt(splitln[1]);
                //System.out.println(testAge);
            } catch (NumberFormatException ex) {
                continue;
            }
            Patient newPatient = new Patient(splitln[0], testAge, splitln[2]);
            patientList.add(newPatient);
        }

        while (true) {
            System.out.println("===========================");
            System.out.println("Please choose an option from the list below!");
            System.out.println();
            System.out.println("A - to list all patients \nB - to list patients under 40\n" +
                    "C - To list patients 40+\nD- Exit \n");
            String letter = keyboard.nextLine();
            switch (letter.toUpperCase()) {
                case "A" -> {
                    for (Patient patient : patientList) {
                        System.out.println(patient.toString());

                    }

                }
                case "B" -> {
                    for (Patient patient : patientList) {
                        if (patient.age <= 40) {
                            Patient under40Patients = new Patient(patient.name, patient.age, patient.doctor);
                            System.out.println(under40Patients);
                        }
                    }

                }
                case "C" -> {
                    for (Patient patient : patientList) {
                        if (patient.age > 40) {
                            Patient over40Patients = new Patient(patient.name, patient.age, patient.doctor);
                            System.out.println(over40Patients);
                        }
                    }

                }
                case "D" -> {
                    System.out.println("Exiting - Thank you for using the program :)");
                    return;
                }
                default -> System.out.println("value isn't listed please choose a b c or d");
            }
        }
            //System.out.println(Arrays.toString(patientfile));
    }
}
