package ASSGN2;

public class Q2 {
   
   private static final int PRIME = 101;
   
   // Method to implement Rabin-Karp string matching algorithm
   public static void rabinKarpMatch(String text, String pattern) {
       int textLength = text.length();
       int patternLength = pattern.length();
       int patternHash = 0, textHash = 0, h = 1;
       boolean found = false;
       
       // Compute the hash value of pattern and first window of text
       for (int i = 0; i < patternLength - 1; i++) {
           h = (h * 256) % PRIME;
       }
       
       for (int i = 0; i < patternLength; i++) {
           patternHash = (256 * patternHash + pattern.charAt(i)) % PRIME;
           textHash = (256 * textHash + text.charAt(i)) % PRIME;
       }
       
       // Slide the pattern over text one by one
       for (int i = 0; i <= textLength - patternLength; i++) {
           if (patternHash == textHash) {
               int j;
               for (j = 0; j < patternLength; j++) {
                   if (text.charAt(i + j) != pattern.charAt(j)) {
                       break;
                   }
               }
               if (j == patternLength) {
                   System.out.println("Pattern found at index: " + i);
                   found = true;
               }
           }
           
           if (i < textLength - patternLength) {
               textHash = (256 * (textHash - text.charAt(i) * h) + text.charAt(i + patternLength)) % PRIME;
               if (textHash < 0) {
                   textHash += PRIME;
               }
           }
       }
       
       if (!found) {
           System.out.println("Pattern not found in the text.");
       }
   }
   
   public static void main(String[] args) {
       String text = "ABAAABCDBBABCDDEBCABC";
       String pattern = "ABC";
       
       System.out.println("Text: " + text);
       System.out.println("Pattern: " + pattern);
       
       rabinKarpMatch(text, pattern);
   }
}
