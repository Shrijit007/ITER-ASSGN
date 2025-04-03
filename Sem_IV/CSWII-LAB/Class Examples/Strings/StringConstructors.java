
public class StringConstructors {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);
		
		String s2 = new String("ITER");
		System.out.println(s2);
		
		char[] ch1 = {'a','b'};
		String s3 = new String(ch1);
		System.out.println(s3);
		
		byte[] ch2 = {97,98};
		String s4 = new String(ch2);
		System.out.println(s4);
		
		char c = s2.charAt(0);
		System.out.println(c);
		
		String s = s2.concat(s4);
		s = s2+"AB";
		System.out.println(s);
		s = s.replace('T', 'Y');
		System.out.println(s);
		
		String s5 = "iter";
		System.out.println(s5.equals(s2));
		System.out.println(s5.equalsIgnoreCase(s2));
		System.out.println();
		
		String ss = "hdbidb78 97*GBV db&*#V(#IYG#";
		String[] str = ss.split("db"); 
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
