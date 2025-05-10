// Write a Java program to calculate the simple interest on a current account using the
// Java Date and Time API. The program should prompt the user to enter the start date
// and the initial amount. Assume the rate of interest is 8% per annum. Calculate the
// number of days between the start date and the current date, then compute the interest
// using the simple interest formula. Finally, display the total amount after adding the
// interest to the initial amount.

import java.time.LocalDate;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter start date (YYYY-MM-DD):");
        LocalDate start = LocalDate.parse(sc.nextLine());

        System.out.println("Enter initial amount:");
        double amount = sc.nextDouble();

        long days = LocalDate.now().toEpochDay() - start.toEpochDay(); // manually calculate days

        double interest = (amount * 8 * days) / (100 * 365);
        double total = amount + interest;

        System.out.printf("Total Amount: ₹%.2f%n", total);
    }
}
