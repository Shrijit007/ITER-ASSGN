import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two float numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();;
        if(check(a,b)){
            System.out.println("Difference is less than epsilon");
        }else {
            System.out.println("Difference is greater than epsilon");
        }
    }
    public static boolean check(float a , float b){
        float epsilon = 0.0001f;
        float diff = Math.abs(a-b);
        return diff < epsilon;
    }
}