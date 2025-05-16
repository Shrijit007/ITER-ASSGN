// Demonstrates concurrent execution using two threads:
// 1. Calculates and prints the sum of the first 100 natural numbers.
// 2. Displays the multiplication table of a given number.

package Assignment_8;

public class Q1 {
    public static void main(String[] args) {
        Thread01 t1 = new Thread01();
        Thread02 t2 = new Thread02(5);
        t1.start();
        t2.start();
    }
}

class Thread01 extends Thread{
    private int sum = 0;
    public void run(){
        for(int i = 1; i <= 100; i++){
            System.out.println(sum += i);
        }
    }
}

class Thread02 extends Thread{
    private int num;
    public Thread02(int n){
        this.num = n;
    }
    public void run(){
        int n = num;
        for(int i = 1; i <= 10; i++){
            System.out.println(n+" x "+i+" = "+num);
            num += n;
        }
    }
}