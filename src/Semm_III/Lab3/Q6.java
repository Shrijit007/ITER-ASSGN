import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Hexa representation of " + n + " : " + decToHexa(n));
	}

	public static String decToHexa(int n) {
		if (n == 0) return "0";
		char HEX[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		return decToHexa(n / 16) + HEX[n % 16];
	}
}