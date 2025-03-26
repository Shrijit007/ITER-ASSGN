package Assignment_3;
import java.util.Scanner;

//Custom checked exception class
class CustomCheckedException extends RuntimeException {
 public CustomCheckedException(String message) {
     super(message);
 }
}

public class Q8 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     try {
         System.out.print("Enter a positive number: ");
         int number = sc.nextInt();
         
         if (number <= 0) {
             throw new CustomCheckedException("Invalid input: Number must be positive!");
         }
         
         System.out.println("You entered a valid number: " + number);
     } catch (CustomCheckedException e) {
         System.out.println( e.getMessage());
     }
 }
}
