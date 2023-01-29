package InheritanceChallenge1;

public class Main {
    
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11 Nov 1985",
        572185, "1 Jan 2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = $" + tim.collectPay());
        System.out.println("");

        
        SalariedEmployee ridz = new SalariedEmployee("Ridz", 
        "4 June 1994", 572183, 
        "16 June 2019", 60000);
        System.out.println(ridz);
        System.out.println("Age is " + ridz.getAge());
        System.out.println("Pay is $" + ridz.collectPay());
        ridz.retire();
        System.out.println("Pension check = $" + ridz.collectPay());
        System.out.println("");

        HourlyEmployee mary = new HourlyEmployee("Mary", "5 Jun 1985", 
        579845, "15 Jan 1999", 15);
        System.out.println(mary);
        System.out.println("Pay is $" + mary.collectPay());
        System.out.println("Holiday pay is $" + mary.getDoublePay());

    } // End of main
}
