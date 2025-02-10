import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}