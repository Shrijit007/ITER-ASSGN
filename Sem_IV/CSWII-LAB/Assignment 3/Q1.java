package Assignment_3;

import java.util.Scanner;

//Question-1
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an alpha-numeric string:");
            String str = sc.nextLine();
            String num = "";
            if (str == null || str.isEmpty()) {
                throw new NullPointerException("NullPointerException: String cannot be null or empty.");
            }
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    num += str.charAt(i);
                }
            }
            if (num.length() == 0) {
                System.out.println("No numeric characters are present.");
                return;
            }
            System.out.println("Numeric String is: " + num);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}
