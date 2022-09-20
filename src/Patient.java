import java.util.Scanner;

// Patient is a simple class that inherits from Person.
public class Patient extends Person{
    //Fields
    String doctor;
    //Constructor
    public Patient(String name,int age,String doctor){
        super(name, age);
        this.doctor = doctor;
    }
    //Creating a toString method for our objects in Main class
    @Override
    public String toString() {
        return ("Patient: " + name + ", Age: " + age + ", Treated by: " + this.doctor +".");
    }
}

