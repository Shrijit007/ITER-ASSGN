import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        int rev = reverse(n);
        return n == rev;
    }
    public static int reverse(int n){
        int sign = (n >= 0)? 1 : -1;
        n = Math.abs(n);
        int ans = 0;
        while (n > 0){
            ans = (ans*10) + (n%10);
            n /= 10;
        }
        return sign*ans;
    }
}