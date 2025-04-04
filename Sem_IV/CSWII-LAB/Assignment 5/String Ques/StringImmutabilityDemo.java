//Q2

public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println("Original String: " + s1);
        
        String s2 = s1.concat(", World!");
        System.out.println("Modified String: " + s2);
        System.out.println("Original String remains unchanged: " + s1);
        
        System.out.println("String as CharSequence:");
        CharSequence cs = "CharSequence";
        System.out.println("Charsequence[4]: " + cs.charAt(4));
        System.out.println("CharSequence length: " + cs.length());
        
        CharSequence ncs = cs.subSequence(4, 12); 
        System.out.println("Extracted Subsequence: " + ncs);
        System.out.println("Original CharSequence remains unchanged: " + cs);
    }
}
