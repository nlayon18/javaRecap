import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input;
        //Verifying if objects are working below.
        /**
        Patient p1 = new Patient("Mark Markus",23, "Dr. Peter Mitchell");
        System.out.println(p1);
        Patient p2 = new Patient("James Jenkins",40, "Dr. Maureen O'Mara");
        System.out.println(p2);
        Patient p3 = new Patient("Luke Wilson",12, "Dr. Michelle Hooper");
        System.out.println(p3);
         **/
        ArrayList<String> ArrayList = new ArrayList<>();
      //Scanners will l8r represent patients.txt... will be done in try-catch method
        try {
            input = new Scanner(new File("C:\\Users\\Naomi Layon\\IdeaProjects\\javaRecap\\sr" +
                    "c\\patients.txt"));
            //Scanner p2 = new Scanner();

        }
        catch (FileNotFoundException e){
            System.out.println("Invalid File Path!");
            return;
        }
        System.out.println(input);

        // UPDATE: Finished "Starting Main Method" ... Need to start back off on Step 3
    }
}
