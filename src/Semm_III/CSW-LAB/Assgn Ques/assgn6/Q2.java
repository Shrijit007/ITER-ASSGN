
public class Q2 {
	public static void main(String[] args) {
		int n = -4,i=0,count=0;
		while(i < 32) {
			count += (n&1);
			n >>= 1;
		i++;
		}
		System.out.println(count);
		if((count&1)==1)
			System.out.println("Odd parity(1)");
		else
			System.out.println("Even parity(0)");
	}
}
