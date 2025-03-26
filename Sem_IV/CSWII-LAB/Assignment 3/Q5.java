package Assignment_3;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.print("Enter a number:");
			String num=sc.nextLine();
			int n= Integer.parseInt(num);
			try {
				double res=100/n;
				System.out.println("Division result is:"+res);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException: Cannot divide a number with zero.");
			}
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException: Invalid entry detected.");
		}

	}

}
