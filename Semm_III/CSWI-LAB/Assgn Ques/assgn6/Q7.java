
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(power(x,y));
    }
    public static int power(int x,int y){
        int ans = 1;
        while (y > 0){
            if((y&1) == 1){
                ans = multiplication(ans,x);
            }
            x = multiplication(x,x);
            y >>= 1;
        }
        return ans;
    }
    public static int multiplication(int x,int y){
        int ans = 0;
        int sign = 1; // To get result of two negative numbers
        if((x<0 && y>0) || (x>0 && y<0)){
            sign = -1;
        }
        x = Math.abs(x);
        y = Math.abs(y);
        while (y > 0){
            if((y&1) == 1){
                ans = bitwiseAdd(ans,x);
            }
            x <<= 1;
            y >>= 1;
        }
        return (sign == -1)? bitwiseAdd(~ans,1) : ans;
    }
    public static int bitwiseAdd(int a,int b){
        while (b != 0){
            int carry = a&b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
