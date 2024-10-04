import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial of n number: "+facto(n));
	}

	public static int facto(int n) {
		if(n<=1) return 1;
		else return n*facto(n-1);
	}
}
