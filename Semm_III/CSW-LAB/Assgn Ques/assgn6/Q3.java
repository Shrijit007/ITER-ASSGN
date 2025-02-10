import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num: ");
		int n = sc.nextInt();
		System.out.print("Enter ith & jth index: ");
		int i = sc.nextInt(), j = sc.nextInt();
		if(((n>>i)&1) != ((n>>j)&1)) {
			n = (1<<i)^n;
			n = (1<<j)^n;
		} System.out.println(n);
	}
}
