
public class Q1 {
	public static void main(String[] args) {
		int n = -4,i=0,count=0;
		while(i < 32) {
			count += (n & 1);
			n >>= 1;
		i++;
		}
		System.out.println("Count:" + count);
	}
}
