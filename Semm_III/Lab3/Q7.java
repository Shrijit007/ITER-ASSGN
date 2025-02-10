import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Power of "+x+"^"+n+" : "+power(x,n));
	}

	public static int power(int x,int n) {
		if(n==0) return 1;
		else return x*power(x, n-1);
	}
}
