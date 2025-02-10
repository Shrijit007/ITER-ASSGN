import java.util.*;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter operation: ");
		String s = sc.nextLine();
		int ans = calc(s);
		if(ans== Integer.MAX_VALUE) System.out.println("Invalid Operation.");
		else System.out.println("Result: " + ans);
	}
	
	public static int calc(String s) {
		int n1,n2;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch < 48 || ch > 57){
				n1 = Integer.parseInt(s.substring(0, i));
				n2 = Integer.parseInt(s.substring(i+1, s.length()));
				if(ch=='+') return n1 + n2;
				if(ch=='-') return n1 - n2;
				if(ch=='*') return n1 * n2;
				if(ch=='/') return n1 / n2;
			}
		}
		return Integer.MAX_VALUE;
	}
}
