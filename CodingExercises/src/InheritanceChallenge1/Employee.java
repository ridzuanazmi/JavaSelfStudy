package InheritanceChallenge1;

public class Employee extends Worker{
    
    // Fields of Employee class
    private long employeeid;
    private String hireDate;
    

    // Constructors of Employee class
    public Employee() {
        
    }

    public Employee(String name, String birthDate, long employeeid, String hireDate) {
        super(name, birthDate);
        this.employeeid = employeeid;
        this.hireDate = hireDate;
    }

    public Employee(String name, String birthDate, String endDate, long employeeid, String hireDate) {
        super(name, birthDate);
        this.employeeid = employeeid;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + "  Employee [employeeid = " + employeeid + 
        ", hireDate = " + hireDate + "]";
    }

        

} // End of Employee class

/*
public class SalariedEmployee extends Employee {
    // Cannot implement 2 class in the same file
}
*/
