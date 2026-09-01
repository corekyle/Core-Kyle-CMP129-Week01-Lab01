import java.util.Scanner;

public class BoxOffice 
{   // START OF CLASS

    // Create scanner object to read user input
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {   // START OF MAIN

        // Declare variables
        String movieName = "";

        double adultTicketPrice = 10.00;
        double childTicketPrice = 6.00;

        int numAdultTickets;
        int numChildTickets;

        double grossBoxOffice;
        double netBoxOffice;
        double distributorPayment;

        // Get input from user
        System.out.print("Enter movie name: "); // Ask user for movie name
        movieName = keyboard.nextLine();    // Read user input for movie name
//        System.out.println(movieName);  // Display input for testing

        System.out.print("How many adult tickets were sold?: ");    // Ask the user how many adult tickets were sold.
        numAdultTickets = keyboard.nextInt();   // Read user input for the number of adult tickets sold
//        System.out.println(numAdultTickets);    // Display input for testing

        while(numAdultTickets < 0)  // While loop for input validation
        {   // START OF WHILE
            System.out.print("Invalid input. Enter a valid number: ");
            numAdultTickets = keyboard.nextInt();
        }   // END OF WHILE

        System.out.print("How many child tickets were sold: "); // Ask the user how many child tickets were sold
        numChildTickets = keyboard.nextInt();   // Read user input for the number of child tickets sold
//        System.out.println(numChildTickets);    // Display input for testing

        while(numChildTickets < 0)  // While loop for input validation
        {   // START OF WHILE
            System.out.print("Invalid input. Enter a valid number: ");
            numChildTickets = keyboard.nextInt();
        }   // END OF WHILE

        // Calculate Results
        grossBoxOffice = ((numAdultTickets * adultTicketPrice) + (numChildTickets * childTicketPrice));  // Calculate the gross box office profit
//        System.out.println(grossBoxOffice); // Display grossBoxOffice for testing

        netBoxOffice = grossBoxOffice * 0.2;    // Calculate the net box office profit
//        System.out.println(netBoxOffice);   // Display netBoxOffice for testing

        distributorPayment = grossBoxOffice - netBoxOffice; // Calculate the payment to be made to the distributor
//        System.out.println(distributorPayment); // Display distributorPayment for testing

        // Display results
        System.out.printf("\n" +
                          "----------------------------------\n" +
                          "Movie Name: %s\n" +
                          "Adult Tickets Sold: %,d\n" +
                          "Child Tickets Sold: %,d\n" +
                          "Gross Box Office Profit: $%,.2f\n" +
                          "Net Box Office Profit: $%,.2f\n" +
                          "Amount Paid to Distributor: $%,.2f\n" +
                          "----------------------------------\n" , movieName, numAdultTickets, numChildTickets, grossBoxOffice, netBoxOffice, distributorPayment);

    }   // END OF MAIN
    
    
}   // END OF CLASS
