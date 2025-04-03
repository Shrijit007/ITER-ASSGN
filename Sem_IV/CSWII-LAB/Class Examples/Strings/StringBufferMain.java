
public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
//		sb.append("abcdefghijklmnopqrstuvwxyz");
//		sb.append('q');
//		sb.setCharAt(3,'A');
//		System.out.println(sb.charAt(3));
//		System.out.println(sb.capacity());
		sb.append(" PI equals to ");
		sb.insert(14, 3.14).append(", and is true.");
		System.out.println(sb);
	}
}
