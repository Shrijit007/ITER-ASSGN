import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        countDigits(n);
    }
    public static void countDigits(int n){
        int[] freq = new int[10];
        n = Math.abs(n);
        while (n > 0){
            freq[n%10]++;
            n /= 10;
        }
        for (int i = 0 ; i < 10 ; i++){
            if(freq[i] > 0){
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }
    }
}