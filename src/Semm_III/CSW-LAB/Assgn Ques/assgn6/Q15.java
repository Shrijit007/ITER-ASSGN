public class Q15 {
    public static void main(String[] args) {
        int cnt = 0;
        int n = 2;
        while (cnt < 100){
            if(isPrime(n)){
                System.out.println((cnt+1) + "th Prime number = " + n);
                cnt++;
            }
            n++;
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