package Assignment_3;
import java.util.Scanner;

class CustomNullPointerException extends NullPointerException {
    public CustomNullPointerException(String msg) {
        super(msg);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            if (str == null || str.isEmpty()) {
                throw new CustomNullPointerException("CustomNullPointerException: Input cannot be null or empty");
            }
            System.out.println("String is: " + str);
        } catch (CustomNullPointerException e) {
            System.err.println(e.getMessage());
        } 
    }
}
