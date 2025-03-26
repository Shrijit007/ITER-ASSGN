package Assignment_3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		String input;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a numeric string input:");
			input = sc.nextLine();
			try {
				for (int i = 0; i < input.length(); i++) {
					if (!Character.isDigit(input.charAt(i))) {
						throw new NumberFormatException("NumberFormatException:Input is is not in number format.");
					}
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
				System.out.print("Again ");
				continue;
			}
		}
		int numInput = Integer.parseInt(input);
		System.out.println("Integer is:" + numInput);

	}

}
