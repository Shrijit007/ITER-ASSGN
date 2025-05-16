/*  Write a Java program to create a simple calculator that performs arithmetic operations
(addition, subtraction, multiplication, division) using multiple threads. Each
arithmetic operation should be handled by a separate thread. */

package Assignment_8;

public class Q2  {
     public static void main(String[] args) {
        SumThread add = new SumThread(10, 20);
        SubThread sub = new SubThread(20, 10);
        MulThread mul = new MulThread(10, 20);
        DivThread div = new DivThread(20, 10);
        add.start();
        sub.start(); 
        mul.start();
        div.start();
     }
}

class SumThread extends Thread{
    private int a,b;
    public SumThread(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void run(){
        System.out.println(a+" + "+b+" = "+(a+b));
    }
}
class SubThread extends Thread{
    private int a,b;
    public SubThread(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void run(){
        System.out.println(a+" - "+b+" = "+(a-b));
    }
}
class MulThread extends Thread{
    private int a,b;
    public MulThread(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void run(){
        System.out.println(a+" * "+b+" = "+(a*b));
    }
}
class DivThread extends Thread{
    private int a,b;
    public DivThread(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void run(){
        if(b == 0 || a == 0){
            System.out.println("Division by zero is not allowed.");
            return;
        }
        System.out.println(a+" / "+b+" = "+(a/b));
    }
}