package BankAccountClass;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Console console = System.console();

        // Instantiate ridz object from BankAccount class
        // It will be tedious to set up multiple accounts and have to declare the fields individually line by line
        // Another way is to use construcctors
        // Account ridz = new Account(); //This declaration calls on the implicit constructor of Account() if not declared in Account class
        Account ridz = new Account("12345", "9456 3694", 5000.0, "Ridzuan Azmi", 
        "ridzuan@myemail.com"); // This declaration calls on Account() constructor with parameters

        // ridz.setAccountNumber("12345");
        // ridz.setAccountBalance(1000.0);
        // ridz.setCustomerName("Ridzuan Azmi"); 
        // ridz.setAccountNumber("ridzuanazmi.11@gmail.com");
        // ridz.setCustomerPhoneNumber("9456 3694");

        // String email = console.readLine("Please enter your email address: ");
        // ridz.setCustomerEmail(email);
        // String aN = console.readLine("Please set your account number: ");
        // int accountNumber = Integer.parseInt(aN);
        // ridz.setAccountNumber(accountNumber);
        // System.out.println("Your email address is " + ridz.getCustomerEmail() + 
        // "\nYour account number is " + ridz.getAccountNumber());

        ridz.withdrawFunds(500.0);
        ridz.depositFunds(1000 );
        
    } // End of main
    
}
