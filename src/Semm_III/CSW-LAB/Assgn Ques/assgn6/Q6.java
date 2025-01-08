import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = divide(x,y);
        System.out.println(ans);
    }
    public static int divide(int x,int y){
        int ans = 0;
        int sign = 1; // To get result of two negative numbers
        if((x<0 && y>0) || (x>0 && y<0)){
            sign = -1;
        }
        x = Math.abs(x);
        y = Math.abs(y);
        while (x >= y){
            int cnt = 0;
            while (x >= (y << cnt+1)){
                cnt++;
            }
            ans = bitwiseAdder(ans,(1<<cnt));
            x = bitwiseSubtract(x,(y << cnt));
        }
        return (sign == -1)? bitwiseAdder(~ans,1) : ans;
    }
    public static int bitwiseAdder(int a,int b){
        while (b != 0){
            int carry = a&b;
            a = a^b;
            b = carry << 1;
        }
        return a;
    }
    public static int bitwiseSubtract(int a,int b){
        while (b != 0){
            int borrow = (~a)&b;
            a = a^b;
            b = borrow << 1;
        }
        return a;
    }
}