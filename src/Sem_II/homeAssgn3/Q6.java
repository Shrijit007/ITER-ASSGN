//Write a recursive Java method that determines if a string s is a palindrome, that is, it is
//equal to its reverse.

package Sem_II.homeAssgn3;
public class Q6 {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));
        return false;
    }
    public static void main(String[] args) {
        String palindrome1 = "racecar";
        String palindrome2 = "gohangasalamiimalasagnahog";
        String nonPalindrome = "hello";

        System.out.println(palindrome1 + " is a palindrome: " + isPalindrome(palindrome1));
        System.out.println(palindrome2 + " is a palindrome: " + isPalindrome(palindrome2));
        System.out.println(nonPalindrome + " is a palindrome: " + isPalindrome(nonPalindrome));
    }
}
