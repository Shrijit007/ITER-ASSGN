
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting and Ending of Range:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        printPrime(start,end);
    }
    public static void printPrime(int start,int end){
        System.out.println("Primes in this range are ---");
        for(int i = start ; i <= end ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
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
