import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("nth Fibbonacci number: "+fib(n));
	}
	
	public static int fib(int n) {
		if(n==1) return 0;
		if(n==2) return 1;
		else return fib(n-1)+fib(n-2);
	}
}
