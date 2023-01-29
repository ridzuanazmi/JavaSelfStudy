package BankAccountClass;

public class Account {
    
    // Fields of a BankAccount class
    private String accountNumber;
    private String customerPhoneNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;

    //Constructor
    public Account() {
        this("56789", "Default phone number", 300.0, 
        "Default name", "Default email");
        System.out.println("Empty constructor called"); 
    }

    public Account(String accountNumber, String customerPhoneNumber, double accountBalance, String customerName, String customerEmail) {   
        
        System.out.println("Account() constructor with parameters called");
        this.accountNumber = accountNumber;
        this.customerPhoneNumber = customerPhoneNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

    // Setter and getters for fields
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    // Methods/Behaviours for BankAccount class
    public void depositFunds(double deposit) {
        accountBalance = this.accountBalance + deposit;
        System.out.println("Depositing $" + deposit + " current balance is $" + accountBalance);
    }

    public void withdrawFunds(double withdraw) {

        if (withdraw > accountBalance) {
            System.out.println("Unable to withdraw as withdraw amount is more that account balance");
        }else {
            accountBalance -= withdraw;
            System.out.println("Withdrawal of $" + withdraw + " current balance is $" + accountBalance);
        }

    }
    
} // End of BankAccount class
