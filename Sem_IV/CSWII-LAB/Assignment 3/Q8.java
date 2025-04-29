package Assignment_3;
import java.util.Scanner;
import java.util.Scanner;

public class CustomCheckedDemo {
    public static void validatePositive(int number) throws CustomCheckedException {
        if (number < 0) {
            throw new CustomCheckedException("Number cannot be negative: " + number);
        } else {
            System.out.println("✅ Number is valid: " + number);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        try {
            validatePositive(num); 
        } catch (CustomCheckedException e) {
            System.err.println(e.getMessage());
        }
    }
}
