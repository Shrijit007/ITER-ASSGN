import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Sum of "+n+" numbers: "+sum(n));
	}

	public static int sum(int n) {
		if(n==1) return 1;
		else return n+sum(n-1);
	}
}
