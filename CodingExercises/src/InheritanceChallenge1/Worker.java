package InheritanceChallenge1;

import java.util.Arrays;

public class Worker {
    
    // Fields for Worker class
    private String name;
    private String birthDate;
    protected String endDate;

    // Constructors Worker class
    public Worker () {
        
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Mehthods/Behaviours of Worker class
    protected int getAge() {
        String[] arrBirthDate = birthDate.split(" ", 3);
        int birthYear = Integer.parseInt(arrBirthDate[2]);
        return 2023 - birthYear;
    }

    protected double collectPay() {
        return 0.0;
    }

    protected void terminate(String endString) {
        System.out.println("Your last day is " + endString);
    }

    @Override
    public String toString() {
        return "Worker [name = " + name + ", birthDate = " + 
        birthDate + ", endDate = " + endDate + "]";
    }

      
    
}// End of Worker class
