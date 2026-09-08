import java.util.Scanner;

public class InterestEarned 
{   // START OF CLASS

    // Create scanner object to read user input
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) 
    {   // START OF MAIN

        // Declare Variables
        double principle;
        double interestRate;
        int timesCompounded;
        double interestAmount;
        double savingsAmount;

        // Get user input
        System.out.print("Enter Principal: ");
        principle = keyboard.nextDouble();
//        System.out.println(principle);  // Display input for testing

        while(principle < 0)  // While loop for input validation
        {   // START OF WHILE
            System.out.print("You cannot have a negative Principle. Please enter a valid number: ");
            principle = keyboard.nextInt();
        }   // END OF WHILE

        System.out.print("Enter Interest Rate(%): ");
        interestRate = keyboard.nextDouble();
//        System.out.println(interestRate);   // Display input for testing

        while(interestRate < 0)  // While loop for input validation
        {   // START OF WHILE
            System.out.print("You cannot have a negative Interest Rate. Please enter a valid number: ");
            interestRate = keyboard.nextInt();
        }   // END OF WHILE

        System.out.print("Times Compounded Yearly: ");
        timesCompounded = keyboard.nextInt();
//        System.out.println(timesCompounded);    // Display intput for testing

        while(timesCompounded < 0)  // While loop for input validation
        {   // START OF WHILE
            System.out.print("You cannot compound interest less than 0 times a year. Please enter a valid number: ");
            timesCompounded = keyboard.nextInt();
        }   // END OF WHILE


        // Calculate Savings Account Total
        savingsAmount = principle * Math.pow(1 + ((interestRate / 100) / timesCompounded), timesCompounded);
//        System.out.println(savingsAmount);  // Display results for testing

        interestAmount = savingsAmount - principle;
//        System.out.println(interestAmount); // Display results for testing


        // Display Results
        System.out.printf("\n" +
                          "----------------------------------\n" +
                          "Interst Rate: %,.2f%%\n" +
                          "Times Compounded: %d\n" +
                          "Principle: $%,.2f\n" +
                          "Interest: $%,.2f\n" +
                          "Amount in Savings: $%,.2f\n" +
                          "----------------------------------\n", interestRate, timesCompounded, principle, interestAmount, savingsAmount);

        
    }   // END OF MAIN
    
}   // END OF CLASS
