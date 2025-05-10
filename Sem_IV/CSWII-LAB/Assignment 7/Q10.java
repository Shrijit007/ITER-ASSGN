// Write a Java program using the Java Date and Time API to calculate the number of
// days between two dates. The program should prompt the user to enter a start date and
// an end date (in YYYY-MM-DD format), and then display the total number of days
// between the two dates using the ChronoUnit.DAYS method.

import java.time.LocalDate;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start date (YYYY-MM-DD):");
        LocalDate start = LocalDate.parse(sc.nextLine());

        System.out.println("Enter end date (YYYY-MM-DD):");
        LocalDate end = LocalDate.parse(sc.nextLine());

        long days = end.toEpochDay() - start.toEpochDay(); // calculate days without ChronoUnit

        System.out.println("Days Between: " + days);
    }
}
