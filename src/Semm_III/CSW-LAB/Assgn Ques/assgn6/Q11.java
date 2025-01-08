
public class Q11 {
	public static void main(String[] args) {
		int num = 1242324,count = 0;
		while(num!=0) {
			int n = num%10;
			num/=10;
			if((n&1)!=1) count++;
		}
		System.out.println(count);
	}
}
