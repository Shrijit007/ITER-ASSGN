package Assignment_3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the number:");
			int num = sc.nextInt();
			if (num < 0) {
				throw new ArithmeticException("ArithmeticException:Cannot calculate the square root of negative number.");
			}
			System.out.println("Square root of " + num + " is:" + Math.sqrt(num));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
