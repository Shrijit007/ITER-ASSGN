// Using the Java Date and Time API, write a Java program to perform the following
// tasks:
// Retrieve and display the current date and time.
// Calculate the date that is 2 weeks from today.
// Format and display the current date in the "MM/dd/yyyy" format.

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Q7 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Current:"+now+" "+time);
        System.out.println("2 Weeks Later:"+ now.plusWeeks(2));
        System.out.println("Formatted:"+now.format(formatter));
    }
}