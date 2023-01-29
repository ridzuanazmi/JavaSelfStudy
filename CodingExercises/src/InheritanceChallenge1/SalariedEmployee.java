package InheritanceChallenge1;

public class SalariedEmployee extends Employee {

    // Fields of SalariedEmployee class
    private double annualSalary;
    private boolean isRetired; // false by default

    // Constructors of SalariesEmployee
    public SalariedEmployee(double annualSalary, boolean isRetired) {
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalariedEmployee(String name, String birthDate, 
            long employeeid, String hireDate, double annualSalary) {
        super(name, birthDate, employeeid, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }


    //Methods/Behaviours of SalariedEmployee class
    protected void retire() {
        terminate("12 Dec 2025");
        isRetired = true;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 13;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }
    
} // End of SalariedEmployee class
