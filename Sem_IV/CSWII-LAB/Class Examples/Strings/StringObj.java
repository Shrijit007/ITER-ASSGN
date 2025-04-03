
public class StringObj {
	public static void main(String[] args) {
		String s1 = new String("ITER");
		String s2 = s1.toString();
		String s3 = s1.toUpperCase();
		String s4 = s1.toLowerCase();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
	}
}
