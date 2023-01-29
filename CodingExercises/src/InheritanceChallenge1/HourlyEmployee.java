package InheritanceChallenge1;

public class HourlyEmployee extends Employee {
    
    // Field of HourlyEmployee class
    private double hourlyPayRate;

    //Constructor of HourlyEmployee
    public HourlyEmployee() {
        
    }   

    public HourlyEmployee(String name, String birthDate, long employeeid, 
    String hireDate, double hourlyPayRate) {
        super(name, birthDate, employeeid, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    // Method/Behaviour of HourlyEmployee class
    protected double getDoublePay() {
        return 2 * collectPay();
    }    

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

} // End of HourlyEmployee class
