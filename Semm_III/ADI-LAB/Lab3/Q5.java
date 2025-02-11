import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("GCD OF "+a+ " & "+b+":"+gcd(a,b));
		
	}
	
	public static int gcd(int a,int b) {
		if(b==0) return a;
		else return gcd(b, a%b);
	}
}
