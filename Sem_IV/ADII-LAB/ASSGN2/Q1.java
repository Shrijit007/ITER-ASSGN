package ASSGN2;

public class Q1 {

    public static int bruteForceSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        
        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                System.out.println("Pattern found at index: " + i);
                return i;  
            }
        }
        
        System.out.println("Pattern not found");
        return -1;  
    }
    
    public static void main(String[] args) {
        String text = "ABAAABCDBBABCDDEBCABC";
        String pattern = "ABC";
        
        bruteForceSearch(text, pattern);
    }
}