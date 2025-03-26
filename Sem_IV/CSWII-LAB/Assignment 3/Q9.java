package Assignment_3;
import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        int userInput = readInteger();
        System.out.println("You entered: " + userInput);
    }

    public static int readInteger() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valid = false;
        
        while (!valid) {
            try {
                System.out.print("Enter an integer: ");
                num = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next();
            }
        }
        return num;
    }
}

