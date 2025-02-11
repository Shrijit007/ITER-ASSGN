import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt();
		int res = 0;
		while(b>0) {
			if((b&1)!=0)
				res+=a;
			a <<= 1;
			b >>= 1;
		}
		System.out.println(res);
		sc.close();
	}
}
